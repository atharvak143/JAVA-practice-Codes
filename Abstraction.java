public abstract class Abstraction {
    //we cannot make a instance of class
    //method is only declared no implementation
    //child class can do implementation of method

    int x,y;

    void move(){
        System.out.println("Hello World");
    }
    abstract void draw();
    abstract void resize();

    // if we want to make a instance of abstract class then syntax is
    // class_name  instance = new child_class_name;

    public static void main(String[] args) {
        Abstraction a=new ChildOfAbstraction();

        a.move();
    }

}
