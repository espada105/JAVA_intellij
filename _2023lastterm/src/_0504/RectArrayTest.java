package _0504;

public class RectArrayTest {
    public static void main(String []args){
        Rect[] list;

        list = new Rect[5];

        for(int i = 0; i <list.length; i++){
            list[i] = new Rect(i,i);

        }

        for(int i = 0; i <list.length; i++){
            System.out.printf(i + "번째 사각형의 면적=" + list[i].getArea());
        }

    }
}
