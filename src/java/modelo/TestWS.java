/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.xml.transform.Source;
import sw.ConversionSW;
import sw.ConversionSW_Service;

/**
 *
 * @author jhudy
 */
public class TestWS {
    
    public static void main(String[] args) {
        ConversionSW_Service servicio = new ConversionSW_Service();
        ConversionSW cliente = servicio.getConversionSWPort();
        System.out.println("Resultado 1: " + cliente.hello("Jhudyt"));
        System.out.println("Resultado 2: " + cliente.euroAdolar(100));
    }
}
