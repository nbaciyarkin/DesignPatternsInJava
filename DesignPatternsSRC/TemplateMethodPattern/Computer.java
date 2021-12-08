package TemplateMethodPattern;

public abstract class Computer {


    public final void createComputer(){
        plugCpu();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }


    abstract void plugCpu();
    abstract void plugMemory();
    abstract void plugStorage();

    public void plugPeripherals(){
        System.out.println("Connecting mouse, keyboard, monitor");
    }










}
