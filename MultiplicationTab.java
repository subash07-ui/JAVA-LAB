
import java.util.Scanner;
class MultiplicationTab{

    int n;

    public void get()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=scn.nextInt();
         scn.close();
    }

    public void display()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }

    public static void main(String[] args)
    {
        MultiplicationTab obj=new MultiplicationTab();
        obj.get();
        obj.display();
    }
}
