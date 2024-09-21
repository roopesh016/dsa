package collection;

import java.util.Comparator;

//Un natural ordering  can be acheived using comparator
public class PersonUsingCompartor implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age < o2.age)
        return 1;
        else if(o1.age > o2.age)
        return -1;
        else
        return 0;
    }
}
