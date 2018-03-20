import javax.swing.*;
import java.util.Scanner;

public class testing {
    public static void main(String[]args){
        String message= "Enter Your Name";
        String Caleb= null;
        do {
            Caleb = JOptionPane.showInputDialog(message);
            message = "<html><b style='color:red'>Enter Your Name:</b><br>" + "Use letters only.";
        }while (Caleb != null  !Caleb.matches(regex:"[a-zA-Z]+"));
        System.out.println("PlayerName: " + Caleb);

    }
}
