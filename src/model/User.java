package model;

//очередность исполнения кода класса
//1. При первом упоминание класса в байт коде происходит его прогрузка в metaspace
//2. Обявление и инициализация static полей в metaspace
//3. исполнение static блоков кода
//исполнение кода связанного с создаением объектов
//1. Создание объекта при помощи new со значениями 0 и null
//2. Инициализация полей значениями при их объявлении
//3. нестатические блоки кода
//4. вызов конструктора


public class User {
    //Допускается инициализация полей класса при объявление, если в классе остсутствуют конструкторы
    private static int counter = 0;
    private int id = -2;
    private String name = "without";
    private String password = "pass";

    //static блок кода - исполняется при прогрузке класса один раз
    static {
        counter = 0;
        System.out.println("static блок кода");
    }

    //блок кода - метод без имени, который вызывается при создании объекта
    //блоков кода может несколько, все вызываются при создании каждого объекта
    {
        id = ++counter;
        System.out.println("Блок кода1");
    }

    {
        System.out.println("Блок кода2");
    }


    //цель контруктора - только инициализация полей
    public User() {
        this("none", "");
//        id = -1;
//        name = "none";
//        password = "";
    }

    public User(String name, String password) {
        //this.id = ++counter; вынесли в блок кода
        this.name = name;
        this.password = password;
    }

    public User(String name) {
        //this.id = ++counter;  вынесли в блок кода
        this.name = name;
    }

    public int getId() {
        return id;
    }

    //в этой задаче сеттер id не нужен
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void info() {
        System.out.println(id + " " + name + " " + password);
    }

    {
        System.out.println("Блок кода3");
    }
}
