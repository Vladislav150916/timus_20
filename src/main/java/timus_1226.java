import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class timus_1226 {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ArrayList<String> lines = new ArrayList<>();

        while ((line = reader.readLine()) != null){
            lines.add(line);
        }

        for (String s : lines){
            String wordBuffer = "";
            for (int i = 0; i < s.length(); i++){
                if (Character.isLetter(s.charAt(i))){
                    wordBuffer = s.charAt(i) + wordBuffer;
                } else {
                    System.out.print(wordBuffer + s.charAt(i));
                    wordBuffer = "";
                }
            }
            System.out.println(wordBuffer);
        }
    }
}