package day.third;

import java.io.*;

public class readFileExample {

    public static void main (String[] args){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("textData.txt")));
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }
            catch (IOException e) {
                e.printStackTrace();
            }


    }
}