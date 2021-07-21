# CSC 151: Chapter 6 Assignment

Complete the following questions. If submitting code, please put each question in its own class. Make sure your input and output make sense to the user. You must use loops for full credit

1. Write a method that appends one array list to another. The method heading is below as a starting point.

For example, if ArrayList `a` is

| 1 | 4 | 9 | 16 |
|---|---|---|----|

and if ArrayList b is

| 9 | 7 | 4 | 9 | 11 |
|---|---|---|---|----|

Then append would return the following array list: 

| 1 | 4 | 9 | 16 | 9 | 7 | 4 | 9 | 11 |
|---|---|---|----|---|---|---|---|----|


```java | {type: 'script'}
// hint: do you need to import something?

public class Chapter6 {
	public static void main(String [] args) {
        // call your method here to test it:
    }    
    
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        // implement append method here
    }
}
```

2. The Audio Lab (parts 1 and 2).

- Part 1 - You will only update the following methods in the Audio Class:
    1. `sampleAverage()`: Returns the average value (a double) stored in the audioData array.

    2. `sampleStandDev()`: Returns the standard deviation (a double) of the values in the audioData array.

    3. `length()`: Returns the duration (a double) in seconds of the audio stored in the array

    4. `fileName()`: Returns a String which is the name of the audio file

- Part 2 - See the assignment for more details on each method. You will only update the following methods in the Audio Class:
    
    1. `reverse()`
    2. `compress()`
    4. `stretch()`
    4. `mirror()`
