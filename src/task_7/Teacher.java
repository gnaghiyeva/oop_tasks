package task_7;

public class Teacher extends Person{
    String workplace;
    int experience;
    Student[] students;

    public Teacher(String name, String surname, int age,String workplace, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workplace = workplace;
        this.experience = experience;
//        this.students = students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void displayStudentsByGroupName(String groupName){
        System.out.println("Students in Group " + groupName + ":");

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.group.equals(groupName)) {
                System.out.println("Name: " + student.name);
                System.out.println("Surname: " + student.surname);
                System.out.println("University: " + student.university);
                System.out.println("Faculty: " + student.faculty);
                System.out.println("-------------------------");
            }
        }
    }


}
