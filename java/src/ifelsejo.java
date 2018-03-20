import javax.swing.*;

public class ifelsejo {
    public static void main(String[] args){
        String radius, height;
        double h, r, volume;
        height= JOptionPane.showInputDialog("Height");
        radius= JOptionPane.showInputDialog("Width");
        h=Double.parseDouble(height);
        r=Double.parseDouble(radius);
        volume=Math.PI*h*r*r;
        if (volume<=30){
            System.out.println("Fill water");
        }
        else if (volume<=20){
            System.out.println("Empty");
        }
        else if (volume>=100){
            System.out.println("Full");
        }
        JOptionPane.showMessageDialog(null,volume);

    }
}
