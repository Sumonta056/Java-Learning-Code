package class_basic;

import java.io.File;
import java.util.Scanner;

public class j20_filehandiling_read {

    public static void main(String[] args) {

        try {
            File file = new File("E:\\CODING\\JAVA\\FolderCreated\\test.txt") ;

            // * read into file
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext())
            {
                // * hasNext() line by line
                // ? next() word by word

                String id = scanner.next();
                String name = scanner.next();

                System.out.println("ID : "+id+" Name : "+name);
            }

            scanner.close();

        }
        catch (Exception e)
        {
            System.out.println("Error!");
        }
    }

}
