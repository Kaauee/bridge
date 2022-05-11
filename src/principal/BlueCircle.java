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
public class BlueCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Desenhando Circulo[ cor: Azul, Raio: " + radius + ", x: " + x + ", y: " + y + "]");
    }

    @Override
    public void drawSquare(int x) {

    }

}
