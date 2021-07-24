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
