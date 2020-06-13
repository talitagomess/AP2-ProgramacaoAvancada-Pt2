package Questao01pt2.Fabrics;

import Questao01pt2.Products.Calzone;
import Questao01pt2.Products.CalzoneCalabresa;
import Questao01pt2.Products.Pizza;
import Questao01pt2.Products.PizzaCalabresa;

public class PizzaioloOneFabric extends PizzaioloFabric {

    @Override
    public Pizza criarPizza() {
        return new PizzaCalabresa();
    }

    @Override
    public Calzone criarCalzone() {
        return new CalzoneCalabresa();
    }

    @Override
    public void getDiasDeServiço() {
        String diasDeTrabalho = "segundas, quartas e sextas";
        System.out.println(diasDeTrabalho);
    }
    
}
