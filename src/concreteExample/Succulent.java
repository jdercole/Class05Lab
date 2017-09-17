
package concreteExample;


public class Succulent extends Plant {

    public Succulent(String scientificName, String genus) {
        super(scientificName, genus);
    }
    
    public void retainWater() {
       this.getOutputService().doConsoleOutput("I'm retaining water as succulents do.");   
    }
}
