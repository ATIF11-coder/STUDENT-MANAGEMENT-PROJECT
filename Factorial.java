import java.util.*;

public class Factorial 
{
    public static void main(String [] args)
{   double fac = 1;
     int number, i;

    System.out.println("Enter a posetive integer to find its factorial");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();
    for(i = number; i >= 1; i--)
    {
        fac = fac * i;
  }
System.out.println("Factorial of " +number+ " is "+fac);
sc.close();

}
   
    
}
