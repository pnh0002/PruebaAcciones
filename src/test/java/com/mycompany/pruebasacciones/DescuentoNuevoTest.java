/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasacciones;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC220
 */
public class DescuentoNuevoTest {
    
    @Test
    public static void Prueba(){
        Cliente c = new Cliente("Pablo", 19, 2); 
        assertTrue( GestorDescuentos.calcularDescuento(c) == 0, "Todavía no es un usuario veterano! "); 
    }
  
}
