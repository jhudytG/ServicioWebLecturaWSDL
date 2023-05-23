/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;
import javax.xml.transform.Source;
import ws.Operaciones;
import ws.Operaciones_Service;

/**
 *
 * @author jhudy
 */
public class TestWS {

    public static void main(String[] args) {
        Operaciones_Service servicio = new Operaciones_Service();
        Operaciones cliente = servicio.getOperacionesPort();
        System.out.println("Resultado 1: " + cliente.hello("Jhudyt"));
        System.out.println("Resultado 2: " + cliente.euroAdolar(100));

        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        System.out.println("Login:");
        System.out.println("---------------");
        System.out.println("Usuario:");
        String usuario = sc.next();
        System.out.println("Contraseña:");
        String password = sc.next();

        if (cliente.login(usuario, password)) {
            System.out.println("Inicio de Sesion exitoso !");

            boolean salir = false;

            while (!salir) {

                System.out.println("Escriba un número para dirigirse a una operación");
                System.out.println("1 (Operaciones básicas) - 2 (Fórmulas matemática/Física) - 3 (Salir)");
                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("----------- OPERACIONES BÁSICAS ------------");

                        System.out.println("¿Qué operación básica desea realizar? (Escriba su nombre)");
                        System.out.println("Lista disponible: Suma, Resta, Multiplicacion, Division");
                        String oper = sc.next();
                        System.out.println("Inserte el primer número:");
                        float num1 = sc.nextFloat();
                        System.out.println("Inserte el segundo número:");
                        float num2 = sc.nextFloat();
                        System.out.println("Total de su operación: " + cliente.operacionesBasicas(num1, num2, oper));
                        break;
                    case 2:
                        System.out.println("----------- FÓRMULAS MATEMÁTICAS / FÍSICA ------------");

                        System.out.println("¿Qué fórmula desea ejecutar? (Escriba su nombre)");
                        System.out.println("Lista disponible: Ley Newton, Velocidad, Área Triángulo");
                        String nom = scn.nextLine();

                        switch (nom) {
                            case "Ley Newton":
                                System.out.println("Inserte el primer número:");
                                float num3 = sc.nextFloat();
                                System.out.println("Inserte el segundo número:");
                                float num4 = sc.nextFloat();
                                System.out.println("Total de su operación: " + cliente.leyNewton(num3, num4));
                                break;

                            case "Velocidad":
                                System.out.println("Inserte el primer número:");
                                float num5 = sc.nextFloat();
                                System.out.println("Inserte el segundo número:");
                                float num6 = sc.nextFloat();
                                System.out.println("Total de su operación: " + cliente.velocidad(num5, num6));
                                break;

                            case "Área Triángulo":
                                System.out.println("Inserte el primer número:");
                                float num7 = sc.nextFloat();
                                System.out.println("Inserte el segundo número:");
                                float num8 = sc.nextFloat();
                                System.out.println("Total de su operación: " + cliente.velocidad(num7, num8));
                                break;


                        }
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        salir = true;
                        break;

                    default:
                }
            }
        }

    }
}
