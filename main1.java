import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        System.out.println("Say something...");
        /**    int a = 5, b = 10;
         int sum = a + b;

         System.out.println("suma numerelor este " + a + " si " + b + " este " + sum);*/
        Scanner scanner = new Scanner(System.in);
        /*String ceAmCititDinConsola=scanner.nextLine();
        System.out.println("Am citit: "+ceAmCititDinConsola);*/

        //citim Actiuni: 0-exit, 1-suma, 2-diferenta
        System.out.println("Citim actiuni: 0-exit, 1-suma, 2-diferenta");
        int ceAmCititDinScanner = scanner.nextInt();
        if (ceAmCititDinScanner == 0) {
            System.out.println("Am citit exit");
        } else {
            System.out.println("Am citit altceva");

        }
    }
}

