package pizza;

class circle {
    protected int radius;
    public circle(int r){
        radius = r;
    }
}


public class pizza extends circle{
    public pizza(int r) {
        super(r);
    }

    void print(String n,String r){
        System.out.printf("피자의 종류: "+ n +" 피자의크기: "+r);
    }

    public static void main(String args[]){
        pizza obj = new pizza(10);
        obj.print("페퍼로니","10");
    }
}