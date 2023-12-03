package InnerClassTest;


class OuterClass{
    private int value = 10;
    class InnerClass{
        public void myMethod(){
            System.out.printf("외부 클래스 private 값: " + value);
        }
    }
    OuterClass(){
        InnerClass obj = new InnerClass();
        obj.myMethod();
    }
}
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }


}
