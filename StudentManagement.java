import java.util.*;
import java.io.*;
public class StudentManagement {
    private String name,rollno,grade, contact;
    public void setter(String name, String grade, String rollno, String contact) {
        this.name = name;
        this.grade = grade;
        this.rollno = rollno;
        this.contact = contact;
    }
public String getname()
{
    return this.name; 
}
    public void getter() {
        
                System.out.println("Student name is " + this.name);
                System.out.println("Student grade is " + this.grade);
                System.out.println("Student rollno is " + this.rollno);
                System.out.println("Student contactno. is " + this.contact);
            

        }
    }

    
 class Studentinformation {

     public static void main(String[] args)  {
        ArrayList<StudentManagement> L = new <StudentManagement> ArrayList(2);

        int count = 0, choice,i, n;
        boolean condition = true;
        while (condition) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1.Add student details");
            System.out.println("2.Display Student information");
            System.out.println("please enter a valid number for corresponding responce"); 
            n = sc.nextInt(); 
            try{ if(n!=1 && n!=2) // FOR SELECTING OPTION IF INVALID THEN EXCEPTION APPEARS
            throw new IllegalArgumentException();
            switch (n) {
                case 1: { // TO ADD STUDENT INFORMATION
                    String name, grade, rollno, contact;
        try{
                        System.out.println("Enter student name");
                        name = sc.next();
                        char[] arr = new char[name.length()]; // TO CONVERT ENTERED NAME TO CHAR ARRAY
                        arr = name.toCharArray();// TO CONVERT ENTERED NAME TO CHAR ARRAY
                    
                            for (i = 0; i < name.length(); i++)

                                if (arr[i] < 65 || arr[i] > 90 && arr[i] < 97 || arr[i] > 122) //CHECKING CHARECTER IS LETTER OR NOT
                                    throw new InputMismatchException("Exception: Invalid Name");//IF IS NOT LETTER THEN EXCEPTION
                            
         System.out.println("Enter student grade");
         grade = sc.next();
         char[] arr1 = new char[grade.length()];//TO CONVERT ENTERED GRADE TO CHAR ARRAY
         arr1 = grade.toCharArray();
                        
         for (i = 0; i < grade.length(); i++) // TO CHECK GRADE IS 1-12 OR NOT IF NOT THEN EXCEPTION
             {
                  if (grade.length() > 2)
 throw new InputMismatchException("EXCEPTION : INVALID GRADE, GRADE CAN ONLY BE FROM INTEGER 1-12");
if (grade.length() == 2) 
 {
                  if (!(arr1[1] == 49 || arr1[1] == 50 || arr1[1] == 48))
 throw new InputMismatchException( "EXCEPTION : INVALID GRADE, GRADE CAN ONLY BE FROM  INTEGER 1-12");
             }

     if (!(arr1[i] == 49 || arr1[i] > 48 && arr1[i] < 58))

      throw new InputMismatchException( "exception : INVALID GRADE, GRADE CAN ONLY BE FROM INTEGER 1-12");

                     }
            
      System.out.println("Enter student rollno.");
     rollno = sc.next();
      arr = new char[rollno.length()];
     arr = rollno.toCharArray();//TO CHECK ROLLNO. IS POSITIVE INTEGER OR NOT
                        
     for (i = 0; i < rollno.length(); i++)
         if (arr[i] < 48 || arr[i] > 57)
      throw new InputMismatchException("EXCEPTION : INVALID ROLLNO.");
                                
                                    
                          
      System.out.println("Enter student contactNo.");
     contact = sc.next();
     arr = new char[contact.length()];
     arr = contact.toCharArray();//TO CHECK CONTACT NO. IS VALID OR NOT
                        
     for (i = 0; i < contact.length(); i++) {
         if (contact.length() != 10)
  throw new InputMismatchException("EXCEPTION : INVALID CONTACTNO.");
     if (arr[i] < 48 || arr[i] > 57)
      throw new InputMismatchException("EXCEPTION : INVALID CONTACTNO.");
                            }
                            
 L.add(new StudentManagement());
 L.get(count).setter(name, grade, rollno, contact);
 System.out.println("New student added");
 count++;
     }catch(InputMismatchException e)
     { System.out.println("" +e.getMessage());
     System.out.println("STUDENT NOT ADDED");

     }
     break;
 }
                
 case 2: {
                    
 System.out.println("Enter student name to print details"); 

 String Name = sc.next();
 for ( i = 0; i < count; i++)
 {  if (L.get(i).getname().equalsIgnoreCase(Name))
     {
      L.get(i).getter();
         break;
     }
     }
     if(i==count)
     System.out.println("Student not found");
     }
                
     break;
     default:  System.out.println("Invalid input");

     } 
        } catch (IllegalArgumentException e) 
        {
            System.out.println("Exception Illegal input please select 1 or 2 " );
            continue;
        } 
            System.out.println("To continue enter 1 else enter 0");
            choice = sc.nextInt();
            if (choice == 0) {
                sc.close();
                condition = false;
            }

        }
        System.out.println("Programe ends bye bye.");

    }
}
