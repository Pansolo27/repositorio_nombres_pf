/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final;
import java.util.Scanner;
public class Proyecto_final {
    public static void main(String[] args) {
        String cliente;
double compra1, compra2, compra3, tc, pc;
Scanner lectura=new Scanner(System.in);
System.out.print("Ingresar nombre del cliente: ");
cliente=lectura.next();
System.out.print("Ingresar primera compra: ");
compra1=lectura.nextDouble();
System.out.print("Ingresar primera compra: ");
compra2=lectura.nextDouble();
System.out.print("Ingresar primera compra: ");
compra3=lectura.nextDouble();
    tc= compra1+compra2+compra3;
    pc= tc/3;
System.out.println("Total de compras: "+tc);
System.out.println("Promedio de compras: "+pc);
    }
    
}
