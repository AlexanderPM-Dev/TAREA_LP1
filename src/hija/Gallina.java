
package hija;

import padre.Animal;

public class Gallina extends Animal{
    public Gallina(){
        super("Claudia","marron" ,14.3,4);
    }

 
    @Override
    public String HacerRuido() {
        return "La gallina " +nombre+ " esta haciendo ruido";
    }

    @Override
    public String comer() {
        return "La gallina " +nombre+ " esta comiendo";
    }
    
    
    
    
    
}
