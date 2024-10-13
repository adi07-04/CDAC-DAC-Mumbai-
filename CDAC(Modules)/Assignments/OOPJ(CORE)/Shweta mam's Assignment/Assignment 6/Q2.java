import java.util.*;

class  SortByName implements Comparator<Person>{
    @Override
    public int compare(Person p1 , Person p2){
        return p1.Name.compareTo(p2.Name);
    }
}
class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.Age - o2.Age;
    }
}
class Person {
    String Name;
    int Age;

    Person(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

}

public class Q2 {
    public static void print(List<Person> list){
        for (Person ele: list ) {
            String formatted = String.format("%-12s%d", ele.Name, ele.Age);
            System.out.println(formatted);
        }
    }

    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        Person p1 = new Person("Atharva",22);
        Person p2 = new Person("Amey",16);
        Person p3 = new Person("Sahil",23);
        Person p4 = new Person("Ojas",15);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

//        print(set);
        System.out.println("Sort By Age : ");
        Collections.sort(set,new SortByAge());
        print(set);
        System.out.println();
        System.out.println("Sort By Name : ");
        Collections.sort(set,new SortByName());
        print(set);

    }
}
