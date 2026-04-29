class Company{
    String name, industry;
    int founding_year;
    void industry(String industry){
        System.out.println(industry);
    }
}
class Toyota extends Company{
    void info(String name, int founding_year){
        System.out.println("Name: " + name);
        System.out.println("Founding year: " + founding_year);
    }
}
class Single_Inheritance{
    public static void main(String[] args) {
        Toyota obj = new Toyota();

        obj.industry("Car");
        obj.info("Toyota", 1999);
    }
}