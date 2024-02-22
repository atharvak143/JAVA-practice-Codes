public class Encapsulation {
    //Wrapping of Data
    private String name;
    private int age;
    private String address;

    public Encapsulation(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        
    }

    public void getData(String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void showData(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }

    public static void main(String[] args) {
        Encapsulation E = new Encapsulation("Atharva",0, "Ghodegaon");

        // String n ="Kotasthane";
        // int a= 19;
        // String ad="Asia";

        // E.getData(n, a, ad);
        E.showData();
    }

}
