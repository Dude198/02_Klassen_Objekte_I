package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
    Cat cat = new Cat();
    output("Blick von aussen: " + cat);

    cat.tellYourAdress();

     output("--------------");

     Cat cat1 = new Cat();
     output("Blick von aussen: " + cat1);
 
     cat1.tellYourAdress();

      App.tellYourAdress();


 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

    public static void tellYourAdress() {
        System.out.println("Hallo!");
    }

}

