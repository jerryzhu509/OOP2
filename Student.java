/**
 * @author Jerry Zhu
 * @version 21.04.19
 * 
 * Students have a name and number to identify them, as well as a Jacket, Locker and Books.
 * Students can be sent to the office.
 *
 * <h2>Course Info</h2>
 * ICS4U0 Ms. Krasteva
 *
 */
public class Student {
    String name;
    String number;
    Locker myLocker;
    Jacket myJacket;
    Book[] books;

    /**
     * Constructor which instantiates everything for the student except for its name. The student's number is randomly
     * generated, and they can hold 4 books for their classes, but are not created with the books in hand.
     *
     * @param name the student's name
     */
    public Student(String name) 
    {
        this.name = name;
        this.number = Double.toString(Math.random() * 999999999);
        this.myLocker = new Locker(this);
        this.myJacket = new Jacket(this);
        this.books = new Book[4];
    }

    /**
     * Sends a student to the office, and prints why the student was sent.
     *
     * @param reason: the reason why the student was sent to the office
     */
    public void sendToOffice(String reason) 
    {
        System.out.println(toString() + " is sent to the office because " + reason);
    }

    @Override
    public String toString() {
        return name;
    }
}