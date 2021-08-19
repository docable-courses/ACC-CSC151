# CSC 151: Chapter 3

This chapter we will cover decisions. This includes Booleans, if statements, nested if statements, and string comparison. Hand tracing code might become increasingly important as were have more complicated programs. Hand tracing is tracking variables through the program.

## The `if` statement

```|{type:'youtube'}
https://www.youtube.com/embed/9OGbuAGFUHo
```

The `if` statement is used to help the programmer execute a question or decision. This question must result in a true or false value.  There is no gray area in programming if statements. The if statement checks a Boolean expression. Directly under the if heading (think curly braces), you will place the code you want excuted if the expression evaluates to true. If there is a false execution, place under the else.


```|{type:'youtube'}
https://www.youtube.com/embed/fcvWa-6AJ3I
```

```|{type:'youtube'}
https://www.youtube.com/embed/OHWehDNs1ds
```

General Format:

```java
if (Boolean expression) {
	// True Stuff
}

else {
	// False Stuff
}
```

Try a real example, change value of age variable to make statements under the else run. ▶️

```java | {type: 'script'}
int age = 20;  // Try running this code with different values for age

if ( age >= 18) {
	System.out.println("Vote");
}

else {
	System.out.println("No voting");
}
```

> _Common Error: **NO** semicolon after the if or the else. `if();` or `else;` becomes a do nothing statement._

> ✨ Note: You can skip the curly braces if only one line of code exists under the if.  

## Comparing Numbers and Strings

When comparing values, there are a couple of issues or new areas in programming that differ from math class. Please pay attention to the details, otherwise you may have issues.

### Numbers

```|{type:'youtube'}
https://www.youtube.com/embed/u4bGk36_dlI
```

```|{type:'youtube'}
https://www.youtube.com/embed/5AlWDtWMbsk
```

When comparing numbers (and other primitive data types), you use a relational operator. These operators should be familiar. They are the same ones you used in math class.

| Java | Math Notation | Description           |
|:----:|:-------------:|-----------------------|
|  `>` |       >       | Greater Than          |
| `>=` |       ≥       | Greater Than or Equal |
|  `<` |       <       | Less Than             |
| `<=` |       ≤       | Less Than or Equal    |
| `==` |       =       | Equal                 |
| `!=` |       ≠       | Not Equal             |


The differences in math class is the greater/less or equal, equal, and not equal. Due to the fact that programming can be done through a console, the greater/less than or equal need to be broken apart into two keystrokes. The same goes for not equal (not this may be different in different languages). You cannot flip the order. Luckily, you type it as you would say it.

The double equal `==` is checking the equality of two values. Remember, the single equal sign is assigning values, not checking equality. Another note on the equality operator, avoid use with doubles. Round off errors can create problems when programming. It is better to check a range.  

### Strings

Comparing strings is a little trickier. You _cannot_ use the relational operators that you learned about in the number section. Since, strings are technically objects, you must use methods. There are four methods that can help you: `compareTo`, `compareToIgnoreCase`, `equals`, and `equalsIgnoreCase`.

#### CompareTo

```|{type:'youtube'}
https://www.youtube.com/embed/wtPamLXSzCk
```

```|{type:'youtube'}
https://www.youtube.com/embed/X0i12ANk1CQ
```

```|{type:'youtube'}
https://www.youtube.com/embed/jJADwEnVjcU
```

`compareTo` will compare one string to another string using lexicographically analysis. The method will return a number that is positive, negative, or zero. Remember when comparing capitals and lower case are different. Numbers come before letter. `compareToIgnoreCase` will ignore the case and just compare the letters.

| Code                         | Result          | Meaning                                 |
|------------------------------|-----------------|-----------------------------------------|
| `String1.compareTo(String2)` | Negative Number | String one is first in dictionary order |
| `String1.compareTo(String2)` | Positive Number | String two is first in dictionary order |
| `String1.compareTo(String2)` | 0 (zero)        | The values are the same                 |

Let's try a real example ▶️. Modify this code and try to compare two equal strings:

```java | {type: 'script'}
int c = "Food".compareTo("Fool");

System.out.println(c);
```

#### Equals

```|{type:'youtube'}
https://www.youtube.com/embed/tcRL-sefcHk
```

You _must_ use the `equalTo` method when comparing two strings. The method will return `true` (text is the same) or `false` (if they are not the same).

```java
string1.equals(string2)
```

Let's try a real example ▶️. Modify and it with different values:

```java | {type: 'script'}
Boolean eq = "string1".equals("string2");

System.out.println(eq);
```

If you use the double equal sign, you will not get an error. Your code is checking memory address of one string against the other. So although these two strings are equal, their memory addresses are different, run it to see the output ▶️

```java | {type: 'script'}
String a = new String("String1");
String b = new String("String1");

System.out.println( a == b );
System.out.println( a.equals(b) );
```

## Multiple Alternatives (Switch statement)


```|{type:'youtube'}
https://www.youtube.com/embed/VtXz-WKxZAc
```

