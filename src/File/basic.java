package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class basic {
    public static void main(String[] args) throws IOException {

        int score = 200 ;
        String curr = Integer.toString(score);

        File myObj = new File("filename.txt");


        try {
            if (myObj.createNewFile()) {
                //System.out.println("File created: " + myObj.getName());
                // * if no file push current score , no need compare
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write(curr);
                myWriter.close();

            } else {

                System.out.println("File already exists.");

                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    int pastScore = Integer.parseInt(data);

                    if(pastScore <= score)
                    {
                        System.out.println("compare");
                        new FileWriter("filename.txt", false).close();
                        FileWriter myWriter = new FileWriter("filename.txt");
                        myWriter.write(curr);
                        myWriter.close();
                    }


                    System.out.println(data);
                }
                myReader.close();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
