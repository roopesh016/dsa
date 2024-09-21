package Oops;

public class ClientThree {


    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 10;
        e1.name = "A";

        Employee e2 = new Employee();
        e2.age = 20;
        e2.name = "B";
        swap(e1,e2);

        e1.display();
    }

    private static void swap(Employee s1, Employee s2) {
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }


}
