## Git

> (For Mac, Linux) Open terminal.<br/>
> (For Windows) Open Git Bash.<br/>

- Upload files to my personal repository
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

- Get changes from Github
    ```
    git pull
    ```
- Delete a connection between local and remote
    ```
    git remote -v
    git remote remove origin
    git remote -v
    ```
- Standard workflow
    - Fork → Clone → Edit → Pull request
    - If your work has finished, don't forget `git remote remove origin`
