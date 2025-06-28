public class construtor1 {
    int y,p;
    // parameterized constructor
    construtor1(int x,int p){
        y=x;
        this.p=p;
        //System.out.println("Parameterized constructor called with value: " + y);

    }
    public static void main(String[] args) {
        construtor1 boj=new construtor1(10,11);
        System.out.println("Value of y: " + boj.y);
        System.out.println("Value of p: " + boj.p);
    }
}