There are even times when two options are not enough. For example, when figuring out a person’s GPA, there are lots of options, A, B, C, D, or F.  There is a way to chain these expressions together. When you have more than two, you use an `else if`. Below if the format the else if follows.

```java
if (boolean expression 1) {
    // if expression 1 is true, do this statement,
    // and this statement, and then go to end of block
}
else if (boolean expression2 ) {
    // if expression 2 is true, do this statement,
    // and this statement, and then go to end of block
}
else {
    // This line doesn’t need to be here,
    // but I wanted to show it could
    //You end up here if all checks have failed
}

// End of block
// Everyone executes
```

This would start at the top until it found a line that was true first. Once a true statement has been executed then the code would leave the block, not checking the remaining Boolean expressions.

### Switch Statement

A switch statement is an else if statement in a different format. I find that this isn’t a short cut, but some programmers like it. _DO NOT forget the `break`_. If you forget the `break` statement, the code will continue executing until it finds a `brake` statement or it reaches the end. You can use a switch statement with `ints`, `characters`, and `Strings`.

```|{type:'youtube'}
https://www.youtube.com/embed/y-vg9S11ea4
```

Try running ▶️ this example, modify this code and experiment with it (want to see what happens if you had forgotten `break`?).

```java | {type: 'script'}
int digit = 2;

switch (digit) {
  case 1:  // like:  if (digit == 1)
    System.out.println("one");
	break;

  case 2:  // like:  if (digit == 2)
    System.out.println("two");
	break;

  default:  // like else
    System.out.println("all others failed");
	break;
}
```

## Nested Branches

```|{type:'youtube'}
https://www.youtube.com/embed/9BMFljVQSCQ
```

We can put conditions inside conditions. The hardest aspect of the nested conditionals is maintaining the curly braces.  

Logical operators (and, or, not) can help reduces the number of nested conditionals needed. I recommend this when possible, but counting indentations, will be annoying and most likely cause a mistake.

Try this example  ▶️

```java | {type: 'script'}
int x = 5;
int y = 4;

if (x == y) {
	System.out.print("x equals y");
}
else {
	if( x < y) {
		System.out.print("x is less than y");
	}
  else {
    System.out.print("x is greater than y");
  }
}
```

### Dangling else

Remember that you don’t have to use curly braces with one line of code inside the if. But, who owns this else? _Indentation does not matter in Java_.

```java | {type: 'script'}
if (x <= y)
  System.out.print("one");
  if (x == y)
	  System.out.print("two");

else
  	System.out.print("three");
```

The else bellows to the `x==y` if statement. It is not clear when you leave off the `{ }`.  Please use the curly braces.

### Boolean Variables

```|{type:'youtube'}
https://www.youtube.com/embed/mYOjwsWoI2c
```

```|{type:'youtube'}
https://www.youtube.com/embed/T_5xFSBL3N8
```

There are three logical operators, `&&`, `||`, and `!`.  That is and, or, and not. Luckily for you all, they mean basically the same thing in English. The following chart will help you figure out how to interpret this type of expression.

| Name | Example            | Description                             |
|------|--------------------|-----------------------------------------|
| and  | `x<10 && y>15`     | x greater than 10 and y greater than 15 |
| or   | `x <10 \|\| y >15` | x greater than 10 or y greater than 15  |
| not  | `! (x<10)`         | x is not less than 10                   |

```|{type:'youtube'}
https://www.youtube.com/embed/bWa0z8tTiz0
```

```|{type:'youtube'}
https://www.youtube.com/embed/2hXqxhBgcv0
```

Evaluating these expressions may have already been covered in your math class already. However, we will quickly refresh your knowledge.

|   Expression (And `&&`)   | Result        |
|:-------------------------:|:-------------:|
| True && True              |        True   |
| True && False             |        False  |
| False && True             |        False  |
| False && False            |        False  |


| Expression (Or - `\|\|`)  | Result        |
|:-------------------------:|:-------------:|
| True \|\| True            |        True   |
| True \|\| False           |        True   |
| False \|\| True           |        True   |
| False \|\| False          |        False  |


|   Expression (Not -  `!`) | Result        |
|:-------------------------:|:-------------:|
| ! True                    |        False  |
| ! False                   |        True   |

#### Truth Table

```|{type:'youtube'}
https://www.youtube.com/embed/8AscYimoFhQ
```

```|{type:'youtube'}
https://www.youtube.com/embed/98HwR3qRsS8
```

## Input Validation

Robust programming is making a huge impact in industry. Can your program handle what the user is throwing it’s way? You can use the if statement to do input validation. For example, you can use it to prevent a divide by zero error or if the data is within a valid range.

## Example 1: Primary Colors Example

```|{type:'youtube'}
https://www.youtube.com/embed/8z3O0IIjp8c
```

## Example 2: Grades Example

```|{type:'youtube'}
https://www.youtube.com/embed/yCcYZgl_vLo
```
