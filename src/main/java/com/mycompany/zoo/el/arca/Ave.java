package com.mycompany.zoo.el.arca;

public class Ave extends Animal {

    private String classification;

    public Ave() {
    }

   
    public Ave(int id, String name, String stage, String classification) {
        super(id, name, stage);
        this.classification = classification;
    }


    public Ave(String classification) {
        this.classification = classification;
    }


    public String getclassification() {
        return classification;
    }

    public void setclassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Ave{" + "classification='" + classification + '\'' + '}';
    }


}