import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        int artıkYıl  , yıl;


        System.out.print("Yıl Giriniz :");
        yıl = input.nextInt();


        if (yıl % 4 ==0) {

            if (yıl % 400 == 0) {
                System.out.println("Artık Yıldır ");
            } else {
                System.out.println("Artık Yıl Değildir ");
            }
        }
    }
}
