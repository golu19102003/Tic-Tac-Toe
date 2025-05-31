![Screenshot 2025-05-31 082847](https://github.com/user-attachments/assets/2a745014-6ae8-4fb8-acba-c05104f50d52)
![Screenshot 2025-05-31 082918](https://github.com/user-attachments/assets/643702dc-47aa-425f-9b79-f22b6d834f0f)
![Screenshot 2025-05-31 083002](https://github.com/user-attachments/assets/d841338c-a8c7-4743-9b8f-3e7b81924efe)
![Screenshot 2025-05-31 083025](https://github.com/user-attachments/assets/2b40908b-469b-4715-9c1c-899d88bb5de1)

# Tic-Tac-Toe Android App
* A beginner-friendly, interactive Tic-Tac-Toe game built with Android Studio using Java. This app allows two players to enter their names, play the classic game on a responsive grid, and displays the winner with an option to restart the game. This project is a great starting point for those looking to learn Android app development, UI navigation, and basic game logic implementation.
---
## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [App Flow](#app-flow)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Core Components](#core-components)
- [Game Logic](#game-logic)
- [Dialog and Restart Flow](#dialog-and-restart-flow)
- [Customization](#customization)
- [Learning Outcomes](#learning-outcomes)
- [References](#references)
- [License](#license)
- [Contact](#contact)
---
### Introduction
* This project implements a classic **Tic-Tac-Toe** game for Android, inspired by the detailed tutorial at [androidknowledge.com](https://androidknowledge.com/tic-tac-toe-app-in-android-studio/). The app is designed for beginners to understand fundamental Android concepts such as activity navigation, UI elements, event handling, and dialog creation. It features a user-friendly interface, player name input, real-time win detection, and an intuitive restart mechanism.
---
## Features
- **Player Name Input:** The app starts by prompting both players to enter their names, adding a personalized touch to the game.
- **Responsive Game Board:** A 3x3 grid is displayed, where players take turns marking their moves.
- **Turn Indicator:** The app displays which player's turn it is, using the entered names for clarity.
- **Win Detection:** The game automatically checks for winning conditions after each move.
- **Draw Detection:** If all cells are filled without a winner, the app declares a draw.
- **Winner Dialog:** At the end of the game, a dialog box shows the winner’s name or indicates a draw, with an option to start a new game.
- **Restart Functionality:** Clicking "Start Again" resets the game, allowing for repeated play without restarting the app.
- **Clean UI:** Simple, intuitive, and visually appealing layout suitable for all ages.
---
## App Flow
1. **Player Name Entry:**  
   - The app launches with a welcome screen asking for Player 1 and Player 2 names.
   - Names are validated to ensure both fields are filled.
2. **Game Screen:**  
   - Displays the entered player names and a 3x3 grid.
   - Players take turns tapping empty cells to mark "X" or "O".
   - After each move, the app checks for a win or draw.
3. **End of Game:**  
   - If a player wins, a dialog appears with the winner’s name and a "Start Again" button.
   - If the game is a draw, the dialog indicates a draw and offers the restart option.
4. **Restart:**  
   - Clicking "Start Again" clears the board and resets the turn, allowing players to play again with the same names.
---
## Screenshots
*(Add screenshots of the name entry screen, game board, and winner dialog here)*
---
## Getting Started
### Prerequisites
- Android Studio (latest version recommended)
- Basic knowledge of Java and Android development
### Installation
1. **Clone the Repository:**
git clone https://github.com/yourusername/tic-tac-toe-android.git
2. **Open in Android Studio:**
- Launch Android Studio.
- Select "Open an existing project" and choose the cloned directory.
3. **Build and Run:**
- Connect an Android device or use the emulator.
- Click "Run" to build and launch the app.
---

## Project Structure
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/com/yourpackage/tictactoe
│ │ │ │ ├── MainActivity.java
│ │ │ │ ├── GameActivity.java
│ │ │ │ └── utils/
│ │ │ ├── res
│ │ │ │ ├── layout/
│ │ │ │ │ ├── activity_main.xml
│ │ │ │ │ └── activity_game.xml
│ │ │ │ └── values/
│ │ │ │ └── strings.xml
│ │ │ └── AndroidManifest.xml

- **MainActivity.java:** Handles player name input and navigation to the game screen.
- **GameActivity.java:** Contains the game logic, UI for the grid, turn management, and end-game dialog.
- **activity_main.xml:** Layout for the name entry screen.
- **activity_game.xml:** Layout for the game board and player indicators.
---

## Core Components
### 1. Player Name Entry
- Two `EditText` fields for name input.
- "Start Game" button validates input and starts the game.
### 2. Game Board
- 3x3 `GridLayout` or `TableLayout` for the Tic-Tac-Toe grid.
- Each cell is a clickable `Button` or `TextView`.
- Displays player names and indicates whose turn it is.
### 3. Game Logic
- Alternates turns between players.
- Updates the grid with "X" or "O" based on the current player.
- Checks for win/draw after each move using a 2D array or list.
- Disables further moves after game ends.
### 4. Winner Dialog
- Uses `AlertDialog` to display the winner or draw message.
- "Start Again" button resets the board for a new game.
---
## Game Logic
- **Move Validation:** Only empty cells can be marked.
- **Win Conditions:** Checks all rows, columns, and diagonals for three matching symbols.
- **Draw Condition:** If all cells are filled and no winner, the game is a draw.
- **Turn Switching:** Alternates between players after each valid move.
- **State Reset:** Clears the board and resets variables on restart.
---
## Dialog and Restart Flow
- The end-game dialog is triggered immediately after a win or draw is detected.
- The dialog displays:
  - The winner’s name (e.g., "Congratulations, Alice wins!")
  - Or a draw message ("It's a draw!")
  - A "Start Again" button to reset the game.
- Clicking "Start Again" closes the dialog and calls a function to reset the game state.
---
## Customization
- **UI Colors & Styles:** Modify XML layout files for different themes.
- **Sound Effects:** Add audio feedback for moves and win/draw events.
- **Score Tracking:** Extend the app to keep track of scores across multiple games.
- **Single Player Mode:** Implement AI for playing against the computer.
- **Animations:** Add animations for cell selection and dialog appearance.
---
## Learning Outcomes
- **Activity Navigation:** Passing data (player names) between activities.
- **UI Design:** Using layouts, buttons, and dialogs in Android.
- **Event Handling:** Responding to user input and updating the UI.
- **Game Logic:** Implementing classic game rules in Java.
- **State Management:** Resetting and maintaining game state across sessions.
---
## References
- [Tic-Tac-Toe App in Android Studio Tutorial](https://androidknowledge.com/tic-tac-toe-app-in-android-studio/)
- [Android Developers Documentation](https://developer.android.com/docs)
- [Material Design Guidelines](https://material.io/design)
---
## License
* This project is open source and available under the [MIT License](LICENSE).
---
## Contact
* For questions, suggestions, or contributions, please open an issue or reach out via "pranjalgurdawasi@gmail.com".
---
* Enjoy playing Tic-Tac-Toe and happy coding!**
