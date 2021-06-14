package com.playwithjava;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        UIControl test = new CheckBox(); // UIControl object
        test.render();
        test.testUIControl(); // check reachable methods
        ((CheckBox) test).testCheckBox();
        var u = (UIControl) test;
        u.render();
        var uu = new UIControl();
        uu.render();

        System.out.println("\n*****************");
        UIControl[] controls = {new TextBox(), new CheckBox(), new Testing() };
        for (var control : controls)
            control.render();

    }
}
