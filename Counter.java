class Counter{
    int n = 10;
    void increment(){
        n += 1;
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println(obj1.n);
        System.out.println(obj2.n);
        System.out.println(obj3.n);
    }
}