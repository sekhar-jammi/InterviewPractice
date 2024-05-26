package com.sekhar;

public class Main {

static public void one() {
System.out.println("static method");
//two(); --> this will give you an error bcoz method two is non-static method
Main m = new Main();
m.two();
}
public void two() {
System.out.println("Non-static method");
}
public static void main(String[] args) {
System.out.println("static main method");
one();
}
}
