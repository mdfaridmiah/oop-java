package com.playwithjava;

/**
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
*/


public class Main {

    public static void main(String[] args) {
//        UIControl[] controls = {new TextBox(), new AnotherClass(), new AnotherAbstract() }; // Error Finding

        UIControl[] controls = {new TextBox(), new AnotherClass()};
        for (var control : controls){
            control.render();
            if(control instanceof AnotherClass) ((AnotherClass)control).run();
        }

    }
}
