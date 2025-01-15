import java.util.*;
   
  public class Maxnumber
{
    public static void main(String [] args)
{
    int i,number_of_elements , max;
    System.out.println("how many numbers do you want to enter ? ");
    Scanner sc = new Scanner(System.in);

    number_of_elements = sc.nextInt();
    System.out.println("please enter the numbers");
    int[] arr = new int[number_of_elements];
  for( i = 0; i < number_of_elements ; i++)
      arr[i] = sc.nextInt();
  max = arr[0];
  
  for(i = 0; i < number_of_elements ; i++)
  { if(max < arr[i])
     max = arr[i];
  }
System.out.println("max number is " + max);
sc.close();

  }


}
