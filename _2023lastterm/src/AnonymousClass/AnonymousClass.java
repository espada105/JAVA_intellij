package AnonymousClass;

    interface anonymous{
    void turnOn();
    void turnOff();
}

class a implements anonymous{
    public void turnOn(){
        System.out.printf("hi");
    }
    public void turnOff(){
        System.out.printf("hi");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        
    }
}


//interface A{
//        void sub();
//}
//class B implements A{
//        public void sub(){
//            System.out.printf("sub()");
//        }
//}