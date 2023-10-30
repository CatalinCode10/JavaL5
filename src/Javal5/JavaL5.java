import java.util.Scanner;
public class JavaL5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti un string: ");
        String str = input.nextLine();
        int pozitia;
        int len;
        if (str.length() % 2 == 0)
        {
            pozitia = str.length() / 2 - 1;
            len = 2;
        }
        else
        {
            pozitia = str.length() / 2;
            len = 1;
        }
        System.out.print("Mijlocul stringu-ului este: " + str.substring(pozitia, pozitia + len));
    }
}