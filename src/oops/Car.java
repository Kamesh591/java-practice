package oops;

public class Car {

    public String carNumber;
    String carModel;

   /* public Car(){
        super();
    }*/

    public Car(){
        super();
        System.out.println("This is Car Constructor");

    }

    public void Car(){
        System.out.println("This is method");
    }


    public void printCarNumber(){
        System.out.println("The  Car number is:"+carNumber);
    }

    public static void main(String[] args) {

        Car audi = new Car();



    }
}
