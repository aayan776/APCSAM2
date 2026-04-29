class Hello{
    String str;
    public Hello(String str) {
        this.str = str;
    } 
    void display(){
        System.out.println(str);
    }
}
class Syntax{
    public static void main(String[] args) {
        Hello obj1 = new Hello("Hello World");
        obj1.display();
    }
}