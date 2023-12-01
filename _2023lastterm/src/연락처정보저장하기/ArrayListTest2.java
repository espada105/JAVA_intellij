package 연락처정보저장하기;
import java.util.ArrayList;
class Person{
    String name;
    String tel;

    public Person(String name,String tel){
        this.name = name;
        this.tel = tel;

    }
}



public class ArrayListTest2 {
    public static void main(String [] args){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("홍길동", "01011112222"));
        list.add(new Person("홍길순", "01011112224"));

        for(Person obj : list)
            System.out.printf("("+obj.name+","+obj.tel+")");


    }
}
