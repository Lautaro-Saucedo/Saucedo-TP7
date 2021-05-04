/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saucedo.tp7;

import entidades.Alumno;
import entidades.Materia;

/**
 *
 * @author Laucha
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia ingles = new Materia(100,"Ingles",1);
        Materia matematica = new Materia (101,"Matemáticas",1);
        Materia laboratorio1 = new Materia (102,"Laboratorio 1",1);
        
        Alumno lopezm = new Alumno (1001,"López","Martin");
        Alumno martinezb = new Alumno (1002,"Martínez","Brenda");
        
        lopezm.agregarMateria(ingles);
        lopezm.agregarMateria(matematica);
        lopezm.agregarMateria(laboratorio1);
        
        martinezb.agregarMateria(laboratorio1);
        martinezb.agregarMateria(ingles);
        martinezb.agregarMateria(matematica);
        martinezb.agregarMateria(laboratorio1);
        
        System.out.println(lopezm + " esta inscripto en las siguientes materias:");
        for (Materia a:lopezm.getMaterias()){
            System.out.println(a);
        }
        
        System.out.println(martinezb + " esta inscripta en las siguientes materias:");
        for (Materia a:martinezb.getMaterias()){
            System.out.println(a);
        }
    }
    
}
