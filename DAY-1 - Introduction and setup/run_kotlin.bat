@echo off

call kotlinc Main.kt -include-runtime -d Main.jar

call java -jar Main.jar

pause

