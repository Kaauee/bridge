/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author G-fire
 */
public class GreenSquare implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        //Do nothing 
    }

    @Override
    public void drawSquare(int x) {
        System.out.println("Desenhando Quadrado [ Cor: Verde " + "Base: " + x + " Altura: " + x + "]");
    }

}
