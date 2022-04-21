package class_basic;

import java.io.File;

public class j18_fileHandiling_1 {

    public static void main(String[] args) {

        // * creating a directory
        File dir =  new File("FolderCreated") ;           // ? will be created on current project location
        //File dir =  new File("E:\\CODING\\FolderCreated") ;     // * create on any location with address
        dir.mkdir();

        // * location of directory
        String location = dir.getAbsolutePath();
        System.out.println(location);
        System.out.println(dir.getName());                        // name of directory

        // * delete directory
        //? dir.delete();

        // * create a File in
        // File file1 = new File("test.txt");                     // default project location

        // E:\CODING\JAVA\FolderCreated\\test.txt
        String path = dir.getAbsolutePath();
        File file1 = new File(path + "\\test.txt");         // any location

        try{
            file1.createNewFile();

        }
        catch (Exception e)
        {
            System.out.println("Error!");
        }

        // * if else - file1.exist
        // * file1.delete();
    }
}
