package ro.fasttrackit.curs7;

import java.sql.SQLOutput;

public class PersonMain {
    public static void main(String[] ags){

        Person person1 = new Person("Mihai",34, true);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getName() + " is married - " + person1.getMarried());
        System.out.println();
        Person person2 = new Person("Andreaa",23, false);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getName() + " is married - " + person2.getMarried());
        System.out.println();
        Person person3 = new Person("Iulia",40, false);
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.getName() + " is married - " + person3.getMarried());

    }
}
