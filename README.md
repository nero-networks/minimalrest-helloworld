# minimalrest HelloWorld

## build and run
    
### development
Start this from a shell or your IDE.

    ./gradlew bootRun

Open http://localhost:8080 in your favourite browser.

#### continuous build
Start this in a separate shell and enjoy coding.

    ./gradlew -x test -t build
    
Hint: There is also a live reload server listening in debug mode. 

#### re-generate swagger client
Start this while the webserver is not running

    ./gradlew buildSwaggerClient 

Hint: On windows the client installer needs to be enabled. Take a look into resources/application.yml.

### release build

    ./gradlew -P release clean test bootJar
    java -jar build/libs/minimalrest-helloworld.jar
    