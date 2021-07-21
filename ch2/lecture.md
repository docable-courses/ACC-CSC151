# CSC 151: Chapter 2

- [✨ Variable Types](#variable-types)
    - [🙅 Boolean](#boolean) 
    - [🔢 Integer](#integer-and-double)
    - [🔢 Double](#integer-and-double)
    - [🔡 String](#strings)
- [🔤 Variable Names](#variable-names)
- [➡️ Variable assignment](#assignment)
- [🔠 Constants](#constants)
- [💭 Comments](#comments)
- [➗ Math](#basic-math)
- [↔️ Converting Numbers](#converting-numbers)
- [🗣 Input](#input)
- [👩‍💻 Assignment](./assignment.md)

This chapter we will cover variables (setting up, types, and using), comments, basic math, input/output, and basic strings.

## Variables

A variable is a storage location for a value within a computer program. When set-up and used properly, it will give the programmer a chance to recall data stored in memory. The first step in creating a variable is the variable declaration statement. This will set up a variable for usage. You must set up the type of variable being stored. You can set the variable to value immediately or later. 

```|{type:'youtube'}
https://www.youtube.com/embed/osOXX74vox8
```

##### Declaring variables

Creating the variable is called _declaring_. For example:

```java
int numStudents;
```

##### Initializing variables

Filling the variable with a value is called _initializing_.

For example:

```java
int numStudents = 15;
```

or

```java
int numStudents;
numStudents = 15;
```

### Variable Types

You can save numbers, words, or true/false into a variable. You just need to figure out what type of value you are going to save. We will cover words/Strings later in the notes.

```|{type:'youtube'}
https://www.youtube.com/embed/CE-4Fyk1aw8
```

#### Boolean

True or false values are called _Booleans_. They make good flags or checkers.  

For example:

```java
boolean failed = false;
boolean flag = true;
```

#### Integer and Double

Numbers are probably the most commonly stored values in most computer programs. There are several different types of numbers, however, we are only going to look at two types (`int` and `double`). For the full list, go to page 40 in your textbook.

_Integers_ as known as `int`s in programming. This is a whole number without a fractional part. Even if you try saving 5.0, it will not work. You can store zero, positive, and negative numbers. However, it is only good for approximately 2.14 billion.  

For example:

```java
int numPuppies = 2;
```

The other type we will focus on is a floating point number (a number with a decimal place).  It is known as a _Double_.  The `double` can hold a range of `+/- 10^38`.

For example:

```java
double gpa = 3.9;
```

```|{type:'youtube'}
https://www.youtube.com/embed/AmML3-ZWe8s
```

### Variable Names

```|{type:'youtube'}
https://www.youtube.com/embed/FXIwc55BWY4
```

```|{type:'youtube'}
https://www.youtube.com/embed/C6qOko4YNuk
```

```|{type:'youtube'}
https://www.youtube.com/embed/LrN1bKABXQQ
```

After you have a variable type figured out, you need to determine a name. The name you pick should describe what is being stored. Usually variables also start with a lower case letter and follow the [camel case convention](https://en.wikipedia.org/wiki/Camel_case). There are four big rules that must be followed about variable names.

1. Variables must start with a letter or the underscore `_` character. The remaining name can be letters, numbers, or underscores.
2. You cannot use other symbols such as `?` or `%`.  Spaces are not allowed either.  
3. Variable names are case sensitive.  If you use all lower case, you must use lower case everywhere.  
4. You cannot use reserved words (google it or Appendix C for the list).  

### Assignment

Once you variable is _[declared](#declaring-variables)_ and _[initialized](#initializing-variables)_, it can be used. What if you want to change the value of a variable? You use the _assignment_ statement.  The equal sign `=` does not check to see if the values are equal, it is the assignment operator. It assigs a value to a variable. You are overwriting the old value with the new value. The old value is lost forever once the line is completed.

```java
int cans = 6;  // declaration and initialization
cans = 12;   // assignment
```

### Constants

There are times we have a value that will not change once the code starts running. You can set up these variables as constants. Constants’ names are set up using all capitals. The keyword final is used set these apart.

```|{type:'youtube'}
https://www.youtube.com/embed/Wy5-2-nu4gA
```

```java
final double TAX_RATE = 0.07;
```

### Comments

Comments are notes to the programmer. You can provide explanations for tricky code, variables, and program descriptions. They are very useful. The compiler ignores any text after the comment.

```|{type:'youtube'}
https://www.youtube.com/embed/7KcBooi370I
```

In Java, when you have a comment that will appear at the end of a line or only takes up one line, use the double forward slash.  The fancy word for the `//` is delimiter.

```java
// This is a comment, ignore this text
```

If you have a comment that will span multiple lines you can use different delimiters. It is the `/*` (open) and `*/` (close).

```java
/*
The equation below finds the area of a circle.
A = pi * r * r
*/
```

At the top of the document, it is a common practice to use the double star at the open.  

```java
/** 
Laura Gaines
1/19/2017
This program finds the area of a triangle
*/
```

## Basic Math

```|{type:'youtube'}
https://www.youtube.com/embed/L7GAz5kps7I
```

Mathematic expressions are a combination of variables, literals, and operators. You must write out your math. The order of operations follows just as in regular math. Generally, you cannot use shortcuts from math. However, there are a few exceptions.

First is the `++` and `--`. This will increase or decrease a variable by 1.

```java
counter++; // increase counter by 1
```

```|{type:'youtube'}
https://www.youtube.com/embed/mHuIXM8WDoQ
```

Second, you can short cut when you are completing math for the same variable.

```java
x = x + 5;
```

Is the same as

```java
x += 5;
```

```|{type:'youtube'}
https://www.youtube.com/embed/zJzOtVMOtJM
```

---
_Side note:_

You can use `System.out.println( YOUR_VARIABLE );` to print the value of the variables:

```|{type:'youtube'}
https://www.youtube.com/embed/FFL4AOVv2lg
```
---

Let's try the example below, and run it ▶️:

```java | {type: 'script'}
int counter = 0;
System.out.println(counter);

counter++;
System.out.println(counter);

counter += 5;
System.out.println(counter);
```

Feel free to modify this code and re-run it with other values to experiment with it!

### Integer Division and Modulus

There are two special mathematical operations in computer science, _integer division_ and _modulus_. 

In Java, there is no special symbol to represent integer division. It will happen automatically when you divide to `int`s. If a single number is a floating point number, the result will have a decimal place.

```|{type:'youtube'}
https://www.youtube.com/embed/rDF2tMM50EE
```

_Try it below by clicking on ▶️ button. Feel free to change the code and experiment with different values!_

```java | {type: 'script'}
float f = 4.4f;
double d = 4.4;
int i = 2;

System.out.println(f / i);
System.out.println(d / i);
```

Modulus (mod) returns the remainder from long division. The result will be an integer. The mod operator is the percent `%` sign.

```|{type:'youtube'}
https://www.youtube.com/embed/aV_s_A_yvaM
```

_Try it below by clicking on ▶️ button. Feel free to change the code and experiment with different values!_

```java | {type: 'script'}
int dividend = 10;
int divisor = 3;
int remainder = dividend % divisor;

System.out.println(remainder);
```

Lets see one more modulus example:

```|{type:'youtube'}
https://www.youtube.com/embed/tFvB11HbjMw
```

### Math library

```|{type:'youtube'}
https://www.youtube.com/embed/J_iJJegqoTg
```

Some math operations are commonly used. The actions (like square root) are stored into the Java library in the math class. We can use these methods (actions) to help us solve problems.

Here are a few common methods:

| Method           | Action                                      |
|------------------|---------------------------------------------|
| `Math.sqrt(x)`   | Takes the square root of `x`                |
| `Math.pow(x, y)` | Power: `x` is the base, `y` is the exponent |
| `Math.sin(x)`    | `sin`, also the `cos`, `tan`                |
| `Math.round(x)`  | Closest integer to `x`                      |


There are two values stored in the Math class as well, `Math.PI` and `Math.E`. You can go out and [view the Java API to see more](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#field.summary).

### Converting numbers

You can convert number to different number types. The process is called _casting_. The value you want to convert to goes inside parenthesis before the variable name. _Note: casting will not round. It truncates the decimal_.

```|{type:'youtube'}
https://www.youtube.com/embed/wjO_vAndez8
```

_Try it below by clicking on ▶️ button. Feel free to change the code and experiment with different values!_

```java | {type: 'script'}
double amount = 23.53;
int newAmount = (int) amount; // amount converted to an integer

System.out.println(newAmount);
```

If you want to round, use the Math method first.

```java | {type: 'script'}
double amount = 23.53;
double roundAmount = Math.round(amount);
int newAmount = (int) roundAmount;

System.out.println(newAmount);
```

## Input

```|{type:'youtube'}
https://www.youtube.com/embed/xAbo4joRZzI
```
### Console Input

User input is not super easy in Java. Nothing is built in 🙁. We will need to bring in pieces of the Java library to use.

> _Note: each step below only explains the highlighted lines, but we show the complete file so you can see where these statements are used._

To do this, we will use the `import` statement as highlighted below.
This line of code will go at the top of the document. I usually put it right below my comment filled with my name, date, and program explanation.

```|{type:'youtube'}
https://www.youtube.com/embed/dOorH7pJzJI
```

```java |{type:'info', range: {start:0, end: 0}}
import java.util.Scanner;

public class Chapter2Scanner {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number: ");

        int num = in.nextInt();
        double aValue = in.nextDouble();
        String name = in.next()
	}
}
```

Once, you are in the code, usually inside main, the first step is to create a `Scanner`. This step should only happen once inside the code.

```java |{type:'info', range: {start:5, end: 5}}
import java.util.Scanner;

public class Chapter2Scanner {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number: ");

        int num = in.nextInt();
        double aValue = in.nextDouble();
        String name = in.next();

        // Do whatever you want with these values...
        System.out.println("Your integer; " + num);
        System.out.println("Your double: " + aValue);
        System.out.println("Your string: " + name);
	}
}
```

Once you scanner is created, print out a prompt or question. 

```java |{type:'info', range: {start:7, end: 7}}
import java.util.Scanner;

public class Chapter2Scanner {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number: ");

        int num = in.nextInt();
        double aValue = in.nextDouble();
        String name = in.next()

        // Do whatever you want with these values...
        System.out.println("Your integer; " + num);
        System.out.println("Your double: " + aValue);
        System.out.println("Your string: " + name);
	}
}
```

You will need to know the type of variable being read in from the user.  Write the line of the code that will read in the value with specific type you want.

```|{type:'youtube'}
https://www.youtube.com/embed/qoT6gcexpJk
```

```java |{type:'info', range: {start:9, end: 11}}
import java.util.Scanner;

public class Chapter2Scanner {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number: ");

        int num = in.nextInt();
        double aValue = in.nextDouble();
        String name = in.next();

        // Do whatever you want with these values...
        System.out.println("Your integer; " + num);
        System.out.println("Your double: " + aValue);
        System.out.println("Your string: " + name);
	}
}
```

Now that we explained how scanners work, here is how the code above will run. Type an your inputs in the terminal window below and press enter:

``` | {type: 'terminal'}
cd ch2/code && java Chapter2Scanner.java && exit

```

### Dialog Box Input

This is using built in Java classes (`JOptionPane`). All input from the box is a string and needs to be converted to a number.

Input:

```java
String input = JOptionPane.showInputDialog("Enter price:");
double price = Double.parseDouble(input);
//int p = Interger.parseInt(input);
```

Output:

```java
JOptionPane.showMessageDialog(null, "Price: " + price);
```

## Strings

Strings are any combination of characters: letters, numbers, symbols, white space, and so on. The text is enclosed in double quotations. A string in Java is also _immutable_. This means the string cannot be changed. It can only be overwritten. The length of a string can be determined using the `length` method built into Java.

```|{type:'youtube'}
https://www.youtube.com/embed/I_jjxTMKeR8
```

_Try it below by clicking on the ▶️ button. Feel free to change the code and experiment with different values!_

```java | {type: 'script'}
String name = "The Dude";
int n = name.length();     // n will now have 8 stored

System.out.println("The string variable called name is " + n + " characters long.");
```

If the length is zero, it means it is an empty string. Change the string above to length 0 and re-run the code to see the results ☝️.

### Concatenation

Using the `+` operator, you can combine multiple strings together. This process is called _concatenation_. Java will not automatically put a space between characters, so if you are concatenating two strings and want a space between them, you need to add it yourself. 

```|{type:'youtube'}
https://www.youtube.com/embed/z1dOalGoIKo
```

Try it below ▶️ :

```java | {type: 'script'}
String fName = "Sterling";
String lName = "Archer";
String name = fName + " " + lName;

System.out.println(name);
```

### Escape Characters

An escape character will allow the programmer to add special touches to his/her output. For example, what if you were printing a quotation? How do you print the quotes because quotes usually stand for a string? Java has created special characters (see list below) to help you create better looking output.

```|{type:'youtube'}
https://www.youtube.com/embed/CA7_doX-BtE
```

| Character Escape Sequence | Name                                                        |
|---------------------------|-------------------------------------------------------------|
| `\b`                      | Backspace                                                   |
| `\t`                      | Tab                                                         |
| `\n`                      | Linefeed/Newline (like hitting enter)                       |
| `\f`                      | Formfeed (new page)                                         |
| `\r`                      | Move cursor to first position of current line (rarely used) |
| `\\`                      | Add a backslash into output                                 |
| `\'`                      | Single quote                                                |
| `\"`                      | Double                                                      |

Let's try it below. We want to print `In Java we use "double quotes" to create a String.`. Click on the ▶️ button to the it. 

```java | {type: 'script'}
System.out.println("In Java we use \"double quotes\" to create a String.");
```

_What do you think would have happened if we didn't use escape characters around `double quotes` in the string above? 🤔 Feel free to change the code and experiment with different values!_

### Substrings

As previously stated, strings are a combination of characters. Each character is given a position. Spaces are even given a position. All counting in computer science begins at zero.

```|{type:'youtube'}
https://www.youtube.com/embed/BQtWnEws4-U
```

```java
String n = "Harry Potter";
```

Breaks down into:

| Char     | H | a | r | r | y |   | P | o | t | t |  e |  r |
|----------|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:--:|:--:|
| Position | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 |


```|{type:'youtube'}
https://www.youtube.com/embed/JAFWjK3hZpY
```

There is a built in function, `charAt`, which allows the user to return a character at a specific location.

```java | {type: 'script'}
String n = "Harry Potter";
char c1 = n.charAt(0);
char c2 = n.charAt(7);

System.out.println(c1);
System.out.println(c2);
```

Try running the example above by clicking on the ▶️ button. As you can see the variable `c1` would have the letter `H` stored in it. The variable `c2` would have the letter `o` stored.

Substrings are a piece or a part of a whole string. When calling the method, remember it will not overwrite the original string, unless you tell it to do so. Let’s head back to Harry Potter.

```java
String n = "Harry Potter";
String first = n.substring(0, 5);
String last = n.substring(6);

System.out.println(first);
System.out.println(last);
System.out.println(n); // notice the variable n is not overwritten!
```

Try running the example above by clicking on the ▶️ button and see the values stored in variables `first`, `last` and `n` at the end.

Let’s break down the first name part. The method is named `substring`. We want the method to happen to the String `n`. So it is `n.substring()`. The first number, zero, is the starting position. The second number is one past the stopping position. The variable `first`, should have just `"Harry"` saved in it.

The last name is using the same `substring` method, acting on the String `n`. There is only one number in the parenthesis `n.substring(6)`. When this happens, the number is the starting location and the stopping location is the end of the string.

### More String Methods

Strings have other methods for example `toUpperCase` which converts all character to upper case, and `toLowerCase` which converts all the characters to lower case. But remember that Strings are immutable, which means it doesn’t change unless it is _overwritten_.

Try running the example below ▶️, notice the value of `aString` doesn't change until we assign a new value to it.

```java | {type: 'script'}
String aString = "Bob";

System.out.println(aString.toUpperCase());  // prints BOB
System.out.println(aString);                // prints Bob, the initial value!

aString = aString.toLowerCase();    // this overwrites it, saving it into the *same* variable
System.out.println(aString);        // prints bob
```

The table below shows a few more examples of String methods. Feel free to update the code snippet above to use other String methods to run and experiment with it!


These examples, use the following String definition.

```java
String n = “Harry”;
```

<div style="margin-left: -100px">

| Method                                           | Description                                                                                                                                                                                               | Usage                                                  |
|--------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| `char chartAt(int n)`                            | Returns the character at the specified index.                                                                                                                                                             | `n.charAt(4)` returns `y`                    |
| `String concat(String str)`                      | Concatenates the specified string to the end of this string.                                                                                                                                              | `n.concat("Potter")` returns `"HarryPotter"` |
| `int indexOf(String str)`                        | Returns the index within this string of the first occurrence of the specified substring. Returns -1 if the string isn’t found.                                                                            | `n.indexOf("a")` returns `1`                 |
| `int indexOf(String str, int fromIndex)`         | Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. Returns -1 if the string isn’t found after starting location                    | `n.indexOf("a", 2)` returns `-1`             |
| `int lastIndexOf(String str)`                    | Returns the index within this string of the rightmost occurrence of the specified substring. Returns -1 if the string isn’t found.                                                                        | `n.lastIndexOf("r")`  returns `3`           |
| `int lastIndexOf(String str, int fromIndex)`     | Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index. Returns -1 if the string isn’t found after starting location. | `n.lastIndexOf("b", 1)`  returns `-1`        |
| `int length()`                                   | Returns the length of this string.                                                                                                                                                                        | `n.length()`  returns `5`                    |
| `String substring(int beginIndex)`               | Returns a new string that is a substring of this string starting at that index and going to the end of the string.                                                                                        | `n.substring(3)`  returns `"ry"`             |
| `String substring(int beginIndex, int endIndex)` | Returns a new string that is a substring of this string starting at that index and going up to, but not including, the ending index.                                                                      | `n.substring(1,4)`  returns `"arr"`          |
| `String toLowerCase()`                           | Converts all of the characters in this String to lower case using the rules of the default locale.                                                                                                        | `n.toLowerCase()`  returns "harry"           |
| `String toUpperCase()`                           | Converts all of the characters in this String to upper case using the rules of the default locale.                                                                                                        | `n.toUpperCase()`  returns `"HARRY"`         |
| `String trim()`                                  | Returns a copy of the string, with leading and trailing whitespace omitted.                                                                                                                               | `n.trim()`  returns `"Harry"`                |

</div>


## Example 1

```|{type:'youtube'}
https://www.youtube.com/embed/8B7resqApNY
```

## Example 2

```|{type:'youtube'}
https://www.youtube.com/embed/qgBLEgaXm60
```

## Example 3

```|{type:'youtube'}
https://www.youtube.com/embed/3ZfK_65d3ok
```
