# TankGame-v1.0

A classic 2D tank battle game developed using Java Swing to practice core Java concepts like OOP, multithreading, and event handling.

<br>

<p align="center">
  <img src="[YOUR_SCREENSHOT_HERE]" alt="Game Screenshot" width="700">
</p>

---

### 📖 Table of Contents
* [About The Project](#-about-the-project)
* [Built With](#-built-with)
* [Getting Started](#-getting-started)
  * [Prerequisites](#prerequisites)
  * [Running the Game](#running-the-game)
* [Features](#-features)
* [License](#-license)
* [Contact](#-contact)

---

### 🌟 About The Project

This project is a recreation of the classic tank battle game. It was built from scratch to serve as a practical application for fundamental Java programming principles. The game is fully functional, featuring player controls, enemy AI, collision detection, and a save/load system.

This project demonstrates proficiency in:
* **Object-Oriented Programming (OOP):** Designing distinct classes for different game entities (`Tank`, `Hero`, `EnemyTank`, `Shot`, `Bomb`).
* **Multithreading:** Each tank and bullet runs on its own thread, allowing for independent movement and actions.
* **Java Swing for GUI:** Creating the game window, drawing all graphics, and managing the main game loop.
* **Event Handling:** Capturing and responding to keyboard inputs for player movement and actions.
* **File I/O:** Saving the game score and state to a local file, and loading it back upon request.

---

### 🛠️ Built With

This project was built using the following technologies:

* **Java (JDK 8 or later)**
* **Java Swing**

---

### 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

#### Prerequisites

Make sure you have the following software installed on your machine:
* **Java Development Kit (JDK)** - Version 8 or newer. ([Download here](https://www.oracle.com/java/technologies/downloads/))
* A Java **IDE** such as IntelliJ IDEA or Eclipse.

#### Running the Game

1.  **Clone the repository**
    ```sh
    git clone [https://github.com/](https://github.com/)[YOUR_USERNAME]/[YOUR_REPOSITORY_NAME].git
    ```
2.  **Open the project** in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

3.  **Locate the main class** at the following path:
    ```
    src/GameFinal/TankGameFinal.java
    ```
4.  **Run the `main()` method** within the `TankGameFinal.java` file.

5.  Follow the instructions printed in the console to either start a **new game** or **continue** from a previous session.

---

### ✨ Features

* **🎮 Player Control:** Full control over the hero tank using `W` (up), `A` (left), `S` (down), `D` (right) for movement and `J` to shoot.
* **🤖 Enemy AI:** Enemy tanks move around the map randomly and fire bullets automatically.
* **💥 Graphics & Sound:** Features animated explosions upon impact and includes sound effects.
* **💾 Save & Load System:** The game automatically saves the score and the state of enemy tanks when you close the window. You can load this state the next time you play.
* **🔄 Infinite Gameplay:** Defeated enemy tanks will respawn, providing a continuous challenge.

---

### 📜 License

Distributed under the MIT License. See `LICENSE` file for more information.

---
