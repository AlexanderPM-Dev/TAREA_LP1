package Principal;

import hija.Vicunia;
import padre.Animal;
import hija.Tigre;
import hija.Gallina;

public class Zoologico {
    public static void main(String[] args) {
        infoVicun();
        infoTigri();
        infoGalli();
    }
    
    public static void infoVicun(){
        Animal vicunia = new Vicunia();
                
        System.out.print("Nombre de la Vicuña: "+ vicunia.getNombre()+"\n");
        System.out.print("Edad: " + vicunia.getEdad()+" años\n");
        System.out.print("Color: "+ vicunia.getColor()+"\n");
        System.out.print("Peso: "+ vicunia.getPeso()+" kg \n");
        System.out.println(vicunia.comer());
        System.out.println(vicunia.HacerRuido());
        System.out.print("------------------------------------------------ \n"); 
    }
    public static void infoTigri(){
        Animal tigre = new Tigre() {
            @Override
            public String HacerRuido() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
 
        System.out.print("Nombre del tigre: "+ tigre.getNombre()+"\n");
        System.out.print("Edad: " + tigre.getEdad()+" años\n");
        System.out.print("Color: "+ tigre.getColor()+"\n");
        System.out.print("Peso: "+ tigre.getPeso()+" kg \n");
        System.out.println(tigre.comer());
        System.out.print("--------------------------------------------------\n"); 
    }
                
    private static void infoGalli() {
        Animal gallina=new Gallina();
        System.out.print("Nombre de la gallina: "+ gallina.getNombre()+"\n");
        System.out.print("Edad: " + gallina.getEdad()+" años\n");
        System.out.print("Color: "+ gallina.getColor()+"\n");
        System.out.println(gallina.comer());
        System.out.println(gallina.HacerRuido());
        System.out.print("------------------------------------------------- \n"); 
    }
    
}
   

