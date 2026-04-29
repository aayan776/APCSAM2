class Mammals{
    void mammal(){
        System.out.println("Class: Mammalia");
    }
}
class Lion extends Mammals{
    void lion(){
        System.out.println("Genus Panthera");
    }
}
class Human extends Mammals{
    void human(){
        System.out.println("Genus Homo");
    }
}
class Hierarchical{
    public static void main(String[] args) {
        Human obj1 = new Human();
        Lion obj2 = new Lion();

        obj1.human();
        obj2.lion();
        obj2.mammal();
        obj2.human();
    }
}