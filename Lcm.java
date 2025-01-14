import java.util.*;
 public class Lcm 
 {
     public static void main(String [] args)
     {
         int terms, max, product = 1, i, j;
         System.out.println("How many terms do you want to enter to find its LCM");
         Scanner sc = new Scanner(System.in);
         terms = sc.nextInt();
         int [] arr = new int[terms];
         System.out.println("enter values");
         for(i=0;i<terms;i++)
             arr[i] = sc.nextInt();
         max = arr[0];
        for(i=0;i<terms;i++)
       if(max<arr[i]) 
           max = arr[i];
    for(i=0;i<terms;i++)
        product = product * arr[i];
        for(i=max;i<=product;i++)
        {
            for (j = 0; j < terms; j++) {
                if (i % arr[j] != 0)
                    break;
            }
            if (j == terms)
                break;

        }
        System.out.println("LCM is " + i);
        sc.close();
    }
    
}
