# CHECKPOINTS

- - -

## FORMAT
- MM DD YYYY
    - What to do... \(Due date if possible\)

- - -

- May 8, 2021
    - Create a frontend \(a simple website\) to add user with the following data
        - username
        - password
        - LINE USERID
            - Add a website to add a simple tutorial to obtain the userid
        - birthdate (maybe send a "Happy birthday" message???)
        - gender
        - messages to add, delete
        - time to notify message

    - Create a database using SQL to save the following data
        - username
        - password
        - LINE USERID
        - birthdate
        - gender
        - messages to notify \(1 table per user\)
        - time to notify message

    - Create a backend to export specific data from the database into a text file and run the Python script to send message
        - Language: Java
        - data to export:
            - message
            - time
            - LINE USERID
        - Run the Python script to send message
        - remove the text file after sending the message to the user \(for safety measures\)

    - Create a backend to link the database and the website to enable the user to erase and add data
        - Language: Java
        - Framework: Spring \(probably... IDK\)

    - Create a Linebot to notify messages at a certain time to a specific user
        - Language: Python
        - export data from text file

- May 28, 2020
    - initialized project
    - added sql files to initialize database
    - added branch "testing" to add new features
        - features that have been tested will be merged into main
    - In the testing branch, anything in testing will not be launched online.
    - If you want to host your own service, using "testing" branch may be easier because of less configurations.
    - In the "main" branch, port numbers and passwords will be left as ```<port\>``` and ```<password>```