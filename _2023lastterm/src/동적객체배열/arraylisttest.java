package 동적객체배열;
import java.util.ArrayList;

public class arraylisttest {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("홍콩");
        list.add("한국");
        list.add("일본");


        System.out.printf("여행지 추천 시스템입니다");
        int index = (int) (Math.random()*list.size());
        System.out.printf("추천 여행지는"  + list.get(index));

    }
}
