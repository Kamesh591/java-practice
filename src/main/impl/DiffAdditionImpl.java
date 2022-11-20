package main.impl;

public class DiffAdditionImpl implements AddInterface{

    @Override
    public void add(int a, int b) {
        int sum=0;
        sum=a+b;
        System.out.println("Sum of variables is:"+sum);

    }

    public static void main(String[] args) {
        DiffAdditionImpl diffAddition= new DiffAdditionImpl();
        diffAddition.add(10,20);
    }
}
