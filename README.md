# Quiz Console App

An interactive console-based quiz game written in modern Java.

---

## Overview

This project is a terminal-based quiz game that presents questions to the user, accepts typed answers, reviews the selected answers, and calculates the final percentage score.

It showcases **modern Java features** (specifically Java 25 preview/launch features):
- **Implicitly declared classes & instance `main` method** (no `public static void main(String[] args)` boilerplate).
- **Single-source-file multi-file execution** (running directly via `java Main.java` without a manual `javac` compilation step).
- Built-in simplified console I/O (`IO.println` / `IO.print`).

---

## Prerequisites

- **Java 25** (JDK 25)

Check your Java version:
```bash
java -version
```

---

## How to Run

You do **not** need to compile the code into `.class` files manually. Simply execute the entry file from the project root:

```bash
java Main.java
```

> **Note**: Java 25 automatically resolves dependent files in the same directory (`QuestionService.java`, `Question.java`).

---

## How to Play

1. When prompted with a question and numbered options, type the **exact text** of your chosen answer (e.g. `Java`, `4bytes`, etc.).
2. Press `Enter` to proceed to the next question.
3. At the end of the quiz, your selections are reviewed and your final percentage score is printed.

---

## Project Structure & Architecture

```text
QUIZ_CONSOLE_APP/
├── Main.java              # Application entry point
├── QuestionService.java   # Quiz engine & game loop logic
├── Question.java          # Question entity/data model
└── README.md              # Project documentation
```

### Class Roles

| Class | Description |
| :--- | :--- |
| **[`Main.java`](file:///E:/Desktop/QUIZ_CONSOLE_APP/Main.java)** | Serves as the launcher. Creates an instance of `QuestionService`, triggers the quiz loop (`playQuiz()`), and prints results (`printScore()`). |
| **[`QuestionService.java`](file:///E:/Desktop/QUIZ_CONSOLE_APP/QuestionService.java)** | Manages the question array, captures player answers from `System.in`, evaluates answers, and calculates the percentage score. |
| **[`Question.java`](file:///E:/Desktop/QUIZ_CONSOLE_APP/Question.java)** | Encapsulates the question model with fields: `id`, `question`, 3 options (`opt1`, `opt2`, `opt3`), and the correct `answer`. |

---

## Example Run

```text
Choose the correct answer from the options given
Question No.1: What language are we using now?
Options
1. Java
2. C++
3. Python
Your answer is: Java

Question No.2: int size?
Options
1. 4bytes
2. 1byte
3. 3bytes
Your answer is: 4bytes
...
1.Java
2.4bytes
...
Your score is: 100.0%
```
