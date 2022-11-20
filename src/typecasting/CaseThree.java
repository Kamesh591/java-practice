package typecasting;

public class CaseThree {

    public static void main(String[] args) {

        Integer integer= new Integer(10);
        Number number=(Number) integer;
        Object object= (Number)number;
        System.out.println(integer==number);
        System.out.println(integer==object);
    }


}

