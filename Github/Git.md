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
        ```
        git clone <fork link>
        git checkout -b <add your name>
        git add <changed file>
        git commit -m "<commit message>"
        git push origin <add your name>
        ```
    - Move to repository on GitHub, click on that button `Compare & pull request`
    - If your work has finished, don't forget `git remote remove origin`
    
- Merge conflicts
    ```
    git remote add upstream <main source link>
    git pull upstream master
    ```
