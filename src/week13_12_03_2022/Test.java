package week13_12_03_2022;

public class Test {

    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        this();
        System.out.println("B");
    }
    public Test(String str){
        this(100);


        System.out.println(str);
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
