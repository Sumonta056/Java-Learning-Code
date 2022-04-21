package class_basic;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class j19_filehandling_write {

    public static void main(String[] args) {

        String roll , name ;


        try {

            Scanner input = new Scanner(System.in);

            System.out.println("Number of student : ");
            int num = input.nextInt();

            // * WRITE into file
            Formatter formatter = new Formatter("E:\\CODING\\JAVA\\FolderCreated\\test.txt");

            for(int i = 0 ; i < num ; i++)
            {
                roll = input.next();
                name = input.next();

                formatter.format("%s %s\r\n",roll,name);

            }

            //formatter.format("%s %s\r\n","101","Sumonta");       // |r = return && |n = newLing
            //formatter.format("%s %s\r\n","201","Mridul");


            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error !");
        }
    }
}
