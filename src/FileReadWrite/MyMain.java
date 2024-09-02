package FileReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyMain {
//    public static void main(String[] args) throws IOException {
//        //file read
//        String pathName="resources/sample.txt";
//        File file=new File(pathName);
//        //read
//        FileReader fileReader=null;
//
//        try {
//             fileReader=new FileReader(file);
//            int data=0;
//            while(data!=-1) {
//                data = fileReader.read(); //reading ascii value
//                char charater = (char) data;
//                System.out.print(charater);
//            }
//             fileReader.close();
//        }catch (FileNotFoundException e)
//        {
//            System.out.println("File not found");
//        }catch (IOException e)
//        {
//            System.out.println("IOException");
//        }
public static void main(String[] args) {
    String pathname="resources/sample.txt";
    File file=new File(pathname);
    //read
    FileReader fileReader=null;
    try {
        fileReader =new FileReader(file);
        int data=0;
        while (data!=-1){
        data=fileReader.read();
        char charater=(char)data;
             Thread.sleep(100);
            System.out.print(charater);
        }
        fileReader.close();
       }catch (FileNotFoundException e)
    {
        System.out.println("File not Found");
    }catch (IOException e)
    {
        System.out.println("IO Exception");
    }catch (InterruptedException e)
    {
        System.out.println("Interrupted Exception");
    }
    }
}
