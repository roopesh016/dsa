package Oops;

public class ClientTwo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 10;
        e1.name = "A";

        Employee e2 = new Employee();

        Employee temp = e1;
        e1 = e2;
        e2 = temp;

        e2.display();
    }
}
