import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        // Ogoloshennja zminnyh ta klasiv neobhidnyh dlja opratsjuvannja
        Scanner sc = new Scanner(System.in);
        int i;
        String s;
        // logic realizatsia logiky programy
        System.out.println("please enter your Number: ");
        i = sc.nextInt();
        System.out.println("please enter your Text: ");
        s = sc.next();
        // Output vyhidni danni
        System.out.println("your Number is: " + i);
        System.out.println("your Text is: " + s);

    }

}
