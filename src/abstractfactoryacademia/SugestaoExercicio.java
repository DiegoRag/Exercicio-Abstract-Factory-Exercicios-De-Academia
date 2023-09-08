/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryacademia;

/**
 *
 * @author lizz
 */
public class SugestaoExercicio {

    private Velocidade exercicioVelocidade;
    private Resistencia exercicioResistencia;
    private Modelo fabricaModelo;

    public SugestaoExercicio(Modelo Fabrica) {

        fabricaModelo = Fabrica;
    }

    public Velocidade getVelocidade() {
        return exercicioVelocidade;
    }

    public Resistencia getResistencia() {
        return exercicioResistencia;
    }

    public void gerar(byte opcao) {

        if (opcao == 1) {
            System.out.println("Exercicios de musculacao");
            exercicioVelocidade = new AgachamentoVelocidade();
            exercicioResistencia = new ExtensoraResistencia();

        }

        if (opcao == 2) {
            System.out.println("Exercicios de Corrida");
            exercicioVelocidade = new TiroVelocidade();
            exercicioResistencia = new CorridaResistencia();

        }

    }
}
