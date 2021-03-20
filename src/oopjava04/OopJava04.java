
package oopjava04;

/**
 *
 * @author Piassa
 */
public class OopJava04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Pencil p1 = new Pencil("Bic Blue", 0.5f, "Blue", 100);
           
           p1.cover();
           p1.status();
           
           System.out.println("Using get: " + "capped: "+ p1.getCapped()+ " Color: " +  p1.getColor());
    }
    
}
