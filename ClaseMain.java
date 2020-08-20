/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author recin
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Profesor profe = new Profesor("Melvin", "Chalatenango", "19/03/01", "M", 19, "ING", "Estudiante");
    
        System.out.println(profe.toString());
        
        Estudiante est = new Estudiante ("Juan","Chalatenango", "12/12/2000", "M", 19, 1000, "Relacione Publicas");
        
        System.out.println(est.toString());
    }
    
    
}
