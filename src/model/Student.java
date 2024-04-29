package model;

public class Student {
    private String name;
    private String university;

    public Student() {
    }

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void info() {
        System.out.println(name + " " + university);
    }

    //метод, студент приветсвует другого студента
    //перегрузка методов - возможность создания в одном классе нескольких методов с одинаковым именем
    //но уникальным списком параметров
    //варианты перегрузок метода


    public void greeting(String name) {
        System.out.println(this.name + ": hi, " + name);
    }

    public void greeting(String name, String university) {
        System.out.println(this.name + ": hi " + name + " from " + university);
    }

    public void greeting(Student student) {
        System.out.println(name + ", hi " + student.name + " from " + student.university);
    }

//    public void greeting(Student[] arrayStudent){
//        System.out.println(name + " hi:");
//        for (Student student : arrayStudent) {
//            System.out.println(student.name);
//        }
//    }

    //метод с переменным кол-вом аргументов (можно пррислать 1, 2, 3 или множество объектов указанного
    // типа или даже сразу массив)
    //arrayStudent технически считается ссылкой на массив
    public void greeting(Student ... arrayStudent){
        System.out.println(name + " hi:");
        //arrayStudent[0]
        for (Student student : arrayStudent) {
            System.out.println(student.name);
        }
    }

    public void greeting(Object object){

    }

}
