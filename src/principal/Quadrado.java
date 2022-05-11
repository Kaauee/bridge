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
public class Quadrado extends Shape {
    
    private int x;
    
    public Quadrado(int x, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
    }
    
    @Override
    public void draw() {
        drawApi.drawSquare(x);
    }
    
}
