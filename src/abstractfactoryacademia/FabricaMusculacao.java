/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryacademia;

/**
 *
 * @author lizz
 */
class FabricaMusculacao implements Modelo {
    
    @Override
    public Resistencia getResistencia(){
        return new ExtensoraResistencia();
    }

    @Override
    public Velocidade getVelocidade() {
        return new AgachamentoVelocidade();
    }
}
