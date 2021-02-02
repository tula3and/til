## Android

- Download [Android Studio](https://developer.android.com/studio)
- Activate [View Binding](https://developer.android.com/topic/libraries/view-binding?hl=ko)
  - Gradle Scripts → build.gradle (Module: `<project>`)
    - Under `plugins`, Add `id 'kotlin-parcelize'`
    - Under `android`, add this
      ```
      buildFeatures {
          viewBinding true
      }
      ```
  - `MainActivity.kt`
    - Add `import com.example.<project>.databinding.ActivityMainBinding`
    - Change the class `MainActivity`
      ```kt
      class MainActivity : AppCompatActivity() {
          private var mBinding: ActivityMainBinding? = null
          private val binding get() = mBinding!!

          override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
              mBinding = ActivityMainBinding.inflate(layoutInflater)
              setContentView(binding.root)
              // binding.<id>.<function>
          }

          override fun onDestroy() {
              mBinding = null
              super.onDestroy()
          }
      }
      ```

