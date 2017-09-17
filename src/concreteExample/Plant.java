
package concreteExample;


public class Plant {
    private String scientificName;
    private String genus;
    
    public Plant(String scientificName, String genus) {
        setScientificName(scientificName);
        setGenus(genus);
    }


    public final String getScientificName() {
        return scientificName;
    }

    public final void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public final String getGenus() {
        return genus;
    }

    public final void setGenus(String genus) {
        this.genus = genus;
    }
    
    
    
    public void grow() {
        
    }
    
    public void produceFlowers() {
        //returns object of type Flower (hypothetically)
    }
    
    public void photosynthesize() {
        //absorb some sunlight
    }
    
    
}
