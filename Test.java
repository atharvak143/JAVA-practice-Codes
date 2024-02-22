public class Test {
    private int a;
    private int b;

    public  Test(int a , int b){
        this.a=a;
        this.b=b;

    }
    public int sum (int a, int b){
        int c= a+b;
        return c;

    }

    public boolean verify(int a){
        this.a=a;
        int prime=0;
        for (int i=2;i<a;i++) {
            if(i%2==0){
                prime=1;
                break;
            }
            else{
                prime=0;
            }
        }
        if(prime==1){
            return false;
        }
        else{
            return true;
        }
        

    }
    
}
