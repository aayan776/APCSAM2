class Parent{
    void eat(){
        System.out.println("Parent eating");
    }
}
class Child extends Parent{
    @Override
    void eat(){
        System.out.println("Family eating");
    }
}
class Method_Overriding{
    public static void main(String[] args) {
        Parent obj1 = new Child();
        Parent obj2 = new Parent();
        Child obj3 = new Child();

        obj1.eat();
        obj2.eat();
        obj3.eat();
    }
}