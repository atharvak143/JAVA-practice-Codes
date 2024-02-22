package Inheritance.Interface;

/**
 * Interfaces
 */

 //Interfaces is a reference type,similar to class,that can contaion only constants,method signatures
    //also default & static methods & nested type

// Abstarct class are less retricted as compared to interface
// because it does not allow implementation of any method
// but in abstract class it only does not allow the method with abstract
public interface Interfaces {

    // int x; wrong declartion
    int x=5;
    public int gear=7;
   public int speed=9;
    void ApplyBreak(int value);
    void SpeedUp(int value);
    
} 
    

