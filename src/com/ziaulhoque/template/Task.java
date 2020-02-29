package com.ziaulhoque.template;

public abstract class Task {

    private AditTrail aditTrail;

    // default constructor for child class
    public Task(){
        this.aditTrail = new AditTrail();
    }

    public Task(AditTrail aditTrail) {
        this.aditTrail = aditTrail;
    }

    public void execute(){
        aditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
