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
public String getgrade()
{
    return this.grade;

}
public void setgrade(String grade)
{
    this.grade = grade;

}
public String getroll()
{
    return this.rollno;

}
public void setroll(String rollno)
{
    this.rollno = rollno;

}
public String getcontact()
{
    return this.contact;

}
public void setcontact(String contact)
{
    this.contact = contact;

}
    public void getter() {
        
                System.out.println("Student name is " + this.name);
                System.out.println("Student grade is " + this.grade);
                System.out.println("Student rollno is " + this.rollno);
                System.out.println("Student contactno. is " + this.contact);
            

        }
    }

    class TemporaryStorage {
        public String name, grade, rollno, contact;
        
    }

    
    class Studentinformation { public int print(int i,int count,Scanner sc,ArrayList<StudentManagement> L){
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
     return i;
 }
    

     public static void main(String[] args)  { 
        ArrayList<StudentManagement> L = new <StudentManagement> ArrayList(2);

        int count = 0, choice,i, n;
        boolean condition = true;
        while (condition) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1.Add student details");
            System.out.println("2.Display Student information");
            System.out.println("3.Delete Student Information");
            System.out.println("4.Edit Student information ");
            System.out.println("please enter a valid number for corresponding responce"); 
            n = sc.nextInt(); 
            try{ if(n!=1 && n!=2 && n!=3 && n!=4) // FOR SELECTING OPTION IF INVALID THEN EXCEPTION APPEARS
                    throw new IllegalArgumentException();
                TemporaryStorage temp = new TemporaryStorage();
            switch (n) {
                case 1: { // TO ADD STUDENT INFORMATION
                    String name, grade, rollno, contact;
                    boolean CONDITION = true;
                    
                    try { 
                            while(CONDITION) { try{
                                System.out.println("Enter student name");
                              name = sc.next();
                                char[] arr = new char[name.length()]; // TO CONVERT ENTERED NAME TO CHAR ARRAY
                                arr = name.toCharArray();// TO CONVERT ENTERED NAME TO CHAR ARRAY

                                for (i = 0; i < name.length(); i++)
                                    if (arr[i] < 65 || arr[i] > 90 && arr[i] < 97 || arr[i] > 122) //CHECKING CHARECTER IS LETTER OR NOT
                                    {
                                        arr = null;
                                        throw new InputMismatchException("Exception: Invalid Name");
                                    } //IF IS NOT LETTER THEN EXCEPTION
                                if (i == name.length())
                                {
                                    CONDITION = false;
                                    temp.name = name;
                                }
                            }
                            
                        
                            catch (InputMismatchException e) 
                           {
                                System.out.println("" + e.getMessage());
                                
                              }
                        }
                       
                                CONDITION = true;                 
                                while (CONDITION) {
                                    try {
                                        System.out.println("Enter student grade");
                                        grade = sc.next();
                                        char[] arr1 = new char[grade.length()];//TO CONVERT ENTERED GRADE TO CHAR ARRAY
                                        arr1 = grade.toCharArray();

             for (i = 0; i < grade.length(); i++) // TO CHECK GRADE IS 1-12 OR NOT IF NOT THEN EXCEPTION
               {  if (grade.length() > 2)
                {arr1 = null; throw new InputMismatchException(
                            "EXCEPTION : INVALID GRADE, GRADE CAN ONLY BE FROM INTEGER 1-12");
                }
                 if (grade.length() == 2) {
                     if (!(arr1[1] == 49 || arr1[1] == 50 || arr1[1] == 48))
               {arr1 = null;  throw new InputMismatchException(
                           "EXCEPTION : INVALID GRADE, GRADE CAN ONLY BE FROM  INTEGER 1-12");
               }
                                            }

         if (!(arr1[i] == 49 || arr1[i] > 48 && arr1[i] < 58))

    {arr1 = null;  throw new InputMismatchException(
                "exception : INVALID GRADE, GRADE CAN ONLY BE FROM INTEGER 1-12");
    }

}
if (i == grade.length())
{
    CONDITION = false;
    temp.grade = grade;
}
                      } catch (InputMismatchException e) {
                                        System.out.println("" + e.getMessage());
                                    }
                                }
                                CONDITION = true;
     while(CONDITION){ try{                                 
      System.out.println("Enter student rollno.");
     rollno = sc.next();
     char [] arr2 = new char[rollno.length()];
     arr2 = rollno.toCharArray();//TO CHECK ROLLNO. IS POSITIVE INTEGER OR NOT
                        
     for (i = 0; i < rollno.length(); i++)
         if (arr2[i] < 48 || arr2[i] > 57) { arr2 = null;
      throw new InputMismatchException("EXCEPTION : INVALID ROLLNO.");}
      if(i==rollno.length())                          
      {
          CONDITION = false;
          temp.rollno = rollno;
      }
      } catch(InputMismatchException e)
      {
          System.out.println("" + e.getMessage());
      }
  }
  CONDITION = true;
    while(CONDITION){ try{                    
      System.out.println("Enter student contactNo.");
     contact = sc.next();
    char [] arr3 = new char[contact.length()];
     arr3 = contact.toCharArray();//TO CHECK CONTACT NO. IS VALID OR NOT
                        
     for (i = 0; i < contact.length(); i++) {
         if (contact.length() != 10){ arr3 = null;
  throw new InputMismatchException("EXCEPTION : INVALID CONTACTNO.");}
     if (arr3[i] < 48 || arr3[i] > 57){arr3 = null;
      throw new InputMismatchException("EXCEPTION : INVALID CONTACTNO.");}
}
if (i == contact.length())
{
    CONDITION = false;
    temp.contact = contact;
}
                        } catch(InputMismatchException e)
                        {
                            System.out.println("" + e.getMessage());
                        }
                    }
                            
                            L.add(new StudentManagement());
 
 L.get(count).setter(temp.name, temp.grade, temp.rollno, temp.contact);
 System.out.println("New student added");
 count++;
     }catch(InputMismatchException e)
     { System.out.println("" +e.getMessage());
     System.out.println("STUDENT NOT ADDED");

     }
     
 }
     break;
                
 case 2: {
     int j = 0;
     Studentinformation Si = new Studentinformation(); 
     Si.print(j, count, sc, L);               

     }
                
         break;
     case 3: {
         int k = 0;
         Studentinformation si = new Studentinformation();
         System.out.println("Old information");
       k=si.print(k, count, sc, L);
         System.out.println("Do you really want to delete this Student information? yes or No?");
         String wish = sc.next();
         if(wish.equalsIgnoreCase("yes"))
             L.remove(k);
         System.out.println("Student's Record is deleted.");

     }
         break;
     case 4: {int k = 0;
         Studentinformation si = new Studentinformation();
         System.out.println("Old information");
       k=si.print(k, count, sc, L);
    System.out.println("What do you want to edit pls enter 1 for grade,2 for rollno,3 for contact");
    n = sc.nextInt();
    switch (n) {
        case 1:
            System.out.println("Old grade is " + L.get(k).getgrade());
            System.out.println("Enter new grade :");
            L.get(k).setgrade(sc.next());
            break;
        case 2:
            System.out.println("Old rollno. is " + L.get(k).getroll());
            System.out.println("Enter new rollno : ");
            L.get(k).setroll(sc.next());
            break;
    case 3: System.out.println("Old ContactNo. is " + L.get(k).getcontact());
            System.out.println("Enter new CONTACTNO. :");
            L.get(k).setcontact(sc.next());
            break;
    }
        
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