/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalTunja;

import com.hostipal.tunja.controlador.Controlador_GestionColas;
import com.hostipal.tunja.modelo.ColaEmergenciaN1;
import com.hostipal.tunja.modelo.ColaNoUrgenteN3;
import com.hostipal.tunja.modelo.ColaUrgenciaN2;
import com.hostipal.tunja.vista.Vista_Hospital;

/**
 *
 * @author programador
 */
public class HospitalTunja {

    public static void main(String[] args) {
        ColaEmergenciaN1 colaEmergenciaN1 = new ColaEmergenciaN1();
        ColaUrgenciaN2 colaUrgenciaN2 = new ColaUrgenciaN2();
        ColaNoUrgenteN3 colaNoUrgenteN3 = new ColaNoUrgenteN3();
        Vista_Hospital view = new Vista_Hospital();
        Controlador_GestionColas ctrl = new Controlador_GestionColas(colaEmergenciaN1, colaUrgenciaN2, colaNoUrgenteN3);
        view.setVisible();
    }
}
