package Visitor;

public abstract class Person {

    //提供一个方法，让访问者访问
    public  abstract void accept(Action action);
}
