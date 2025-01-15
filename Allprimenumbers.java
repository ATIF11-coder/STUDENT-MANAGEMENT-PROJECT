import java.util.*;
public class Allprimenumbers
{
    public static int num1, num2,i,j,count=0 ;
    public static void main(String [] args)
    {
        System.out.println("find all prime numbers between two (+)integers");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
     for(i = num1+1; i < num2; i++)
     {
         for (j = 2; j < i; j++) {
             if (i % j == 0)
                 break;
         }
         if (j == i)
          {   System.out.println(" " + i);
              count++;
          }
     }
     System.out.println("Total prime numbers are " + count);

    sc.close();

 }
    

}
