package Oops;

public class ThisConstructor {
    String name;
    int age;
    long psp;
    String batch;

    ThisConstructor(String n){
        name = n;
//        System.out.println(n);
    }

    public static void main(String[] args) {

        ThisConstructor th = new ThisConstructor("Sahu");
        System.out.println(th.name);
    }
}
