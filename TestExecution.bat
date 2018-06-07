set projectLocation=E:\AppiumProject\com.hrma
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\scripts.xml
pause