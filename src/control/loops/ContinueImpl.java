package control.loops;

public class ContinueImpl {

    public static void main(String[] args) {

        for (int i=20; i>0;i--){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
