package com.playwithjava;

public class Main {

    public static void run(UIControl control) {
        if(control instanceof  TextBox){
            var textBox = (TextBox) control;
            textBox.setText("Hello, World...!");
        }
        System.out.println(control);
    }

    public static void main(String[] args) {
        var textBox = new TextBox();
        var control = new UIControl(false);
        run(textBox);
        run(control);
    }
}