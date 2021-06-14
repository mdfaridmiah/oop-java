package com.playwithjava;

public class TextBox extends UIControl {
    private String text = "";

//  public TextBox() {
//    super(false);
//  }

    public TextBox() {
        System.out.println("TextBox constructor");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}

