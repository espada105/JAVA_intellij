package j1128;
import java.util.ArrayList;
class A {
    public A() {
        System.out.println("A생성자");
    }
}

class B extends A {
    public B() {
        System.out.println("B생성자");
    }
}


public class Test{

    public static void main(String [] args){
        B b = new B();
    }
}