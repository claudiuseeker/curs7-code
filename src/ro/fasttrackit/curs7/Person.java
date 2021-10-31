package ro.fasttrackit.curs7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean maried){
        this.name = name;
        this.age = age;
        this.married= maried;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getMarried(){
        return married;
    }

}
