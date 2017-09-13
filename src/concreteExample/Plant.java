
package concreteExample;


public class Plant {
    private int numberOfLeaves;
    private String color;
    private String name;

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void grow() {
        //does some growing
    }
    
    public void produceFlowers() {
        //returns object of type Flower (hypothetically)
    }
    
    public void photosynthesize() {
        //absorb some sunlight
    }
    
    
}
