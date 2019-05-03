/**
 * @author Jerry Zhu
 * @version 21.04.19
 * 
 * This is the ClassRoom class simulating a real class.
 *
 * <h2>Course Info</h2>
 * ICS4U0 Ms. Krasteva.
 *
 */
public class ClassRoom {
  String course;
  String teacher;
  
  /**
   * Constructor for ClassRoom
   *
   * @param course: the course of the class
   * @param teacher: the class' teacher
   */
  public ClassRoom(String course, String teacher) 
  {
    this.course = course;
    this.teacher = teacher;
  }
  
  /**
   * If the student entering the class doesn't have a locker, they get sent to the office, if they have a jacket,
   * they get sent to their locker to put it back and are not let in, if they have less than a certain number of books,
   * they are not let in.
   *
   * @param student: the student entering the classroom
   * @return boolean for whether or not the student was let inside
   */
  public Boolean enterClass(Student student) 
  {
    System.out.println("Student " + student + " walked into the class " + course + " taught by " + teacher+".");
    if (student.myLocker == null) 
    {
      student.sendToOffice("Get a locker");
      return false;
    }
    
    if (student.myJacket != null) 
    {
      student.myLocker.putJacket(student.myJacket); //put jacket back in locker
      return false;
    }
    
    if (student.books.length < 1) 
    {
      student.sendToOffice("Class " + course + " requires at least one book");
      return false;
    }
    
    for(int x = 0; x < student.books.length; x++)
    {
      if (student.books[x] != null && !student.books[x].equals(course)) 
      {
        student.sendToOffice(student + " doesn't have the right type of book.");
        return false;
      }
    }
    return true;
  }
}