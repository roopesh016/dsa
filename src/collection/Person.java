package collection;

import java.util.ArrayList;
import java.util.Collections;

//Comparable interface is about natural ordering of the class data type
public class Person implements Comparable<Person>{
    int age;
    String name;


     Person(int age, String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person o) {
        if(this.age < o.age)
            return -1;
        else if(this.age > o.age)
            return 1;
        else
            return 0;
    }


    public static void main(String[] args) {
        Person p1 = new Person(20,"Rummy");
        Person p2 = new Person(17,"Hari");
        Person p3 = new Person(25,"Vishnu");

        ArrayList<Person> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);

        Collections.sort(al, new PersonUsingCompartor());

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i).age);
        }
    }
}
