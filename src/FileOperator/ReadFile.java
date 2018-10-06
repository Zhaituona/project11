package FileOperator;

import java.io.BufferedReader;
import java.io.FileReader;
//this is all bout from java to read a file , using fileReader and BufferedReader ,
//first declare FileReader and BufferedReader then declare String , using two try catch block combine with
//the while loop , while loop using for BufferedReader to read the string from file , fileReader can take the file path
//BufferedReader can read the file , throw  the FileReader , 
public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = ("C:\\Users\\elzat\\eclipse-workspace\\project11\\me.txt");
        try {
            fr = new FileReader(path);
        } catch (Exception ex) {
            System.out.println("The file not able to find ,check the path again");
        }
        try {
            br = new BufferedReader(fr);
            String line = " ";
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }
                catch(Exception ex){
            System.out.println("file not able to read");
                }

                }


            }






