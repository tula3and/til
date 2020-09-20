## Start Git

(For Mac, Linux) Open terminal.<br/>
(For Windows) Open Git Bash.<br/>

1. Move to the folder for uploading
2. Input codes below
    ```
    git init
    git status
    ```
3. Select files to upload
    ```
    git add <file name>
    git add <folder name>
    ```
4. `git config --global user.email "<email>"`
5. `git commit -m "<message>"`
6. Upload the files
    ```
    git remote add origin {repository_URL}
    git remote -v
    git push origin master
    ```
