package Questao01.Fabrics;
import Questao01.Products.*;

public class WindowOutPutFabric extends OutPutFabric {
    
    public HelloWorld criarHello() {
        return new HelloWorldMessage();
    }
}