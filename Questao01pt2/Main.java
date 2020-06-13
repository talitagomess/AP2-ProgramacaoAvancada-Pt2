package Questao01pt2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import Questao01pt2.Fabrics.PizzaioloFabric;
import Questao01pt2.Fabrics.Pizzaria;
import Questao01pt2.Fabrics.PizzariaOne;
import Questao01pt2.Products.Calzone;
import Questao01pt2.Products.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizzaria pizzaria = new PizzariaOne();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual dia você quer?\n 0 - hoje\n1 - amanhã\n 2 - depois de amanhã\n consecutivamente ...\n ");
        int increment = input.nextInt();

        Date date = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(date); 
        c.add(Calendar.DATE, increment);
        date = c.getTime();

        PizzaioloFabric pizzaiolo = pizzaria.criaPizzaiolo(date);

        pizzaiolo.getDiasDeServiço();

        Pizza pizza = pizzaiolo.criarPizza();

        pizza.getIngredientes();

        Calzone calzone = pizzaiolo.criarCalzone();

        calzone.getIngredientes();

        input.close();
    }

}