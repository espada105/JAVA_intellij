package practice;

import java.awt.*;

class employee{
    String money;
    String name;
    public employee(){

    }
    public employee(String m, String n){
        this.money = m;
        this.name = n;
    }
}

class worker extends employee{
    String location;
    public worker(String l){
        this.location = l;
    }

}
public class pra {
    public static void main(String [] args){
        worker worker = new worker("수원");
        String m = "400";
        String n = "홍성인";

        System.out.printf("이름은"+worker.name+"위치는 "+ worker.location+"임금은"+worker.money);
    }
}
