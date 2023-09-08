/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactoryacademia;

import java.util.Scanner;

/**
 *
 * @author lizz
 */
public class AbstractFactoryAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe 1- Musculacao ou 2- Corrida");
       byte opc = sc.nextByte();
       
       Modelo modelo = null;
       switch (opc) {
        case 1: modelo = new FabricaMusculacao(); break;
        case 2: modelo = new FabricaCorrida(); break;
    }
       
      SugestaoExercicio sugestao = new SugestaoExercicio(modelo);
      sugestao.gerar(opc);
       System.out.println("Exercicio de velocidade " + sugestao.getVelocidade().toString());
       System.out.println("Exercicio de resistencia: " + sugestao.getResistencia().toString());
    }
    
}
