package Inheritance;

public class Bicycle {
    protected int gear;
    protected int speed;

   Bicycle(int Startgear, int Startspeed){
        this.gear= Startgear;
        this.speed= Startspeed;
    }

    public void Setgear(int value){
        this.gear= value;
    }

    public void ApplyBreak(int value){
        this.speed=this.speed - value;
    }

    public void SpeedUp(int value){
        this.speed=this.speed + value;
    }

    
}
