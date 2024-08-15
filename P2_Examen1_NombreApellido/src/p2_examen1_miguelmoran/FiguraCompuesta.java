/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_miguelmoran;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();
    
    @Override
    double calcularArea() {
        double AreaTotal = 0;
        for (int i = 0; i < figuras.size(); i++) {
            AreaTotal += figuras.get(i).calcularArea();
        }
        return AreaTotal;
    }
}
