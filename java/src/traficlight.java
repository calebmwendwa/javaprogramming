import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class traficlight extends JApplet implements ActionListener{
    int s=0;
    Container x;
    public traficlight() throws HeadlessException{
        JButton caleb=new JButton("click here");
        x=this.getContentPane();
        x.setLayout(new BorderLayout());
        x.add(caleb, BorderLayout.NORTH);
        caleb.addActionListener(this);
        x.setBackground(Color.green);
    }
    public void actionPerformed(ActionEvent e){
        s=(s+1)%3;
        if (s==0){
            x.setBackground(Color.green);
        }
        else if (s==2){
            x.setBackground(Color.orange);
        }
        else if (s==3){
            x.setBackground(Color.red);
        }
    }
}
