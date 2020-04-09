/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasUsuario;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Andrés
 */
public class UserWindows {

    public String PrincipalMenu() {

        String option;

        String[] principalMenu = new String[10];
        principalMenu[0] = "Ingresar persona";
        principalMenu[1] = "Mostrar Lista primero a ultimo";
        principalMenu[2] = "Mostrar Lista ultimo a primero";
        principalMenu[3] = "Consultar por numero de cedula";
        principalMenu[4] = "Listar por apellido";
        principalMenu[5] = "Eliminar por número de cédula";
        principalMenu[6] = "Eliminar por apellido";
        principalMenu[7] = "Calcular promedio de edad";
        principalMenu[8] = "Cargar datos de archivo externo";
        principalMenu[9] = "Salir";

        option = (String) JOptionPane.showInputDialog(null, "Seleccione acción a realizar", "Menú", JOptionPane.QUESTION_MESSAGE, null, principalMenu, 1);

        return option;
    }
    
}
