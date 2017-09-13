
package interfaceExample;


public class Cactus extends Succulent {
    private int numberOfLeaves;
    private String color;
    private String name;
    private String leafType;
    private String needleType;

    public final int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public final void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getLeafType() {
        return leafType;
    }

    public final void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    public final String getNeedleType() {
        return needleType;
    }

    public final void setNeedleType(String needleType) {
        this.needleType = needleType;
    }

    @Override
    public void grow() {
        //grow in cactus-y way
    }

    @Override
    public void photosynthesize() {
        //photosynthesize in cactus-y way
    }

    @Override
    public void produceFlowers() {
        //cactus implementation of producing flowers
    }
    
    public void defendFromPredatorsWithNeedles() {
        //defense!
    }
    
}
