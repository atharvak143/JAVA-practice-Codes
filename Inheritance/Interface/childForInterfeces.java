package Inheritance.Interface;


public class childForInterfeces extends Bicycle{
    
    public int seatHeight;

    public childForInterfeces(int startHeight,int Startgear,int Startspeed){
        super(Startspeed,Startgear);
        //super method is instance of base/parent class
        this.seatHeight=startHeight;
    }

    

    public static void main(String[] args) {
        childForInterfeces M = new childForInterfeces(23, 45, 65);

        
    }
}




