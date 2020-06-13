package Questao01pt2.Fabrics;

import Questao01pt2.Products.Calzone;
import Questao01pt2.Products.Pizza;

public abstract class PizzaioloFabric {
    public abstract void getDiasDeServiço();
    public abstract Pizza criarPizza();
    public abstract Calzone criarCalzone();
}