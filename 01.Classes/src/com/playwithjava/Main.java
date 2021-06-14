package com.playwithjava;

public class Main {

    public static void main(String[] args) {
//        TextBox textBox11  = new TextBox();

        var textBox1  = new TextBox();
        textBox1.setText("Box-1");
        System.out.println(textBox1.text);

        var textBox2 = textBox1;
        textBox2.setText("Updating Box-1");
        System.out.println(textBox1.text);
    }
}
