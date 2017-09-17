
package concreteExample;




public class Plant {
    private String scientificName;
    private String genus;
    private OutputService outputService;
    private InputService inputService;
    private Flower flower;
    
    public Plant(String scientificName, String genus) {
        setScientificName(scientificName);
        setGenus(genus);
        outputService = new OutputService();
        inputService = new InputService();
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

    public final OutputService getOutputService() {
        return outputService;
    }

    public final void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public final InputService getInputService() {
        return inputService;
    }

    public final void setInputService(InputService inputService) {
        this.inputService = inputService;
    }
    
    public void grow() {
        photosynthesize();
        outputService.doConsoleOutput("Growing is happening!");
    }
    
    public Flower produceFlowers() {
        //returns object of type Flower (hypothetically)
        grow();
        outputService.doConsoleOutput("What's the color of the flower?: ");
        String color = inputService.getInput();
        flower = new Flower(color);
        return flower;
    }
    
    private void photosynthesize() {
        //absorb some sunlight
        outputService.doConsoleOutput("I'm absorbing sunlight through leaves to turn into energy!");
    }
    
    
}
