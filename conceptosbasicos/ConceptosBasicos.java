/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author cakit
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("Luxury");
        miAcura.setModelo(2017);
        miAcura.setColor(Color.gray);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Deportivo");
        miMustang.setModelo(2015);
        miMustang.setColor(Color.yellow);
        
    }
    
}
