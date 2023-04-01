package com.mycompany.zoo.el.arca;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<Animal>() ;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Boleta> boletas = new ArrayList<Boleta>();
        ArrayList<Plan> planes = new ArrayList<Plan>();
        ArrayList<Suministro> suministros = new ArrayList<Suministro>();
        ArrayList<ReporteDeVentas> reportesDeVentas = new ArrayList<ReporteDeVentas>();
        Animal animal = new Anfibio(0, "sapitouno", "en rehabilitacion ", "anuros");
        Administracion administracion = new Administracion();
        administracion.ingresoAnimal(animal, animales);
        
        
        // El programa continuará ejecutándose hasta que se cierre la ventana de AgregarClienteGUI
        
        // Imprimir los arrays de la clase Administracion
        System.out.println("Clientes:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("Animales:");
        for (Animal a : animales) {
            System.out.println(a);
        }
        System.out.println("Boletas:");
        for (Boleta b : boletas) {
            System.out.println(b);
        }
        System.out.println("Planes:");
        for (Plan p : planes) {
            System.out.println(p);
        }
        System.out.println("Suministros:");
        for (Suministro s : suministros) {
            System.out.println(s);
        }
        System.out.println("Reportes de Ventas:");
        for (ReporteDeVentas r : reportesDeVentas) {
            System.out.println(r);
        }
        //SwingUtilities.invokeLater(() -> new AgregarPlanGUI().setVisible(true));
        //SwingUtilities.invokeLater(() -> new AgregarClienteGUI(clientes).setVisible(true));
        SwingUtilities.invokeLater(() -> new MenuGUI().setVisible(true));
    }
}


/*
* Un zoológico famoso nos ha contratado para ayudarle en la administración del dinero y nos ha solicitado lo siguiente:
*
* 1. Tener clase Animal.
* 2. Tener clase AnimalesSalvajes.
* 3. Tener clase AnimalesDomesticos.
* 4. Tener clase Planes (Plan experiencia salvaje, plan alimentar pollos, plan amistoso)
* 5. Tener clase clientes.
* 6. Clase de venta de boletería, abonos
*
* Nos piden entregar un PDF con las ventas de un período.
* Debemos tener como mínimo 5 planes que son los más* pedidos por los clientes. Tener venta de
* boletas y Abonos del Zoo.
* Se tiene un programa cliente frecuente
* para lo cual necesitamos acumular las visitas al zoo.
*
* Adicionales:
*  - Animales para la venta
*  - Eventos
*  - Sistema de puntos
*  - Acuario
*  - etc.
*
*/