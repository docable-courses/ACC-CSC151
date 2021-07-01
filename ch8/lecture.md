# CSC 151 - Chapter 8:  Objects and Classes

We will work to understand the concepts of classes, objects, and encapsulation. We will work with instance variables, methods, and constructors. You should be able to design, create, and test your own objects. We will also look at the keyword static. 

In object oriented programs, you don’t simply manipulate numbers and strings, but you work with objects that are meaningful for your application. Objects with the same behavior are grouped into classes. A programmer provides the designed behavior by specifying and implementing methods for these classes. 

## Object Oriented Programming

Object oriented programming is a way of breaking down tasks and data into reusable packages. Each object will have its own data and actions (methods). We have already used objects, like Scanner or File. For the Scanner object, we have methods like `nextInt()` and `hasNext()`.

The goal of this chapter is to create our own objects. To do this we must create a class. A class describes a set of objects with the same behavior. The string class, describes the behavior (actions) of all strings.

Every class should have a public interface. A way the user can manipulate (change or use) the object. The methods provide a way to manipulate. However, we don’t want the public to have the ability to change or see everything. This process of hiding details, but providing a public interface is called encapsulation. Encapsulation enables changes in the implementation without affecting other users of the class.

For example, think about a Bank Account. When a user of a Bank Account pulls up to the ATM machine, you want them to have the ability to see the balance, deposit money, or withdraw money. There are public methods to allow the user to access what is appropriate. However, you do not give the user direct access to change the amount in the account without a deposit or withdrawal. (Otherwise we would all have a lot of money in our accounts.) 

## Simple Class

First, we will look at the part where we are implementing (or using) the class. I have tweaked this example slightly from the textbook. We will model a tally counter (image to the right).

In real life with the counter, there is one value to track, the current value of the counter. There are two main actions the ability to press the button to increase the count by one or reset the counter to send the count back to zero. 
I will show you how to use the class, `TallyCounter`, before we create the behind the scenes code.

### Using the Class

Before using the object, we must create the object. You can’t use something that doesn’t exist. 

```java
TallyCounter myCounter = new TallyCounter();
```

The above line of code where we create the new object is called instantiation. You use the keyword new to create the new object. Please assume that all counters start at zero when they are created.

Now, let’s use our new counter. We can really only increase the count, reset the value, and see the current value. We will call (use) those methods to test our class. I am using the same counter I created before.

```java
myCounter.click(); 
myCounter.click(); 
int result = myCounter.getValue(); 
System.out.println(“Expecting 2. Got “ + result); 
myCounter.reset(); 
result = myCounter.getValue(); 
System.out.println((“Expecting 0. Got “ + result); 
```

### Creating a Class

When creating (implementing) a class, you need to plan it out before starting. Ask yourself these questions: What information do you need to keep track of? What are the actions I need? What do I want users to see? 

#### Instance Variables

For the `TallyCounter` class, there is only one value we need to keep track of, the current value of the counter. A variables created for the class are called class variables or instance variables. The next two lines will have the heading for the class and the instance variable, value. 

```java
public class TallyCounter { 
private int value;
    // more code 
}
```

Notice there the word private appears before the instance variable. Usually when you set up instance variables, you make them private. You don’t want users to have direct access to the variables. You want to control how the variables are changed. All private variables can be seen anywhere inside the class, but cannot be seen outside the class. Creating private variables to hide the implementation from the user is called _encapsulation_.

If I have two instances of the `TallyCounter` class (meaning have I have created two objects), each one would have its own variable named value. The two values are completely independent of each other.

### Instance Methods

A regular method inside a class is called an instance method. Unlike the private instance variables, most methods are usually public. It has the ability to access all the instance variables. In the using the class section, we had a method called click. It should increase the counter by one. The click method will not return anything (I don’t see a need). We do not need the keyword static. 

```java
public void click() { 
    value = value + 1;
}
```

The click method is also called a mutator method. It will change or mutate the values of the object. 

Another kind of instance method is the accessor method. This method will give the user information about the object. Please note that this does not give access to the variables, but the values inside the variables. Usually if you want the user to see the value of a variable, you will have an accessor method (getWhatever) to access the information. 

