package Oops;

public class ClientFour {



    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.age = 10;
        s1.name = "A";

        Employee s2 = new Employee();
        s2.age = 20;
        s2.name = "B";

        swap(s1, s2);

        s1.display();
    }

    private static void swap(Employee s1, Employee s2) {
        Employee temp = s1;
        s1 = s2;
        s2 = temp;
    }


}
