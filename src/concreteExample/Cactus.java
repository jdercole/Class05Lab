
package concreteExample;


public class Cactus extends Succulent {
    private String needleType;

    public Cactus(String scientificName, String genus) {
        super(scientificName, genus);
        setNeedleType(needleType);
    }

    public final String getNeedleType() {
        return needleType;
    }

    public final void setNeedleType(String needleType) {
        if (needleType == null) {
            throw new IllegalArgumentException("Needletype must have a value!");
        } else {
            this.needleType = needleType;
        } 
    }
    
    public final void defendFromPredatorsWithNeedles() {
        this.getOutputService().doConsoleOutput("I have needles so animals don't eat me!");
    }
}
