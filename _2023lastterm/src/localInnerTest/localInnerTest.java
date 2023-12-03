package localInnerTest;
class localInner{
    private int data = 30;

    void display(){
        final String msg = "현재의 데이터 값: ";

        class Local {
            void printMsg(){
                System.out.printf(msg + data);
            }
        }
        Local obj = new Local();
        obj.printMsg();
    }
}

public class localInnerTest {
    public static void main(String[] args) {
        localInner localInner = new localInner();
        localInner.display();
    }
}
