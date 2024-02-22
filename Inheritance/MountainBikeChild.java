package Inheritance;

public class MountainBikeChild extends Bicycle{
    public int seatHeight;

    public MountainBikeChild(int startHeight,int Startgear,int Startspeed){
        super(Startgear,Startspeed);
        //super method is instance of base/parent class
        this.seatHeight=startHeight;
    }

    public void show(){
        System.out.println(this.gear);
        System.out.println(this.speed);
        System.out.println(this.seatHeight);
    }

    public static void main(String[] args) {
        MountainBikeChild M = new MountainBikeChild(23, 45, 65);

        M.show();
        System.out.println();
        M.ApplyBreak(44);
        System.out.println();
        M.show();
        System.out.println();
        M.SpeedUp(79);
        M.show();
        System.out.println();
    }
}
