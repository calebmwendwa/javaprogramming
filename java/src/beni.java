import javax.swing.*;
import java.util.Scanner;

public class beni {
    public static void main(String[]args){
        System.out.println("Hello World!!");
        Scanner j=new Scanner(System.in);
        System.out.print("Enter first number");
        int firstNumber=j.nextInt();
        Scanner k=new Scanner(System.in);
        System.out.print("Enter second number");
        int secondNumber=k.nextInt();
        int sum=firstNumber/secondNumber;
        System.out.println("The answer is" +sum);
        System.out.println(6*4);
        int d, m, ans;
        d = 6;
        m = 4;
        ans = 6*4;
        JOptionPane.showMessageDialog(null,"The answer is" +sum);

    }

}
