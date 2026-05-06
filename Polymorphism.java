

class Area{
    public double getArea(){
        return 0;
    }
}
class Trapezium extends Area{
    private int h;
    private int a;
    private int b;

    public Trapezium(int h, int a, int b){
        this.h = h;
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return 0.5 * (a + b) * h;
    }
}
class Rhombus extends Area{
    private int p;
    private int q;

    public Rhombus(int p, int q){
        this.p = p;
        this.q = q;
    }
    public double getArea(){
        return 0.5 * p * q;
    }
}
class Polymorphism{
    public static void main(String[] args) {
        Area[] arr = new Area[2];
        arr[0] = new Trapezium(5, 8, 4);
        arr[1] = new Rhombus(5,6);

        System.out.println(arr[0].getArea());
        System.out.println(arr[1].getArea());
    }
}