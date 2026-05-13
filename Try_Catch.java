import java.util.InputMismatchException;
import java.util.Scanner;
class Try_Catch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        float z = x/y;
        }catch(ArithmeticException ex){
            System.out.println(ex.toString());
        }catch(InputMismatchException e){
            System.out.println(e.toString());
        }finally{
            System.out.println("DONE");
        }
    }
}