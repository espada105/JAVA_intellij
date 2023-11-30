class Pizza {
    int radius;

    Pizza(int r) {
        radius = r;
    }

    static Pizza whosLargest(Pizza p1, Pizza p2) {
        if (p1.radius > p2.radius)
            return p1;
        else
            return p2;
    }

    public void whosLargest2(Pizza p1, Pizza p2) {
        if (p1.radius * p1.radius * 2 > p2.radius * p2.radius)
            System.out.println("작은 피자 두 개가 큰 피자 하나의 면적보다 큽니다.");
        else
            System.out.println("작은 피자 두 개가 큰 피자 하나의 면적보다 작습니다.");
    }

    static Pizza comparePizzaAreas(Pizza p1, Pizza p2, Pizza p3) {
        int area1 = p1.radius * p1.radius * 2;
        int area2 = p2.radius * p2.radius * 2;
        int area3 = p3.radius * p3.radius;

        if (area1 + area2 > area3)
            return new Pizza(0); // 더미 객체 반환
        else
            return p3;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza(14);
        Pizza obj2 = new Pizza(18);
        Pizza obj3 = new Pizza(20);
        Pizza obj4 = new Pizza(30);

        Pizza largest = Pizza.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");

        Pizza pizzaInstance = new Pizza(0); // 더미 객체 생성
        pizzaInstance.whosLargest2(obj3, obj4); // whosLargest2 메서드 호출

        Pizza biggerPizza = Pizza.comparePizzaAreas(obj3, obj3, obj4);
        System.out.println("주문할 피자: " + biggerPizza.radius + "인치");
    }
}
