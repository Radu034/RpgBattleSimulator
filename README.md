# RPG Battle Simulator

A simple Java project that simulates a battle between two characters in an RPG style. The main goal of the project is to demonstrate the usage of two design patterns in a logical and coherent context.

## Design Patterns Used

- **Strategy Pattern**
  - Allows dynamic switching of the attack style of a character (physical or magical damage).
  - Useful for simulating variability in a battle.

- **Observer Pattern**
  - Notifies observers (e.g. a logging system or other components) when a character dies.
 
## Features

- Character with dynamically changeable attack styles (physical or magical)
- Different resistances to physical and magical damage for each character
- Battle simulation between characters
- Unit tests that validate combat logic and strategy changes

## Testing

Unit tests use `JUnit5` and cover:
- Correct application of damage based on resistance
- Behavior of attack strategies
- Random strategy changes

## Technologies Used

- Java
- IntelliJ IDEA
- JUnit 5
