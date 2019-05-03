/**
 * @author Jerry Zhu
 * @version 21.04.19
 * 
 * This program is the Jacket class to create a Jacket object that is owned by the Student.
 *
 * <h2>Course Info</h2>
 * ICS4U0 Ms. Krasteva
 *
 */
public class Jacket {
    Student owner;

    /**
     * Jacket constructor
     * @param me: the student who owns the jacket
     */
    public Jacket(Student me) {
        this.owner = me;
    }

    @Override
    public String toString() {
        return "Jacket owner: " + owner;
    }
}