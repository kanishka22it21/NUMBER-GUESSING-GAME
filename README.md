# NUMBER-GUESSING-GAME

---

# Overview

A simple JavaFX-based Number Guessing Game where users try to guess a randomly generated number between 1 and 100. The game provides feedback on each guess and tracks the number of attempts.

## Features

- **Random Number Generation:** The game generates a random number between 1 and 100.
- **User Input:** Users can enter their guesses through a text field.
- **Feedback Mechanism:** The game provides feedback on whether the guess is too low, too high, or correct.
- **Attempt Counter:** Tracks the number of attempts made by the user.
- **Reset Option:** Users can reset the game to start over with a new number.

## Technologies Used

- **Java:** Core language used for developing the application.
- **JavaFX:** Framework used to build the user interface.

## Installation

To run the application, follow these steps:

### Prerequisites

- **Java Development Kit (JDK):** Ensure you have JDK 8 or later installed.
- **JavaFX SDK:** Ensure JavaFX is properly set up in your environment.

### Compile and Run

Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or compile and run it directly from the command line:

```bash
javac Main.java
java Main



### File Structure
 - **Main.java:** The main Java file that contains the application logic and user interface setup.

### How to Play
 -**Start the Game:** Enter your guess (a number between 1 and 100) in the provided text field.
 -**Submit Guess:** Click the "Guess" button to see feedback.
        If your guess is too low, the game will prompt you to try a higher number.
        If your guess is too high, the game will prompt you to try a lower number.
        If you guess correctly, you'll receive a congratulatory message.
 -**Track Attempts:** The game will display the number of attempts made.
 -**Reset Game:** Click the "Reset" button to start a new game with a new number
