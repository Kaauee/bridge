/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author alunopb
 */
public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
         System.out.println("Desenhando Circulo[ color: verde, Raio: " + radius + ", x: " + x + ", y: " + y + "]");
    }
    
}
