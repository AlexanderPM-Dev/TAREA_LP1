package hija;

import padre.Animal;

public abstract  class Tigre extends Animal{
    public boolean ruido;
    public  Tigre(){
        super("Leoncio","Albino",275,15);
    }
    public  String hacerRuido(boolean ruido){
        if(ruido==true){
            return "El tigre " +nombre+ " esta haciendo ruido";
        }
        else{
            return "El tigre " +nombre+ " no esta haciendo ruido";
        }
        
    }

    @Override
    public String comer() {
        return "El tigre " +nombre+ " esta comiendo";
    }
    
   
    public String hacerRuido() {
        String mensaje = hacerRuido(ruido==true);
        return mensaje;
    }

    
}
