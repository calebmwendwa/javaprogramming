import java.util.*;
public class arrayruby {
    public static void main(String[] args){
    double[] ruby;
    double sum;
        Scanner jack;

        ruby=new double[4];
        System.out.println("Enter price of bag");
        jack=new Scanner(System.in);
        ruby[0]=jack.nextDouble();
        ruby[1]=jack.nextDouble();
        ruby[2]=jack.nextDouble();
        ruby[3]=jack.nextDouble();
        sum=ruby[0]+ruby[1]+ruby[2]+ruby[3];
        System.out.println(sum);


    }
}
