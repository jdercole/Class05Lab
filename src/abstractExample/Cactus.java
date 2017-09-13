/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractExample;


public class Cactus extends Succulent {
    private int numberOfLeaves;
    private String color;
    private String name;
    private String leafType;
    private String needleType;

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
    public String getLeafType() {
        return leafType;
    }

    @Override
    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    public String getNeedleType() {
        return needleType;
    }

    public void setNeedleType(String needleType) {
        this.needleType = needleType;
    }
    
    public void defendFromPredatorsWithNeedles() {
        //defend with needles!
    }
}
