package task_1;

public class Person {
    String name;
    String surname;
    String university;
    int age;


    public Person(String name, String surname, String university, int age) {
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.age = age;
    }

    public void display() {
        System.out.println("name:" + name + '\n' + "surname:" + surname + "\n" + "university:" + university + "\n" + "age:" + age);
    }
}
