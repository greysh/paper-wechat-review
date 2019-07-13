import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DICT {
   static ArrayList list = new ArrayList<String>();
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("resource/1.dict"));
        String line = br.readLine();
        while(line !=null){
            list.add(line.trim());
            line = br.readLine();
        }

        BufferedReader br1 = new BufferedReader(new FileReader("resource/2.dict"));
        String line1 = br1.readLine();
        while(line1 !=null){

            line1 = line1.trim();
            for(int i=0;i<list.size();i++){
                if(list.get(i).equals(line1)){
                    System.out.println(i+1);
                }
            }
//            System.out.println(line1);

            line1 = br1.readLine();
        }



    }

}
