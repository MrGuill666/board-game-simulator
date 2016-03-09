# board-game-simulator
The goal is to create a DSL capable of describing the mechanics of simple board games (like "Mills", "Snakes and Ladders") and sample applications to run the language.
The project contains 3 main parts:
* language and editor
* simulator and server application
* client application

###Softwares used for developement:
* Eclipse Mars/IntelliJ Idea
* Xtext, EMF
* Xtend
* Maven


##Language and editor
The language is described in "BGL.xtext". To make an editor, start a new Xtext project and insert the contents of "BGL.xtext".
The generated model of BGL is already included in the simulator project as a JAR file.

##Projects
###BGS
Core simulator project for running the board games. Includes:
* Game - represents a board game instance
* ModelManager - reads and manages the languages
* GameManager - manages the lifecycle of Game objects

###BGS.Server
Contains server and client communication logic using WebSockets.

###BGS.Application
Graphic (Swing) client application. Depends on BGS.Server project.
