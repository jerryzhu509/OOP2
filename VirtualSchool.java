/**
 * @author Jerry Zhu
 * @version 21.04.19
 * 
 * The tester class creating a simulation of a virtual school.
 *
 * <h2>Course Info</h2>
 * ICS4U0 Ms. Krasteva
 */

public class VirtualSchool
{
  /** Description of main(String [] args)
    *  This method calls the various constructors to create the VirtualSchool.
    * 
    *  @param args [ ]  String array that allows command line parameters to be used when executing the program.
    */ 
  public static void main(String[] args) 
  {
    Student me = new Student("Arthur");
    System.out.println("Student: "+me+"\n"); 
    
    System.out.println(me.myLocker);
    System.out.println(me.myJacket);
    System.out.println(me.books.length);
    
    System.out.println();
    
    // Attempt to enter the classroom of Mr. Strict
    ClassRoom ics4m1 = new ClassRoom("ICS4M1", "Mr. Reid");
    if (ics4m1.enterClass(me) == true)
    {
      System.out.println(me+ " was allowed into class.");
      System.out.println(me+ " brought no jacket to class, has the correct number and type of books, and has a locker.");
    }
    else
    {
      System.out.println(me+" was not allowed into class.");     
      if (me.myJacket == null)
        System.out.println(me+" is not allowed because " + me + " brought a jacket to class.");
      if (me.myLocker == null)
        System.out.println(me+" is not allowed because " + me + " has no locker.");
      if (me.books.length < 1)
        System.out.println(me+" is not allowed because " + me + " doesn't have a book.");
    }
    
    System.out.println();
    
    // Attempt to enter the classroom of Mr. Strict
    ClassRoom idc4u1 = new ClassRoom("IDC4U1", "Mr. Strict");
    if (idc4u1.enterClass(me) == true)
    {
      System.out.println(me+" was allowed into class.");
      System.out.println(me+ " has no jacket, has the correct number and type of books, and has a locker.");
    }
    else
    {
      System.out.println(me+" was not allowed into class.");
      if (me.myJacket == null)
        System.out.println(me + " is not allowed because " + me + " brought a jacket to class.");
      if (me.myLocker == null)
        System.out.println(me+" is not allowed because " + me + " has no locker.");
      if (me.books.length < 1)
        System.out.println(me+" is not allowed because " + me + " doesn't have a book.");
    }
  }
} // VirtualSchool class

