import model.Student;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Igor", "GSU");
        Student student2 = new Student("Masha", "BNTU");

//        Student[] students = new Student[5];
//        students[0] = student1;
//        ...
        //создание массива объектов с конкретным содержимым
        Student[] students = {
                student1,
                student2,
                new Student("Vitya", "MITSO"),
                new Student("Ira", "BGU"),
                new Student("Sasha", "GSTU")
        };

        for (Student student : students) {
             student.info();
        }

        System.out.println("---------------------------------");

        //вызов перегруженной версии только с именем
        student1.greeting(student2.getName());

        //вызов перегруженной версии только с именем и универом
        students[2].greeting(students[3].getName(), students[3].getUniversity());

        //вызов перегруженной версии с объектом
        students[4].greeting(students[2]);

        Student student3 = new Student("Grisha", "BELGUT");
        //вызов перегруженной версии только с массивом объектов
        student3.greeting(students);

        //используется метод с переменным кол-вом аргументов
        student3.greeting(student1, student2);
        student1.greeting(5);
    }
}
