set projectLocation=C:\Users\addla\Maven_Project\Maven_Sele
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause