
package concreteExample;


public class Cactus extends Succulent {
    private String needleType;
    private int numberOfLeaves;
    private String color;
    private String name;

    public String getNeedleType() {
        return needleType;
    }

    public void setNeedleType(String needleType) {
        this.needleType = needleType;
    }

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
    
    @Override
    public void grow() {
        //grow in cactus-specific way
    }
    
    @Override
    public void produceFlowers() {
        //product flowers in cactus-specific way
    }
    
    @Override
    public void photosynthesize() {
        //absorb sunlight in cactus-specific way
    }
    
    public void defendFromPredatorsWithNeedles() {
        //grow cactus needles
    }
}
