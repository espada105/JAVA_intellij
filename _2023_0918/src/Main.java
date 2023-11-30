
public class CompOperator {public static void main(String[] args) {
    System.out.print ((3 == 4) + " ");
    System.out.print((3 != 4) + " ");
    System.out.print((3 > 4) + " ");
    System.out.print ((4 > 3) + " ");

    System.out.print ((3 == 3 && 4 == 7) + " ");
    System. out.print ((3 == 3 || 4 == 7) + " ");
}
}

9번

public class BitOperator {
    public static void main(String[] args) {
        byte status = 0b01101110;
        System.out.print("문열림 상태-" + ((status & 0b00000100) != 0) );
    }
}


10번

public class BitOperator2 {
    public static void main(String[] args) {
        int x = 0600001101;
        int y = 0600001010;

        System.out.print("x&y=" + (x & y) + "");
        System.out.print("xly=" + (x | y) + "");
        System.out.print("×^y=" + (x ^ y) + "");
        System.out.println("~x=" + (~x) + "");
        System.out.print("x>>1=" + (x >>1) + "");
        System.out.print("×<<1=" + (x << 1) + "");
        System.out.println("×>>>1=" + (x >>>1));

    }
}

11번

        import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        double area1 = 2 * 3.141592 * 20 * 20;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("20cm 피자 면적=" + area1);
        System.out.println("30cm 피자 면적=" + area2);
        System.out.println((area1 > area2)? "20cm 두 개" : "30cm 한개");
    }
}