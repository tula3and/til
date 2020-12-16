## Goroutines

- `go` 여러 일을 순차적이 아닌, 병렬적으로 처리하게 한다.
- `chan` 채널을 통해 goroutines의 결과를 한 번에 받도록 처리한다.
- URL checker
  - 함수 `hitURL` `chan` 선언 시 우측에 `<-`를 붙이면 send only
    ```go
    // hitURL channel is send only
    func hitURL(url string, c chan<- requestResult) {
      resp, err := http.Get(url)
      status := "OK"
      if err != nil || resp.StatusCode >= 400 {
        status = "Failed"
      }
      c <- requestResult{url: url, status: status}
    }
    ```
  - `main` 함수
    ```go
    type requestResult struct {
      url    string
      status string
    }
    
    func main() {
      results := make(map[string]string)
      c := make(chan requestResult)
      urls := []string{
        // listing urls for checking
      }
      
      // goroutines is here
      for _, url := range urls {
        go hitURL(url, c)
      }
      
      for i := 0; i < len(urls); i++ {
        // waiting for the end of goroutines
        result := <-c
        results[result.url] = result.status
      }
      
      for url, status := range results {
        fmt.Println(url, status)
      }
    }
    ```


