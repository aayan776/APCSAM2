class Airport{
    void location(){
        System.out.println("Heading to: ");
    }
    void model(){
        System.out.println("Model of plane: ");
    }
}
class Plane1 extends Airport{
    void location(){
        System.out.println("Sylhet");
    }
    void model(){
        System.out.println("Boeing 767");
    }
}
class Plane2 extends Airport{
    void location(){
        System.out.println("Bangkok");
    }
    void model(){
        System.out.println("Boeing 600");
    }
}
class Plane3 extends Airport{
    void location(){
        System.out.println("Dubai");
    }
    void model(){
        System.out.println("Boeing 660");
    }
}
class Polymorph{
    public static void main(String[] args) {
        Airport a = new Airport();
        Airport b = new Plane1();
        Airport c = new Plane2();
        Airport d = new Plane3();

        a.location();
        b.location();
        c.location();
        d.location();

        
        a.model();
        b.model();
        c.model();
        d.model();
    }
}