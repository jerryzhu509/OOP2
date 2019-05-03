/**
 * @author Jerry Zhu
 * @version 21.04.19
 * 
 * Lockers have a number and Student owner. They hold a Jacket, which can be put in or taken out, as well as up to four
 * Books, which can be put in or taken out.
 *
 * <h2>Course Info</h2>
 * ICS4U0 Ms. Krasteva
 */
public class Locker {
  int number;
  Student owner;
  private Jacket studentJacket;
  private Book[] books;
  
  /**
   * Locker constructor. Randomly generates a number from 0 - 1500 and lets the locker hold up to 4 books.
   * @param me the owner of the locker
   */
  public Locker(Student me) 
  {
    this.owner = me;
    this.number = (int) (Math.random() * 1500);
    this.books = new Book[4];
  }
  
  /**
   * Shows the Jacket currently in the locker. Does not remove it from the locker
   *
   * @return the Jacket in the locker
   */
  public Jacket checkJacket() 
  {
    return studentJacket;
  }

  /**
   * Puts the jacket in the locker, and removes it from the student who currently has it in hand.
   *
   * @param studentJacket the Jacket to be put in
   */
  public void putJacket(Jacket studentJacket) 
  {
    studentJacket.owner.myJacket = null; //remove the jacket from student
    if (this.studentJacket == null)
      this.studentJacket = studentJacket; //put the jacket in locker
    else
      throw new IllegalArgumentException("Jacket is already inside locker");
  }  
  
  /**
   * Takes the jacket out of the locker. Removes the jacket from the locker
   *
   * @return the Jacket
   */
  public Jacket getJacket() 
  {
    Jacket jacket = this.studentJacket;
    if (jacket != null) 
    {
      studentJacket = null;
      return jacket;
    } 
    else
      throw new IllegalArgumentException("No jacket in locker");
  }
  
  /**
   * Gets a book with the matching course from the locker. Completely removes the original Book from the locker when
   * taking it out.
   *
   * @param course: to match the name of the book
   * @return the first book in the list for that course. null if there is no book.
   */
  public Book getABook(String course) 
  {
    int i = 0;
    while(books[i] != null)
    {
      Book b = books[i];
      if (b.course.equals(course)) 
      {
        books[i] = null;
        return b;
      }
    }
    return null;
  }
  
  /**
   * Puts a book inside the locker. Unlike getABook(), it does not remove the book from whoever is putting it in.
   *
   * @param book the Book to be put in
   */
  public void putABook(Book book) 
  {
    for (int i = 0; i < books.length; i++)
    {
      if (books[i] == null) 
      {
        books[i] = book;
        return;
      }
    }
    throw new IllegalArgumentException("Locker already full of books");
  }
  
  @Override
  public String toString() {
    return owner + " owns locker number " + number + "." ;
  }
}