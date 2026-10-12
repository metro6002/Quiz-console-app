# Quiz Console App

A simple interactive console-based Java quiz application.

## Prerequisites

- **Java 25** (or compatible JDK supporting implicitly declared classes and instance main methods / simple source-file launch).

## How to Run

With Java's single-file source-code launcher (and multi-file resolution), you do **not** need to compile the code manually. You can run the application directly from the project root directory:

```bash
java Main.java
```

## How It Works

1. **[Main.java](file:///E:/Desktop/QUIZ_CONSOLE_APP/Main.java)**: The entry point using Java's modern instance `main()` method. Initializes the quiz service and starts the game.
2. **[QuestionService.java](file:///E:/Desktop/QUIZ_CONSOLE_APP/QuestionService.java)**: Manages quiz questions, prompts the user in the console, records responses, and computes the final score.
3. **[Question.java](file:///E:/Desktop/QUIZ_CONSOLE_APP/Question.java)**: Data model encapsulating question text, options, ID, and correct answer.
