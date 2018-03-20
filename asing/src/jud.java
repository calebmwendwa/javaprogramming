import javax.swing.*;
import java.util.*;
public class jud {
    public static void main(String[]args){

        String me, you, us;
        me= JOptionPane.showInputDialog("Enter grade one");
        you= JOptionPane.showInputDialog("Enter grade two");
        us= JOptionPane.showInputDialog("Enter grade three");

        int one=Integer.parseInt(me);
        int two=Integer.parseInt(you);
        int three=Integer.parseInt(us);

        SortedSet<Integer> set=new TreeSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        Integer [] intArray=set.toArray(new Integer[3]);
        JFrame frame=new JFrame();
        JOptionPane.showInternalMessageDialog(frame.getContentPane(), String.format("Result % f", (intArray[1] + intArray[2]/2.0)));
    }
}
