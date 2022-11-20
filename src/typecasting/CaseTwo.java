package typecasting;

class Base1{

}

class Der1 extends  Base1{

}
class Der2 extends  Base1{

}

class Base2{

}
class Der3 extends  Base2{

}

class Der4 extends  Base2{

}

public class CaseTwo {

    public static void main(String[] args) {
        Base2 base2= new Der4();

       /* Der4 der4=(Der4) base2;
        Base1 base1= (Base1) base2;
        Base2 base21= (Base2) base2;
        Object o = (Der3)base2;
        Base2 base22=(Base1) base2;*/
    }
}
