class Netflix{
    void search(String title){
        System.out.println("Searching for: " + title);
    }

    void search(String genre, boolean isGenre){
        if (isGenre){
            System.out.println("Searching for movies in the genre: " + genre);
        }
    }
    void search(String title, int year){
        System.out.println("Searching for: " + title + " Release year: " + year);
    }
    void search(String title, String lang){
        System.out.println("Searching for: " + title + " In " + lang + " language");
    }
}
class Method_Overloading{
    public static void main(String[] args) {
        Netflix obj1 = new Netflix();

        obj1.search("Inception");
        obj1.search("Fantasy", true);
        obj1.search("Despicable Me", 2010);
        obj1.search("Moana", "English");
    }
}