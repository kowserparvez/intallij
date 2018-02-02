import java.io.*;

public class ReadingStuff {

    public static void main(String[] args) throws IOException {

        String textFile = System.getProperty("user.dir") +"/src/reading/example";
        BufferedReader br = new BufferedReader(new FileReader(textFile));

        String text = "";
        while((text = br.readLine())!=null){
            System.out.println(text);

        }

        br.close();


    }
}
