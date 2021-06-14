package com.playwithjava;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        System.out.println("UIControl");
        this.isEnabled = isEnabled;
    }

    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
