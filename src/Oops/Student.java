package Oops;

public class Student{
    String name;
    int age;
    long psp;
    String batch;


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "roopesh";
        s1.age=27;
        System.out.println(s1.name);
        System.out.println(s1.age);
        Student s2 = new Student();
        s2.name = "Vishnu";
        s2=s1;
        System.out.println(s2.name);
    }

}


