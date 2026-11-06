# Rock Paper Scissors Game

## Project Overview
Rock Paper Scissors is a beginner-level Java console game that allows a user to play the classic Rock Paper Scissors game against the computer.

The user selects Rock, Paper, or Scissors by entering a number. The computer randomly generates its own selection, and the program compares both choices to determine the winner.

## Features
- Allows the user to select Rock, Paper, or Scissors.
- Uses random number generation to determine the computer's choice.
- Validates user input to ensure the selection is between 0 and 2.
- Determines whether the game results in a tie, a user win, or a computer win.
- Displays the game result in the console.
- Provides an error message when the user enters an invalid selection.

## Technologies Used
- Java 25
- Eclipse IDE
- Java Scanner class for user input
- Java Random class for computer selection

## Java Concepts Practiced
- Variables and data types (`int`)
- User input using the `Scanner` class
- Random number generation using the `Random` class
- Conditional statements (`if`, `else if`, and `else`)
- Logical operators (`&&` and `||`)
- Comparison operators
- Input validation
- Program flow control using `return`

## How to Run
1. Open the project in Eclipse IDE.
2. Locate the `RockPaperScissors.java` file in the `day4` package.
3. Run the program as a Java application.
4. Enter your selection when prompted:
   - 0 = Rock
   - 1 = Paper
   - 2 = Scissors
5. The computer will randomly select its choice, and the program will display the result.

## Example Usage

**Example Input:**
```text
User Please Enter Your Choice
O: Rock, 1: Paper, 2: Scissors
1
```

**Possible Output:**
```text
You Win! - Congratulations!
```

*Note: The computer's selection is random, so the outcome will vary each time the game is played.*

## Learning Objectives
This project provided hands-on practice combining user input, random number generation, input validation, and conditional logic to create a simple interactive game.

It also introduced the use of Java's `Random` class and logical operators to evaluate multiple conditions when determining the winner.
