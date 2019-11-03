CODE CHALLENGE TOP WORDS APPLICATION:


ABOUT :
- This demo application has been created as a spring boot application.

TEST DRIVEN DEVELOPMENT (TDD) :

- Test cases are first written and then business logic is implemented.
- Please refer following test class TopWordsChallengeApplicationTest.


HOW TO TEST : (I have mentioned 2 modes of testing,please choose any mode as per your convenience).

1)Test by running the "SpringBoot application" using IDE.

a)Download the zip from the git URL.
b)Import the project to your workspace (Intellij / Eclipse)
c)Open file TopWordsChallengeApplication -> right click and run the main method,this with start the application (monitor the console).
d)Once the app is started,open following test file -> TopWordsChallengeApplicationTest
e)Now run all the test cases.


2) Test by executing jar file.

1) Download the executable jar file from google drive (com.code.challenge-1.0-SNAPSHOT.jar)
2) Navigate to the downloaded location of jar via terminal.
3) Then execute the below commands to validate the results by passing the text values.

FOR EX : Execute below command in the terminal. (please feel free to add your own test string)
java -jar "com.code.challenge-1.0-SNAPSHOT.jar" "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"



ADDITIONAL NOTES :

- @ComponentScan(basePackages = "com.code.challenge") is enabled to detect spring managed components.
- SOLID principles - Application module,Interfaces module and the Service implementation module is been created to segregate the layer.
