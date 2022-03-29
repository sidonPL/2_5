import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rok do sprawdzenia czy jest przęstępny?");
        int rok = scan.nextInt();
        if(rok%4==0 && rok%100!=0 || rok%400==0)
        {
            System.out.println("Podany rok " + rok + " jest przestępny");
        }
        else
        {
            System.out.println("Podany rok " + rok + " nie jest przestępny");
        }

    }
}