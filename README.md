# Bowling Game Kata Template
This is a blank maven project using Java 11, Junit 5 and the Lombok framework.  This project can be used as a quick start to the bowling kata, so that you don't have to worry about getting a Java environment up and running before you are able to start on the Kata

## The Kata
In this kata you will be making a program that can score a game of Ten Pin Bowling.

![bowling meme](https://i.imgflip.com/2uvt9q.jpg)

### Bowling Rules
The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in tenth frame.

### Requirements
Write a class `Game` that has two methods

`void roll(int)` is called each time the player rolls a ball. The argument is the number of pins knocked down.
`int score()` returns the total score for that game.

### Additional challenge (Optional)
For more of a challenge you can make up your own additional rules for the kata.  These rules can be kata related or non-kata related.
#### Kata Related Challenge Example
An addtional rule that can be attempted once the kata is complete, can you score a game of bowling that has up to 8 players?
#### Non-Kata Related Challenge Example
No Mouse Rule: Throughout the kata you cannot touch the mouse under any circumstances to help improve your knowledge of keyboard shortcuts. 
