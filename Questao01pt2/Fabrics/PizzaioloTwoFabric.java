package Questao01pt2.Fabrics;

import Questao01pt2.Products.Calzone;
import Questao01pt2.Products.CalzonePresunto;
import Questao01pt2.Products.Pizza;
import Questao01pt2.Products.PizzaPresunto;

public class PizzaioloTwoFabric extends PizzaioloFabric {

    @Override
    public Pizza criarPizza() {
        return new PizzaPresunto();
    }

    @Override
    public Calzone criarCalzone() {
        return new CalzonePresunto();
    }

    @Override
    public void getDiasDeServiço() {
        String diasDeTrabalho = "terças, quintas e sábados";
        System.out.println(diasDeTrabalho);
    }
    
}