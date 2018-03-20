import javax.swing.*;

public class BMI {
    public static void main(String[]args){
        String height, weight;
        double h, w, bmi;
        height= JOptionPane.showInputDialog("Height");
        weight=JOptionPane.showInputDialog("Weight");
        h=Double.parseDouble(height);
        w=Double.parseDouble(weight);
        JFrame frame=new JFrame();
        bmi=h/(w*w);
        if (bmi>=80){
            System.out.println("too heavy");
        }
        else if ()

    }
}
