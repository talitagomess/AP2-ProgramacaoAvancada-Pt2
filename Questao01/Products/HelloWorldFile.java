
package Questao01.Products;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class HelloWorldFile implements HelloWorld {

    public void escrever () {
        try {
            File file = new File("output.txt");
            if (file.createNewFile()) {
                FileWriter myWriter = new FileWriter("output.txt");
                myWriter.write("Hello World!");
                myWriter.close();
                System.out.println("Successo em escrever o arquivo.");
            }  else {
                System.out.println("Arquivo já existe: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}