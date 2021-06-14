package com.playwithjava;

public abstract class UIControl {
    private boolean isEnabled = true;

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//  }

    public abstract void render();

//    Does't Override
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
