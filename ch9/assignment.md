# CSC 151: Chapter 9 Assignment

Complete the following questions.

```|{type:'youtube'}
https://www.youtube.com/embed/zKuS7Dulees
```

<br>

1. Make a class `Employee` with a `name` and `salary`. Make a class `Manager` inherit from `Employee`. Add a String instance variable, named `department`. Supply a method `toString` that returns the manager's `name`, `department`, and `salary`. Make a class `Executive` inherit from `Manager`. The execute also has a `title`, like CFO. Supply an appropriate `toString` methods for all relevant information. Supply a test program that test these classes and methods.

    Write the `Employee` class here:

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/Employee.java'}
    package com.CSC151.ch9.assignment1;

    // TODO: Add your code here...
    public class Employee {
        private String name;
        private double salary;

        Employee (String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public double getSalary() {
            return this.salary;
        }
    }
    ```

    Write the `Manager` class here:

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/Manager.java'}
    package com.CSC151.ch9.assignment1;

    // TODO: Add your code here...
    public class Manager extends Employee {
        private String department;

        Manager (String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        public String toString() {
            return this.getName() + " from " + this.getDepartment() + " department, with salary of $" + Double.toString(this.getSalary());
        }

        public String getDepartment() {
            return this.department;
        }
    }
    ```

    Write the `Executive` class here:

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/Executive.java'}
    package com.CSC151.ch9.assignment1;

    // TODO: Add your code here...
    public class Executive extends Manager {
        private String title;

        Executive (String name, double salary, String department, String title) {
            super(name, salary, department);
            this.title = title;
        }

        public String toString() {
            return this.getName() + " " + this.title + " of " + this.getDepartment() + " with salary of $" + Double.toString(this.getSalary());
        }

    }
    ```

    Write the `Driver` class here:

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/Driver.java'}
    package com.CSC151.ch9.assignment1;

    // TODO: Add your code here...
    public class Driver {

        public static void main(String [] args) {
            // Add statements here...
            Executive elon = new Executive("Elon", 67000000000.0, "Engineering", "CEO");
            System.out.println(elon.toString());
        }
    }
    ```

    And finally run your code by clicking on the ▶ button below. This command will compile these 4 java files and run them (This is how eclipse IDE runs your code internally!).

    ```bash | {type: 'command'}
    cd files && javac -d . *.java && java com.CSC151.ch2.assignment1.Driver
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
    package com.CSC151.ch9.assignment2;

    public interface Animal {
        void move(String t);  // Type of movement is passed in
        double getWeight();  // returns weight
        void updateWeight(double x);
        void addHabitat(String y);
        String getHabitat();  // returns Habitat Type
        String LatinName();  // returns Animal's Latin/Scientific Name
        String toString();
    }
    ```

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/Zoo.java'}
    package com.CSC151.ch9.assignment2;
    import java.util.ArrayList;

    public class Zoo {
        public static void main(String[] args) {
            ArrayList<Animal> myAnimals = new ArrayList<Animal>();
            
            // Add Your animals  - super class and subclasses
        
            for (int i = 0; i < myAnimals.size(); i++) {
                myAnimals.get(i).toString();
            }
        }
    }
    ```

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/MyAnimal.java'}
    package com.CSC151.ch9.assignment2;

    // TODO: Add your code here...
    public class MyAnimal {
        // TODO: implement your superclass animal. 
        // For this assignment DO NOT change the class *name* from "MyAnimal"

    }
    ```

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/MyAnimalSubclass1.java'}
    package com.CSC151.ch9.assignment2;

    // TODO: Add your code here...
    public class MyAnimalSubclass1 {
        // TODO: implement your superclass animal. 
        // For this assignment DO NOT change the class *name* from "MyAnimalSubclass1"
        
    }
    ```

    ```java | {type: 'file', path: '/ACC-CSC151/ch9/files/MyAnimalSubclass2.java'}
    package com.CSC151.ch9.assignment2;

    // TODO: Add your code here...
    public class MyAnimalSubclass2 {
        // TODO: implement your superclass animal. 
        // For this assignment DO NOT change the class *name* from "MyAnimalSubclass2"
        
    }
    ```

    Finally run your code by clicking on the ▶ button below. This command will compile these 4 java files and run them (This is how eclipse IDE runs your code internally!).

    ```bash | {type: 'command'}
    cd files && javac -d . *.java && java com.CSC151.ch2.assignment2.Zoo
    ```
