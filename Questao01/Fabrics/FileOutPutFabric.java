package Questao01.Fabrics;
import Questao01.Products.*;

public class FileOutPutFabric extends OutPutFabric {

    public HelloWorld criarHello() {
      return new HelloWorldFile ();
    }
  
}
