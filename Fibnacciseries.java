import java.util.*;
 public class Fibnacciseries 
 {
     public int terms;

public int fibnacci(int i)
{
    if (i == 0)
        return 0;
    if (i == 1)
        return 1;
    else
        return (fibnacci(i - 1) + fibnacci(i - 2));

}
public static void main(String [] args)
{
    int i;
    System.out.println("How many terms do you want to print for Fibnacci series?");
    Scanner sc = new Scanner(System.in);
    Fibnacciseries fb = new Fibnacciseries();
    fb.terms = sc.nextInt();
    for(i=0; i<fb.terms; i++)
        System.out.println(" "  +fb.fibnacci(i));
    sc.close();
     

}
    
}
