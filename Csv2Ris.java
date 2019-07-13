import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Csv2Ris {

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resource/ris.csv"));
        String line = br.readLine();
        PrintWriter pw = new PrintWriter(new File("resource/ris.ris"));
        while(line !=null){
            line = line.trim();
            String[] kw =  line.split(",");
            pw.println("TY  - JOUR");
            pw.println("PY  - " + kw[0]);
            pw.println("TI  - " + kw[1]);
            pw.println("JF  - " + kw[2]);
            pw.println("AU  - "+ kw[3]);
            pw.println("KW  - "+ kw[4]);
            pw.println("ER  -");
            pw.println();
            pw.println();
              line = br.readLine();
        }
        br.close();
        pw.flush();
        pw.close();
    }

}
