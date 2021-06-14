package com.playwithjava;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox() };
        for (var control : controls){
            control.render();
        }
    }
}
