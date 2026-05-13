interface Payment{
    public void send();
    public void check();
}
class Bkash implements Payment{
    public void send(){
        System.out.println("Sending money using Bkash...");
    }
    public void check(){
        System.out.println("Balance = 3000tk");
    }
}
class Nagad implements Payment{
    public void send(){
        System.out.println("Sending money using Nagad...");
    }
    public void check(){
        System.out.println("Balance = 5000tk");
    }
}
class Mobile_banking{
    public static void main(String[] args) {
        Nagad obj1 = new Nagad();
        Bkash obj2 = new Bkash();

        obj1.send();
        obj1.check();

        obj2.send();
        obj2.check();
    }
}