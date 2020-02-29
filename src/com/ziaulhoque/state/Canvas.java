package com.ziaulhoque.state;

public class Canvas {
    private Tool currentTool;

    public void mouseUp(){
        this.currentTool.mouseUp();
    }

    public void mouseDown(){
        this.currentTool.mouseDown();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
