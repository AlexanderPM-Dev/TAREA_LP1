package hija;

import padre.Animal;

public class Vicunia extends Animal{
    public Vicunia(){
        super("Panchita", "negro claro", 78.5, 6);
    }

    @Override
    public String HacerRuido() {
        return "La vicuña " +nombre+ " esta haciendo ruido";
    }

    @Override
    public String comer() {
        return "La vicuña " +nombre+ " esta comiendo";
    }
 
}
