
public class methods {
    // no return and no argument
    void display(){
        System.out.println("Hello World");
    }
    void add(int a,int b){
        System.out.println("no return with argument");
        int s=a+b;
        System.out.println(s);

    }
    int getno() {
        System.out.println("return without argument");
        int n = 56;
        System.out.println("the number is:" + n);
        return n;
    }

    int mul(int a, int b){
        System.out.println("return with argument");
        int pro=a*b;
        System.out.println("the number is:" + pro);
        return pro;





    }
    public static void main(String[] args) {
        methods obj = new methods();
        obj.display();
        obj.add(10,20);
        int k=obj.getno();
        System.out.println("the number is:" + k);
        int j=obj.mul(10,20);
        System.out.println("the number is:" + j);

    }
}
