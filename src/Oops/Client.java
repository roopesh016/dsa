package Oops;

public class Client {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 10;
        e1.name = "A";
        e1.display();

        Employee e2 = e1;
        e2.age = 20;
        e2.name = "B";

        e2.display();

        e1.display();
    }
}
