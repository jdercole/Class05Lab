
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
        this.needleType = needleType;
    }
    
    public final void defendFromPredatorsWithNeedles() {
        
    }
}
