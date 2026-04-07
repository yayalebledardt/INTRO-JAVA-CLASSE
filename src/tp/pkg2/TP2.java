/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2;

/**
 *
 * @author yayar
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Marque ="Peugeot";
        int Modele = 208;
        int annee =2021;
        int prix =  18000;
        
        System.out.println("La voiture "+Marque+" "+Modele+" de l'année"+annee+" au prix  de : "+prix+"euros");
        

        Pneus P1 = new Pneus(55,205,16,"été");

        Voiture v1 = new Voiture("Peugeot","208",2021,14500,P1);
        

        
                
    }
    
}
