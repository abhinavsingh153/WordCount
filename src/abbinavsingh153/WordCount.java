package abbinavsingh153;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static  void main(String[] args){
        File file= new File("taleoftwocities.txt");
        int wordCount=0;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                wordCount += line.split(" ").length;
            }

            System.out.println("The file contains " + wordCount + " words");
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
    }
}
