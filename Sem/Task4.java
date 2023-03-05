package Sem;

import java.io.FileWriter;
import java.io.IOException;

//Записать в простой текстовый файл слово TEST 10 раз, обработайте исключения.
public class Task4 {
    public static void main(String[] args) {

        String test = "TEST";
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            strB.append(test);
        }

//                test = test.repeat(10);
        try (FileWriter fw = new FileWriter("Test2.txt", false)) {
            fw.write(strB.toString());

            fw.flush();
        } catch (IOException ex) {
            System.out.println("Exception.. :(");
        }
    }
}
