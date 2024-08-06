/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listamvc;

import controlador.Lista_Controlador;
import modelo.ListaDinamica;
import vista.Lista_Vista;

/**
 *
 * @author Admin
 */
public class ListaMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //modelo, vista, controlador
        
        ListaDinamica model = new ListaDinamica();
        Lista_Vista view = new Lista_Vista();
        Lista_Controlador ctrl = new Lista_Controlador(view, model);
        
        view.setVisible(true);
    }
    
}
