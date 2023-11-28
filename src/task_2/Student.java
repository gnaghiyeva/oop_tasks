package task_2;

public class Student {
    String name;
    String surname;
    String university;
    int age;
    int examResult;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void display(){
        System.out.println("name:"+name+"\n"+"surname:"+surname+"\n"+"age:"+age+"\n"+"university:"+university+"\n"+"exam result:"+examResult+"\n");
    }

    public void showExamResultWithAlphabet(){
         if(examResult<51){
             System.out.println(name+" "+surname+","+"You failed the exam with F");
         } else if (examResult>=51 && examResult<=60) {
             System.out.println(name+" "+surname+","+"You passed the exam with E");
         }else if (examResult>=61 && examResult<=70) {
             System.out.println(name+" "+surname+","+"You passed the exam with D");
         }else if (examResult>=71 && examResult<=80) {
             System.out.println(name+" "+surname+","+"You passed the exam with C");
         }else if (examResult>=81 && examResult<=90) {
             System.out.println(name+" "+surname+","+"You passed the exam with B");
         }else if (examResult>=91 && examResult<=100) {
             System.out.println(name+" "+surname+","+"You passed the exam with A");
         }
    }
}
