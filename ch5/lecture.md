# CSC 151: Chapter 5

This chapter we will cover methods. At the end of the chapter you should be able to implement methods, understand parameter passing, be able to breakdown tasks, figure out scope of a variable, and recursion.

```|{type:'youtube'}
https://www.youtube.com/embed/7LEOfCaR0LE
```

A method is a sequence of instructions with a name. You have called several methods already, like `println` or `Math.pow()`. With those methods, you need information to travel to the methods. That data is called _arguments_.  _Arguments_ are supplied when the method is called. When a value comes back from a method (like the answer from `Math.pow()`), it is a called a _return value_.  In Java, only _one_ value can be returned from a method.

## Black Boxes

When you are using methods built into Java or created by other developers, you may not know how the method executes. How does Java compute the power? We don’t know. However, we don’t care either. We know it works. The power method is called a black box method. We cannot see the inner workings of the method. We just know what arguments it needs, what the method does, and the value returned.

## Implementing Methods

```|{type:'youtube'}
https://www.youtube.com/embed/pjMUY2VcGSQ
```

#### Method Header

You can create your own methods. To create a method, you need to figure out the following:

- Method name – Pick something that makes sense with what you are trying to accomplish
- Declare a variable for each argument. Inside the method, the variables are parameters.
- Specify the return type 
- Add `public static` modifier (in the beginning – this will change)

```|{type:'youtube'}
https://www.youtube.com/embed/CSegXxpaWuI
```

All this information will help you create the _method header_. If I was finding the area of a rectangle, it may look like this:

```java
public static double areaRectangle(double length, double width)
```

In this method header I expect the return type to be a `double`, I chose `areaRectangle` as a name that makes sense for what this method is trying to accomplish, and declared parameters that I need to receive as the input in this method, `length` and `width`.

#### Method Body

Once the header is established, you can complete the method _body_. The body is the code that will be executed under the header. The formula for area of a rectangle is the product of the length and width. We will need to create a variable to store the result.

```java
double area = length * width;
```

#### Return Statement (in body)

Once the area is calculated, I want to give back the answer. This is the _return statement_. The method will exit as soon as a return statement is executed.

```java
return area;
```

The whole method would look like this:

```java
public static double areaRectangle(double length, double width) { 
    double area = length * width;
    return area;
}
```

The code above only creates the method. It doesn’t actually use the method. To use the method, you need to call the method. For now, we will just call it in the `main` method.


```|{type:'youtube'}
https://www.youtube.com/embed/Qj8gs9TAYdc
```

I am going to show you three ways to call the method:


```|{type:'youtube'}
https://www.youtube.com/embed/VRkgJR6iD0o
```

```java
public static void main(String [] args) {
	//method one - saving
	double len = 15.2;
	double width = 10.6;
	double area1 = areaRectangle(len, width);

	//method two - saving
	double area2 = areaRectangle(1.2, 4.5);

	//method three – no saving
	System.out.println(areaRectangle(4.5, 6.7));
}
```

In Java all the methods have to be inside a class, we will talk about this in more detail in next chapters, but for an executable code it will look like this when we put everything together:

```java | {type: 'script'}
public class MyClass {
	public static void main(String [] args) {
		// method one - saving
		double len = 15.2;
		double width = 10.6;
		double area1 = areaRectangle(len, width);
		System.out.println(area1);

		// method two - saving
		double area2 = areaRectangle(1.2, 4.5);
		System.out.println(area2);

		// method three – no saving
		System.out.println(areaRectangle(4.5, 6.7));
	}

	public static double areaRectangle(double length, double width) { 
		double area = length * width;
		return area;
	}
}
```

You can click on the ▶️ button to run this code. Feel free to make changes and re-run with this code, to completely understand how it works.

#### Example: Method Example

```|{type:'youtube'}
https://www.youtube.com/embed/bWjBiktLXSo
```

## Parameters

```|{type:'youtube'}
https://www.youtube.com/embed/1A17jxD8_zs
```

Notice in the code above that the argument names do no match the parameter names in the method declaration. This is okay. The fact that they do not match is just fine. With primitives (`int`, `double`, `Boolean`, `characters`), the value passes over, not the name.

Parameters are lost once the method is over. You cannot reference that value in the other program. Each time the method is called a new parameter is created.  It is a bad idea to modify the parameters when inside a method. A parameter cannot be recalled unless the method is called again. It is a good idea to keep those values untouched in case they are needed.  

## Return Values

As stated before, a return statement gives back a value. You can return a variable or a value. You could shorten the method from this:

```java
public static double areaRectangle(double length, double width) { 
	double area = length * width;
	return area;
}
```

to this:

```java
public static double areaRectangle(double length, double width) { 
	return length * width;
}
```

As stated before, once a return statement is process the method exits immediately. This is very handy for error checking.

A place that could cause issues is return statements inside if statements.  You should always have an else case or a blanket return statement if your return statements are inside the if statement.

### No Return Statement

A method that has no return statements, will have a `void` as the return type in the method header. The method will stop once it reaches the end of the method. When calling the method, make sure it is not in the print statement or you are attempting to save a result from the method into a variable.

## Method Development

There are several tidbits in this section. It appears to be a catch all of information. First, keep your methods short. A method should not be so long that the code will not fit on a single screen. If that is the case, you should break it up into smaller methods. Your method should be a single idea. You should not have multiple actions happening with in the same method. Another handy hint is to use method stubs to act as a placeholder for a method that will be implemented later.

### Steps for Method Implementation

```|{type:'youtube'}
https://www.youtube.com/embed/U5DEqCZCdbw
```

1. Describe what the method should do
2. Determine the method inputs – make a list
3. Determine the types of parameter variables and the return value
4. Write pseudocode for obtaining the desired result
5. Implement the body
6. Test your method – actually test it. 

### Reusable Methods
One of the most practical aspects of methods is reusability. Why write the same lines of code several times.  You can create a method to house those lines of code.  It will make your code cleaner.  

### Methods Calling Methods and Stacks

```|{type:'youtube'}
https://www.youtube.com/embed/Ba8-B9wA-v4
```

## Scope

<!-- ```|{type:'youtube'}
https://www.youtube.com/embed/i4zKrBymABA
``` -->

```|{type:'youtube'}
https://www.youtube.com/embed/yz6xpjUolJA
```

This is a huge concept to understand. Scope is where a variable exists within code. The easiest way to figure it out, is a variable only exists within the set of curly braces where it is set up. The header statement is included within the set of braces under the heading. There are two images below that show the scope of variables.  




A _local variable_ is a variable defined within a method. It only exist within that block of code. The same variable name can be used within another block of code without any complications.

#### Example: Method Calling Method Example

```|{type:'youtube'}
https://www.youtube.com/embed/_No3jMWVN-4
```

### Scope Example

```|{type:'youtube'}
https://www.youtube.com/embed/yxg626_yf-w
```

## Recursion

_Note: I am going to lecture on this. We will not have a lab or have quiz questions about this topic._

```|{type:'youtube'}
https://www.youtube.com/embed/rQ4XiXedJjQ
```

A recursive method is a method that calls itself. A recursive method contains a condition statement that will terminate the self call. When the method is called again, the input will need to be different than the starting parameter.

#### Example

```|{type:'youtube'}
https://www.youtube.com/embed/AaOEzsaqxWo
```

```java
public static void printTriangles(int side) {
	if (side < 1)
		return;
	printTriangles(side - 1);
	for (int i = 0; i < side; i++) {
		System.out.println("[]");
	}
	System.out.println();
}
```

