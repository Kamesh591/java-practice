package main.impl;

public class DiffAdditionImpl2 implements AddInterface{
    @Override
    public void add(int a, int b) {

        int sum=0;
        sum+=a;
        sum+=b;
        System.out.println("The sum of the varialbe is"+sum);
    }

    public static void main(String[] args) {
        DiffAdditionImpl2 diffAdditionImpl2= new DiffAdditionImpl2();
        diffAdditionImpl2.add(10,20);
    }
}
