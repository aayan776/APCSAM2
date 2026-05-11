abstract class Objects{
    abstract void shape();
}
class Sphere extends Objects{
    void shape(){
        System.out.println("Sphere");
    }
}
class Cuboid extends Objects{
    void shape(){
        System.out.println("Cuboid");
    }
}
class Prism extends Objects{
    void shape(){
        System.out.println("Prism");
    }
}
class Abstract{
    public static void main(String[] args) {
        Sphere obj1 = new Sphere();
        obj1.shape();

        Cuboid obj2 = new Cuboid();
        obj2.shape();

        Prism obj3 = new Prism();
        obj3.shape();

    }
}