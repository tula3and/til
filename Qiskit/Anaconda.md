## Using Anaconda

- Big advantages of Anaconda
  - Easy to build and delete virtual environments
- Virtual environments
  - In Anaconda prompt, text in parentheses is name of current virtual environment.
  - Check the verison and update
    ```
    conda --version
    conda update conda
    ```
  - Make a virtual environment - `--name` or `-n`
    ```
    conda create --name <name> python=<version>
    conda create -n <name> python=<version>
    ```
  - Check a list of virtual environments
    ```
    conda info --envs
    ```
  - `activate <name>` and `deactivate <name>`
