import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    private double[][] data;

    public Matrix (String filename) {
        boolean success = load(filename);
        if (!success) {
            System.out.println("Oops, this is not gonna be pretty!");
        }
    }
    public Matrix (int x, int y) {
        data = new double[y][x];
    }

    public double getValue (int x, int y) {
        return data[y][x];
    }

    public void setValue (int x, int y, double value){
        data[y][x] = value;
    }
    public int getHeight(){
        return data.length;
    }

    public int getWidth(){
        return data[0].length;
    }
//save a file

    public boolean save (String filename) {
        try {
            File file = new File(filename);
            PrintWriter out = new PrintWriter(file);

            for (double [] row: data) {
                for (int i=0 ; i< row.length ; i++){
                    double cell = row[i];
                    out.print((i==0 ? "" : ",")+cell);
                }
                out.println("");
            }
            out.close();
            return true;
        }catch (java.io.IOException e){
            return false;
        }
    }



//load a new file

    private boolean load(String filename) {
        try {
            File file = new File(filename);
            Scanner in = new Scanner(file);
// read contents
            ArrayList<String> lines = new ArrayList<String>();
            while (in.hasNext()) {
                lines.add(in.nextLine());
            }
            in.close();
// parse data and build datastructure
            int x = 0;
            int y = 0;
            try {
                data = new double[lines.size()][];
                for (y = 0; y < lines.size(); y++) {
                    String line = lines.get(y);
                    String[] cells = line.split(",");
                    data[y] = new double[cells.length];
                    for (x = 0; x < cells.length; x++) {
                        data[y][x] = Double.parseDouble(cells[x]);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid x=" + x + " y=" + y);
                return false;
            }
            return true;
        } catch (java.io.FileNotFoundException e) {
            return false;
        }
    }


    public static void main (String[] args) {
        String m1_filename = "m1.csv";
        String m2_filename = "m2.csv";
        Matrix m1 = new Matrix(10, 6);
        m1.save(m1_filename);
        Matrix m2 = new Matrix(m1_filename);
        for (int i=0 ; i<Math.min(m2.getHeight(), m2.getWidth()) ; i++) {
            m2.setValue(i, i, m2.getValue(i, i)+1);
        }
        m2.save(m2_filename);
    }

}

