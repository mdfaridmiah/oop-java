package com.playwithjava;

public class UIControl {
    private boolean isEnabled = true;

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//  }

    public UIControl() {
        System.out.println("UIControl constructor");
    }

    public void testUIControl() {
        System.out.println("Testing UIControl");
    }

    public void render(){
        System.out.println("Render UIControl");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
