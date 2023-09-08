/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryacademia;

/**
 *
 * @author lizz
 */
class FabricaCorrida implements Modelo {
    @Override
    public Resistencia getResistencia(){
       return new CorridaResistencia();
    }
    
    @Override
    public Velocidade getVelocidade(){
    
        return new TiroVelocidade();
    }
}
