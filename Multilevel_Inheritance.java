class Programmer{
    String cname;
    Programmer(String cname){
        this.cname = cname;
    }
    void name(){
        System.out.println("Hello, i am " + cname + ". I created the robot.");
    }
}
class Robot extends Programmer{
    String name;
    Robot(String cname, String name){
        super(cname);
        this.name = name;
    }
    void start(){
        System.out.println("I am " + name + ". I was created by " + cname + ".");
    }
}
class data extends Robot{
    int age;

    data(String cname, String name, int age){
        super(cname, name);
        this.age = age;
    }
    void info(){
        System.out.println("Name of creator: " + cname);
        System.out.println("Age of creator: " + age);
        System.out.println("Name of robot: " + name);
    }
}

class Multilevel_Inheritance{
    public static void main(String[] args) {
        data obj = new data("Tawseef", "Aayan", 15);

        obj.name();
        obj.start();
        obj.info();
    }
}