public class elevator {
    int floor;
    int floor2;
    String button;

    public void where(int floor,int floor2){
        if(floor < floor2){
            System.out.println("올라갑니다");
        } else if (floor > floor2)
        {
                System.out.println("내려갑니다");
        }
    }

    public void choicebutton(String button){
        if("닫힘".equals(button)){
            System.out.println("문이 닫힙니다");
        } else if ("열림".equals(button)) {
            System.out.println("문이 열립니다");
        }
    }


}





