JavaFX_Gradle_Archetype
=======================
Simple basic JavaFX project including:
1. Gradle support (using javafx plugin)
2. JLink enabling creation of package with or without embedded JRE
3. Simple JavaFX-scene (GridPane, Label, TextField, Button, EventListener) 


**Notes:** 
* Should be used as a start template for new JavaFX projects. 
* This is not a real archetype as Gradle is not supporting archetypes so far
* Use "run"-task to start app (within IDE)
* To start app from packages shell scripts within /bin-folder must be used
* Use "assemble"-task to create package without embedded JRE
* Use "jlink"-task to create package including JRE. **Important:** Must be started from a machine of same type as the desired target system

April, 2020


 