package instancepack;

/*
From static area we cannot access instance members directly,because while executing static area JVM may not identify instance members
 */

public class ObjectCreation {

    int x=20;

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        //System.out.println(x);

        ObjectCreation objectCreation = new ObjectCreation();
        ObjectCreation objectCreation1 = (ObjectCreation) Class.forName("instancepack.ObjectCreation").newInstance();
        ObjectCreation objectCreation2 =(ObjectCreation) objectCreation.clone();

    }
}
