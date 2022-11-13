package instancepack;

public class InitializationImpl2 {

    private static String m1(String msg){
        System.out.println(msg);
        return msg;
    }

  /*  public InitializationImpl2(){
        m=m1("1");
    }*/
    {
        m=m1("2");
    }
    static String m=m1("1");

    static {
        m=m1("3");
    }

    public static void main(String[] args) {
        InitializationImpl2 initialization= new InitializationImpl2();
    }
}