In Using a Class code, we call a method `getValue`. This is an example of an accessor method. It will give us the number inside the variable value. We cannot change or manipulate the variable, we just get the value back.

```java
public int getValue() { 
    return value;
}
```

There is another piece of the instance method I am going to discuss, but don’t have a good example for the TallyCounter. At times, we will have methods that receive parameters. For example, with a bank account, we could deposit money. The money coming in is a parameter, more specifically, it is an explicit parameter. Usually this is also a mutator method. 


```java
public void deposit(double a) { 
    amount += a;
}
```

### Constructors

A constructor is a special method. Its job is set up the object by initializing the instance variables of an object. The constructor is automatically called whenever an objected is created with the new operator. Constructors never return values, because of this the void is not needed in the heading.

The class may have more than one constructor. This is called overloading. The only rule to having multiple constructors is the parameters must be different (types and number of parameters). Java automatically knows to select the correct constructor based on the arguments.

If you do not initialize the variables, it will automatically get set to the default value. All numbers are set to zero. Booleans are set to false. Objects and arrays are set to null. Setting things to null is not the greatest. The point of the constructor is set it to a value. If you forget your constructor the compiler will automatically generate one with default values for all instance variables. This forces every class to have at least one constructor.

```java
// Default Constructor 
public TallyCounter() {
    value = 0; 
}

public TallyCounter(int v) // Constructor 
{ 
    value = v; 
}
```

### Class Code

This is the code for the whole class. 

```java
public class TallyCounter { 
    private int value; //Instance Variable

    // Default Constructor 
    public TallyCounter() {
        value = 0;
    }

    // Constructor 
    public TallyCounter(int v) {
        value = v;
    }

    // Mutator Method 
    public void click() {
        value = value + 1;
    }

    // Accessor Method 
    public int getValue() {
        return value;
    }
}
```

## Steps to Implement a Class

1. Get an informal list of the responsibilities of your objects (What is it supposed to do?) 
2. Specify the public interface (What do you want to hide/encapsulate? What do you want users to see?) 
3. Document the public interface. 
4. Determine the instance variables 
5. Implement constructors and methods 
6. Test your class 

## Testing a Class

We have not talked a bunch about testing. You should also test your code. Always. Classes don’t have a main method, so you can’t run them like a normal program so far. So how to do you check your code?

You must create a driver class with a main method. This means you will have two files. Even for simple objects you should have two files. One file will be the object class and the other is the driver class. The driver class will test the object. Inside main you should:

- Construct one or more objects of the class that is being tests 
- Invoke one or more methods 
- Print out one or more results 
- Print the expected results. 


## Object References

We have touched on this lightly with arrays. It holds the same for objects. The variable for an object does not hold the object itself. It holds the memory address for the start of the object. Technically specific the variable is an object reference. Again, this is not true for primitives (int, float, Boolean, characters). Your primitives always store values. Objects store references. When a variable contains the memory location of an object, we say that is refers to an object.

```java
TallyCounter tc = new TallyCounter();
```

The variable tc refers to an instance of the TallyCounter object. If I have two variables pointing to eh same addressing, it is called a shared reference. Again, this is a bad idea. I would avoid this if possible.

```java
TallyCounter tc = new TallyCounter(); 
TallyCounter tb = tc;
```

When you make changes to the object tb, tc will also be changed (and vice versa). 
Remember that you should never use the == (double equals) to check equality with two objects. It should only be used to check to see if an object is null. In Java, null is a lower case special word.

### this

In a method, the this reference refers to the objects instance variables. At times programmers will use the same name for the parameter as the instance variable. You use the keyword this to distinguish which is the class variable (the one with this) and which is the parameter.

```java
public TallyCounter(int value) {
    // Constructor
    this.value = value; 
}
```

## Static

With classes, we have not been using the keyword static. You can use this keyword with instance variables and methods. A static variable belongs to the class, not to any object of the class. This works well for a value you don’t want getting lost each time a new object is created. There is only a single copy of any static variable. If it is changed for one object, it is changed for all objects.

A static method is not invoked on an object. What this means is you won’t need to create a new object to use the method (no constructor required). You have already used static methods when using the math class. `Math.sqrt` does not require you to do `Math foo = new Math()`. You just use `Math.sqrt`.
