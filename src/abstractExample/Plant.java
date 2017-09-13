
package abstractExample;


public abstract class Plant {
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
    
    public abstract void grow();
    
    public abstract void produceFlowers();
    
    public abstract void photosynthesize();
    
}
