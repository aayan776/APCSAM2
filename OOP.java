class NASA{
    String sciencename;
    int missionyear;
    NASA(String sciencename, int missionyear){
        this.sciencename = sciencename;
        this.missionyear = missionyear;
    }
    void displayinfo(){
        System.out.println("Science field: " + sciencename);
        System.out.println("Mission year: " + missionyear);
    }
    void launch(){
        System.out.println(sciencename + " Mission Lauched");
    }
}
class OOP{
    public static void main(String[] args) {
        NASA n1 = new NASA("Lunar Geology", 2026);
        n1.displayinfo();
        n1.launch();
    }
}