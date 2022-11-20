package overloading;

public class MethodOverloadingUsecase {

    public void m1(){
        System.out.println("This is no arguemnt method");
    }
    public void m1(int i){
        System.out.println("This is int arg method");
    }

    public void m1(float f){
        System.out.println("This is Float arg method");
    }

    public void m1(int i, float f){
        System.out.println("This is int & float arg method");
    }

    public static void main(String[] args) {
        MethodOverloadingUsecase methodOverloadingUsecase= new MethodOverloadingUsecase();
        methodOverloadingUsecase.m1(10,10.5f);
        methodOverloadingUsecase.m1();
        methodOverloadingUsecase.m1(10);
        methodOverloadingUsecase.m1(10.5f);
    }
}
