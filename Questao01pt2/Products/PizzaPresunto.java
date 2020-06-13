package Questao01pt2.Products;

public class PizzaPresunto implements Pizza {

    @Override
    public void getIngredientes() {
        System.out.println("queijo + presunto + tomate");
    }
    
}