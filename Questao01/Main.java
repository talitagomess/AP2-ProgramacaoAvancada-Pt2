package Questao01;

import java.util.Random;

import Questao01.Fabrics.FileOutPutFabric;
import Questao01.Fabrics.OutPutFabric;
import Questao01.Fabrics.WindowOutPutFabric;
import Questao01.Products.HelloWorld;

/*Crie um “Hello, World” que utilize o padrão Abstract Factory para escolher dentre duas formas de impressão:
(a) na tela ou (b) num arquivo chamado output.txt. Seu programa deve escolher dentre as duas fábricas
aleatoriamente.*/

public class Main {
    public static void main(String[] args) {

        Random gerador = new Random();
        OutPutFabric outFabric;

        // OutPutFabric fileFabric = new FileOutPutFabric();
        // OutPutFabric messageFabric = new WindowOutPutFabric();

        boolean isFile = gerador.nextBoolean();

        if (isFile) {
            outFabric = new FileOutPutFabric();
        } else {
            outFabric = new WindowOutPutFabric();
        }       

        HelloWorld helloWorld = outFabric.criarHello();
        // HelloWorld fileHelloWorld = fileFabric.criarHello();
        // HelloWorld messgaeHelloWorld = messageFabric.criarHello();

        helloWorld.escrever();
        // fileHelloWorld.escrever();
        // messgaeHelloWorld.escrever();
    }
}