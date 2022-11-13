package control.loops;

public class BreakImpl {

    public static void main(String[] args) {

        for (int i=20; i>0;i--){
            if (i%3==0){
                break;
            }
            System.out.println(i);
        }
    }
}
