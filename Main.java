// File Operations
import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        File file = new File("./new-file.txt"); // This will work even though file does not exists 
        System.out.println(file.getAbsolutePath()); // Aboulte Path 
        System.out.println(file.getPath());// get Path
        System.out.println(file.getParent());//getParent Directory
        System.out.println(file.getName());// get file name 
        System.out.println(file.isDirectory());// if it  is directory or not (exits)
        System.out.println(file.isFile());// if it is file or not (exists)
        System.out.println(file.exists()); // if it exists or not 

        // Create Files 
        File file2 = new File("E:\\May\\sample.txt");
        System.out.println(file2.getAbsolutePath());
        try {
            boolean createFile = file2.createNewFile();
            System.out.println("File was Successfully Created");
        } catch (IOException e) {
           System.out.println("Cannot Create a File "+file2.getName());
        }

        // Create Directory 
        File file3 = new File("E:\\May\\sample");
        if(file3.mkdir()){
            System.out.println("Successfully Created Directory");
        }
        else{
            System.out.println("Unfortunate Event occurs!!!");
        }

        // Create Heirarchy of Directories
        for(int i=1;i<=10;i++){
            File files = new File("E:\\May\\main\\Day"+i);
            if(files.mkdirs()){
                System.out.println("Directory was created");
            }
            else{
                System.out.println("Unfortunate Event occurs !!!!");
            }
        }

        // Rename File 
        File file5 = new File("./sample.txt");
        boolean renamed = file5.renameTo(new File("E:\\May\\sample\\sample.txt"));
        if(renamed){
            System.out.println("Moved File");
        }
        // Moving Files 
          File file6 = new File("./sample.txt");
        boolean moved = file6.renameTo(new File("E:\\May\\sample\\filename.txt"));
        if(moved){
            System.out.println("File Renamed");
        }
        
        
        
    }
}
