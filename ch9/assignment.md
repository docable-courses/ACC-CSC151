# CSC 151: Chapter 9 Assignment

Complete the following questions.

```|{type:'youtube'}
https://www.youtube.com/embed/zKuS7Dulees
```

<br>

1. Make a class `Employee` with a `name` and `salary`. Make a class `Manager` inherit from `Employee`. Add a String instance variable, named `department`. Supply a method `toString` that returns the manager's `name`, `department`, and `salary`. Make a class `Executive` inherit from `Manager`. The execute also has a `title`, like CFO. Supply an appropriate `toString` methods for all relevant information. Supply a test program that test these classes and methods.

Write the `Employee` class here:

```java | {type: 'file', path: '/ACC-CSC151/ch9/Employee.java'}
package com.ACC-CSC151.ch2.assignments;

// TODO: Add your code here...
public class Employee {
    private String name;
    private double salary;

    Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
```

Write the `Manager` class here:

```java | {type: 'file', path: '/ACC-CSC151/ch9/Manager.java'}
package com.ACC-CSC151.ch2.assignments;

// TODO: Add your code here...
public class Manager extends Employee {
    private String department;

    Manager (String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String toString() {
        return this.name + " from " + this.department + " department, with salary of $" + this.salary;

    }
}
```

Write the `Executive` class here:

```java | {type: 'file', path: '/ACC-CSC151/ch9/Executive.java'}
package com.ACC-CSC151.ch2.assignments;

// TODO: Add your code here...
public class Executive extends Manager {
    private String title;

    Executive (String name, double salary, String department, String title) {
        super(name, salary, department);
        this.title = title;
    }

    public String toString() {
        return this.name + " " + title + " of " + this.department + " with salary of $" + this.salary;
    }
}
```

Write the `Driver` class here:

```java | {type: 'file', path: '/ACC-CSC151/ch9/Driver.java'}
package com.ACC-CSC151.ch2.assignments;

// TODO: Add your code here...
public class Driver {
    Executive elon = new Executive("Elon", 67000000000, "Engineering", "CEO");
    System.out.println(elon.toString());
}
```

And finally run your code by clicking on the ▶ button below. This command will compile these 4 java files and run them (This is how eclipse IDE runs your code internally!).

```bash | {type: 'command'}
cd /ACC-CSC151/ch9 && javac -d *.java && java Driver
```

---

2. _**AS A GROUP – Everyone please submit. Pick at one (or two) super classes that the group will use. Each person should have their own unique subclass animal to add to the interface.**_

    Using the `Zoo` driver and `Animal` Interface, create at least three classes implementing the Animal interface. One class should be a super class.

    For example, if I picked `Bears` as my animal. My super class will be `Bear`. My subclasses could be `PolarBear` and `BlackBear`.

    Upload the following files:

    - Zoo (driver) – should check Super class and both subs
    - Animal Interface
    - Super Class using Animal interface
    - Your subclass

    ```java

    ```
