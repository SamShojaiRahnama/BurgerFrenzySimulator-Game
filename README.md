**BurgerFeenzy Simulator**
BurgerFeenzy Simulator is a dynamic burger order simulation game developed using Java and JavaFX. The game is designed with accessibility in mind and provides a competitive edge through experience points (XP). The project was developed with a strong focus on Object-Oriented Design (OOD) principles and incorporates multiple design patterns to ensure a maintainable, scalable, and enjoyable game experience.

**Project** **Overview**
Our objective was to create a JavaFX-based game that simulates real-world customer interactions and burger order fulfillment. Through this project, we enhanced our understanding of JavaFX, design patterns, and accessibility by introducing features such as audio descriptions for low-vision players.

**Key features include:**

Dynamic customer behaviors: Simulating varied emotional states and random order generation to make each game session unique and challenging.
Accessibility through Audio Descriptions: Audio portions for order descriptions and ingredients were added to improve the gaming experience for low-vision players.
Competitive Gameplay: Players accumulate experience points (XP) by fulfilling orders accurately and on time. The scoreboard adds a competitive spirit and contributes to the game’s win conditions.
Design Patterns and Principles: Adhered to SOLID Object-Oriented Design principles, implemented multiple design patterns such as:
Observer: For event-driven updates between objects.
Strategy: To dynamically choose different customer behaviors and game strategies.
Composite: To handle complex objects like orders with various ingredients.
Model-View-Controller (MVC): For separating business logic from the graphical interface.
Features
JavaFX GUI: A polished user interface that allows players to interact with the game intuitively.
Accessibility: Audio descriptions for the orders and ingredients enhance the game's accessibility for low-vision users.
XP-based Scoreboard: Experience points (XP) are awarded for fulfilling orders quickly and correctly, adding a competitive element to the game.
Real-time Customer Interactions: Customers in the game can display a range of emotions, adding complexity and unpredictability to the gameplay.
Dynamic Order Generation: Orders are randomly generated, keeping players on their toes with unique combinations every session.
Technologies Used
Java: Core programming language for game logic and mechanics.
JavaFX: Used for building the graphical user interface (GUI).
Design Patterns: Observer, Strategy, Composite, and MVC for clean, scalable, and maintainable code architecture.
Audio Integration: Added audio elements to enhance accessibility features.
Getting Started
Prerequisites
Java Development Kit (JDK) 11 or higher.
JavaFX SDK.
IDE (such as IntelliJ IDEA) for running the project.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/SamShojaiRahnama/BurgerFrenzySimulator-Game.git
Open the project in your preferred IDE (e.g., IntelliJ IDEA).

Ensure that JavaFX is properly set up. You can follow this guide for setting up JavaFX in your IDE.

Run the game using the Main.java class located in the src directory.

Gameplay
Objective: Fulfill burger orders as quickly and accurately as possible to accumulate XP.
Accessibility: The game provides audio cues and descriptions to aid low-vision users.
Winning: Players compete to achieve the highest XP by fulfilling orders correctly and within the time limit.
Design Approach
Object-Oriented Design and Patterns
We focused on adhering to SOLID principles and implemented various design patterns to ensure the flexibility and maintainability of the project:

Observer: Used to handle real-time updates between the game's components (e.g., customer orders and the scoreboard).
Strategy: Allows for the dynamic switching between different customer behaviors.
Composite: Enables the handling of complex objects like customer orders that consist of multiple ingredients.
Model-View-Controller (MVC): Separates the game's logic from its GUI, making the code easier to maintain and extend.
Contributions
This project was developed by a group of three students, each contributing to different aspects of the game, including logic, UI/UX design, and audio integration. Contributions are welcome! Feel free to fork the repository and submit pull requests.

License
This project is open-source under the MIT License. See the LICENSE file for more information.

Contact
For any questions, suggestions, or contributions, feel free to open an issue on the repository's issues page.
