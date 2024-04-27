package Demeter;

public class Main {
    private C c1;

    public void doSomething() {
        this.c1.getB1().getA1().getA3();
    }
}
