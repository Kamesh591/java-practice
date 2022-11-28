package langpack;

public class LangImpl {

  /*  Object ob3= this.clone();

    public LangImpl() throws CloneNotSupportedException {
    }*/

    public static void main(String[] args) throws CloneNotSupportedException {
        Object ob = new Object();
        Object ob1= new Object();
        Object ob2=ob;



       /* System.out.println(ob.equals(ob1));
        System.out.println(ob.equals(ob2));
        System.out.println(ob.toString());*/
        LangImpl lang= new LangImpl();
        LangImpl lang1= new LangImpl();
        LangImpl lang2=lang;
        System.out.println(lang.toString());
        System.out.println(lang.hashCode());
        System.out.println(lang2.toString());
        System.out.println(lang2.hashCode());
        /*System.out.println(lang1.hashCode());
        System.out.println(lang1.toString());*/
    }
}
