
package concreteExample;

/**
 *
 * @author Jenna
 */
public class Flower {
    private String color;
    
    public Flower(String color) {
        setColor(color);
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) throws IllegalArgumentException {
        if (color == null) {
            throw new IllegalArgumentException("Must have color set!");
        } else {
            this.color = color;
        }
    }
    
    
    
}
