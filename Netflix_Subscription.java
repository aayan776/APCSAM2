class Subscription{
    double price;
    String username;

    Subscription(String username, double price){
        this.username = username;
        this.price = price;
    }

    void ShowPlan(){
        System.out.println("Name: " + username);
        System.out.println("Price of subscription: " + price);
    }
}
class Premium extends Subscription{
    String quality;

    Premium(String username, double price, String quality){
        super(username, price);
        this.quality = quality;
    }
    @Override
    void ShowPlan(){
        super.ShowPlan();
        System.out.println("Plan type: Premium");
        System.out.println("Streaming quality: " + quality);
    }
}
class Netflix_Subscription{
    public static void main(String[] args) {
        Premium netflix = new Premium("Tawseef", 22.99, "4K HD");
        netflix.ShowPlan();
    }
}