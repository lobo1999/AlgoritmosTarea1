/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import VentanasUsuario.UserWindows;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Andrés
 */
public class MainClass {

    public static void main(String[] args) {

        String selection;

        UserWindows proof = new UserWindows();

        selection = proof.PrincipalMenu();

        switch (selection) {

            case "Ingresar persona":

                break;

            case "Mostrar Lista primero a ultimo":

                break;

            case "Mostrar Lista ultimo a primero":

                break;

            case "Consultar por numero de cedula":

                break;

            case "Listar por apellido":

                break;

            case "Eliminar por número de cédula":

                break;

            case "Eliminar por apellido":

                break;

            case "Calcular promedio de edad":

                break;

            case "Cargar datos de archivo externo":

                break;
//
        }
    }
}
