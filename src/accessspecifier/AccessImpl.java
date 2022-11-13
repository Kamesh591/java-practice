package accessspecifier;

public class AccessImpl {

    public static void main(String[] args) {

        PublicAccessImpl.method1();
        ProtectedImpl.protectmethod();
        //PrivateImpl.
        DefaultAccessImpl.printAge();
        System.out.println(DefaultAccessImpl.age);

    }

}
