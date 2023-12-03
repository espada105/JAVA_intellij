package sports;
class sports{
    String getName(){ return " 아직 결정되지 않음";}
    int getPlayers() { return 0;}
}
public class soccer extends sports {
    @Override
    String getName() {
        return ("축구");
    }

    @Override
    int getPlayers() {
        return 11;
    }
    public static void main(String [] args){
        soccer soccer = new soccer();

        System.out.printf("경기이름: "+soccer.getName()+"\n경기자 수: "+soccer.getPlayers());

    }
}
