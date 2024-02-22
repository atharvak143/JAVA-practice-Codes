public class ChildOfAbstraction extends Abstraction {
    void draw(){
        System.out.println("this is a circle");
    }

    void resize(){
        System.out.println("this sqaure");
    }

    public static void main(String[] args) {
        ChildOfAbstraction t = new ChildOfAbstraction();
        t.draw();
        t.resize();
        t.move();

        Abstraction a= new ChildOfAbstraction();
        a.move();
    }
}
