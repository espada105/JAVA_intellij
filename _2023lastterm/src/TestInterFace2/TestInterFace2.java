package TestInterFace2;
interface RemoteControl{
    void turnOn();
    void turnOff();
    public default void printBrand() {
        System.out.println("RemoteControl 가능 Tv");
    }
}

class Television implements RemoteControl{
    boolean on;
    public void turnOn(){
        on = true;
        System.out.println("Tv가 켜졌습니다");
    }
    public void turnOff(){
        on = true;
        System.out.println("Tv가 꺼졌습니다");
    }

    @Override
    public void printBrand() {
        System.out.println("power java tv입니다");
    }
}


public class TestInterFace2 {
    public static void main(String[] args) {
        RemoteControl obj = new Television();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}
