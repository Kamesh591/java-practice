package oops.abstraction;

public abstract class IntrfaceImpl implements Interface{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {

        System.out.println("m2 method");
    }

    @Override
    public abstract void m3();

    }
