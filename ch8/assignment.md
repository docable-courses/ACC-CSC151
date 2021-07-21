# CSC 151: Chapter 8 Assignment

Complete the following questions.

1. Implement a class `Student`. For the purpose of this exercise, a student has a name, total number of quizzes, and total quiz score. Supply an appropriate _constructor_ and _methods_: `getName()`, `addQuiz(int score)`, `getTotalScore()`, and `getAverageScore()`.

> _Supply both the Student class and a driver (with main)._

```java | {type: 'script'}
public class Ch8A1 {
	public static void main(String [] args) {
        // TODO: add your driver code here:
        // new Student();

    }

    static class Student {
        // TODO: implement the student class here

    }
}

```

2. Write a program that plays tic-tac-toe. The game is played on a 3x3 grid (think 2D array). The game is played by two players, the 'X' player and the 'O' player. The player who goes first is the 'O' player. The player who has formed a horizontal, vertical or diagonal sequence of three marks wins. Your program should declare a winner. You may handle the moves and display however you wish.

<div class="mx-auto" style="max-width: 150px;">

![img](imgs/tic-tac-toe.png)

</div>

> You need to have at least two classes. A game class and the driver class. The game class needs to handle the board. You are welcome to add a third class of the player, but it is not necessary.

Write your code here and click on the ✏️ icon to save it.

```java | {type: 'file', path: '/ljkassler/ch8/Ch8A2.java'}
// hint: don't forget imports...

public class Ch8A2 {
	public static void main(String [] args) {
        // TODO: implement driver here

    }

    static class Game {
       // TODO: implement your game class here

    }
}
```

Then run `java /ljkassler/ch8/Ch8A2.java` in the terminal window below to test it:

```bash | {type: 'terminal'}
```