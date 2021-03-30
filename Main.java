
/**
 * secondmain
 */
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.math.*;

public class Main {

/********************************************************************************************************************/
    // Not finished yet i hava to include the gcd,primility_test,and some other function
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"),StandardCharsets.UTF_8));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // still got some work to do 

        while (br.ready()) {
                // System.out.println(br.readLine());
                String string = br.readLine();
                output.write(string);   
                output.newLine(); 

            }
            br.close();
            output.close();


    }
}