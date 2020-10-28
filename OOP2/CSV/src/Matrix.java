import com.sun.security.jgss.GSSUtil;

import javax.security.auth.login.FailedLoginException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Matrix {


    private double [][] data;

    private static File newCSV = new File("testfile.csv");


    public Matrix(double[][] data, File newCSV){
        this.newCSV = newCSV;
        this.data = new double[][] {
                {2.0, 3.0},
                {3.0, 2.0}
        };

        PrintWriter load;
        try {
            load = new PrintWriter(newCSV);
            load.println(data);
            load.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File does not exist");
        }
    }

    public static void main(String[] args) {


        Scanner reader;
        try {
            reader = new Scanner(newCSV);
            System.out.println(reader.nextLine());
            System.out.println(reader.nextLine());
            reader.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
        }2
    }

}
