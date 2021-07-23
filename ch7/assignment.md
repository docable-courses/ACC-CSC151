# CSC 151: Chapter 7 Assignment

## Problem 1: Basic File Input/Output

Write a program that reads in a file containing text. Read each line and send it to an output file (different file than input). The output line should include the _line numbers_.

Use these paths for your input and output files:
- input file: `/ACC-CSC151/ch7/files/assignment1.txt`
- output file: `/tmp/output.txt`

expected output file:
```
1. Little Miss Muffet,
2. Sat on a tuffet,
3. Eating her curds and whey;
4. Along came a spider,
5. Who sat down beside her,
6. And frightened Miss Muffet away.
```

Write and run your code here ▶️

```java | {type: 'script'}
// hint: don't forget imports...

public class Ch7A1 {
	public static void main(String [] args) {
        // TODO: add your code here

    }
}
```

Then, run the command below to see content of your output file, by clicking on the ▶️ button. Does it match the expected output file?

```bash | {type: 'command'}
cat /tmp/output.txt
```

## Problem 2: Jabberwocky
_**Note**: In this program, we will be using the Jabberwocky text file, with path = `/ACC-CSC151/ch7/files/Jabberwocky.txt`._

### Description

This application program should read in words/lines from a text file named at `/ACC-CSC151/ch7/files/Jabberwocky.txt`. The program should read in the poem once. You can pick your storage choice (array list or list). You should be using methods.

A menu should appear for the user. When the user selects an option, the output will be displayed. Then, the menu should reappear.

### Menu

1. Print the list of words
2. Find a word (using binary search – print the number of comparisons it took to find it)
3. Find a word (using linear search – print the number of comparisons it took to find it)
4. Print the number of words containing the letter sequence "he"
5. Print the word(s) that occur the most times.
6. Print unique words
7. Print the original file
8. Quit

Write your code here and click on the ✏️ icon to save it.

```java | {type: 'file', path: '/ACC-CSC151/ch7/Ch7A2.java'}
// hint: don't forget imports...

public class Ch7A2 {
	public static void main(String [] args) {
        // TODO: call your method here...

    }

    // TODO: implement your method here...
}
```

Then run `java /ACC-CSC151/ch7/Ch7A2.java` in the terminal window below to test it:

```bash | {type: 'terminal'}
```