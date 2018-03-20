import javax.swing.*;
import java.util.*;
public class main {
    public static void main(String[] args){
int grade, passingMarks;
Scanner input = new Scanner(System.in);
System.out.println("Input grade");
grade= input.nextInt();
if (grade >=80 && grade<=100)
        {
            System.out.println("excellent");
        }
         else {
            System.out.println("feel small and sit down");
        }
    }
}
