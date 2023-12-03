package _1204Calarea;

interface Calarea1{
    void getArea(int length, int breadth);
}

class Rectangle implements Calarea1{
    public void getArea(int length, int breadth){
        System.out.printf("길이가 "+length+" 이고 폭이 "+breadth+" 이면 총 넓이는 "+length*breadth+" 입니다");

    }

}

public class Calarea {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea(41,32);
    }
}
