# ChessMovesMVC
## Table of Contents
1. [Introduction](#Introduction)
2. [Features](#Features)
3. [Installation](#Installation)
4. [Usage](#Usage)
5. [Example](#Example)
6. [Project Structure](#project-structure)
7. [Class Diagrams](#class-diagrams)
8. [Benefits of MVC Architecture](#benefits-of-mvc-architecture)
9. [Contact](#contact)

## Introduction
This project is a chess possible moves calculator built using the Model-View-Controller (MVC) architecture. The application allows users to input a chess piece and its position on the board to get all possible moves for that piece. It was created as an educational project to demonstrate the principles of MVC architecture.


## Features

- **User Interface:** A simple GUI with a dropdown to select chess pieces and buttons to set position and get possible moves.
- **Supported Pieces:** King, Queen, Rook, Bishop, Knight,White Pawn and Black Pawn.
- **MVC Architecture:** Separation of concerns between the Model, View, and Controller.
- **Extensible:** Easily extendable to add more features or pieces.


## Installation

To run this project locally, follow these steps
1. **Clone the repository:**
    ```sh
    git clone https://github.com/abdul-bit/Chess-Moves-MVC.git
    ```
2. **Navigate to the project directory:**
    ```sh
    cd Chess-Moves-MVC
    ```
3. **Compile the Java files:**
    ```sh
    javac *.java
    ```
4. **Run the application:**
    ```sh
    java Main
    ```





## Usage
1. **Select a piece** from the dropdown menu.
2. **Enter a position** (e.g., `e5`) in the input prompt.
3. **Click "Set Position"** to set the piece on the board.
4. **Click "Get Possible Moves"** to see the possible moves in the output panel.
### Example
- **Input:** Position - `h8`, Piece - `King`
- **Output:** Possible Moves - `g7, g8, h7`
![image](https://github.com/abdul-bit/Chess-Moves-MVC/assets/59999587/8743cd20-56a3-42e6-a235-80c12e589dd2)


## Project Structure

- **Controller.java:** The controller logic.
- **IModel.java:** The model interface.
- **IView.java:** The view interface.
- **View.java:** The implementation of the view interface.
- **Model.java:** The implementation of the model interface with the main logic of calculating possible moves.
- **Main.java:** The starting point of the application.






## Class Diagram

Here is the class diagram illustrating the architecture of the project:

![Top-Level Package](https://github.com/abdul-bit/Chess-Moves-MVC/assets/59999587/a158a9e8-17a9-43de-9b12-e0dd82c394a5)
## Benefits of MVC Architecture

Using the MVC (Model-View-Controller) design pattern offers several advantages:

1. **Separation of Concerns:**
    - **Model:** Manages the data and business logic.
    - **View:** Handles the presentation and user interface.
    - **Controller:** Processes user input and interacts with the model and view.
    This separation allows for more modular code, making it easier to manage and maintain.
    - Components can be reused across different parts of the application or in different projects.
    - Individual components (model, view, controller) can be tested independently, improving the reliability of the application.
    - The application can be extended more easily by adding new views or controllers without significant changes to the existing codebase.
    - Different developers can work on the model, view, and controller simultaneously without interfering with each other’s work.

## Contact
For any inquiries or issues, feel free to contact me:

- **GitHub:** [abdul-bit](https://github.com/abdul-bit)
- **Email:** abdulrahmanshigihalli@gmail.com
