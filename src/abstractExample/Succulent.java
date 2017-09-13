
package abstractExample;


public abstract class Succulent extends Plant {
    private int numberOfLeaves;
    private String color;
    private String name;
    private String leafType;

    @Override
    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    @Override
    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }
    
    @Override
    public void grow() {
        //grow in succulent-specific way
    }

    @Override
    public void produceFlowers() {
      //grow in succulent-specific way
    }

    @Override
    public void photosynthesize() {
      //grow in succulent-specific way
    }
    
    
}
