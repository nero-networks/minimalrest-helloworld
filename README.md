# minimalrest HelloWorld

## build and run
    
### development
Start this from a shell or your IDE.

    ./gradlew bootRun

Open http://localhost:8080 in your favourite browser.

#### continuous build
Start this in a separate shell and enjoy coding.

    ./gradlew -t build
    
Hint: There is also a live reload server listening in debug mode. 

### production

    ./gradlew -P release clean bootJar
    java -jar build/libs/minimalrest-helloworld.jar
    
    