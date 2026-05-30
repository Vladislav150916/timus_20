import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class timus_1601 {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null){
            lines.add(line);
        }

        boolean isFirstLetter = true;
        for (String s : lines){
            String lineBuffer = "";
            for (int i = 0; i < s.length(); i++){
                if (Character.isLetter(s.charAt(i))){
                    if (isFirstLetter){
                        lineBuffer += s.charAt(i);
                        isFirstLetter = false;
                    } else {
                        lineBuffer += Character.toLowerCase(s.charAt(i));
                    }
                } else {
                    lineBuffer += s.charAt(i);
                    switch (s.charAt(i)) {
                        case '!':
                        case '.':
                        case '?':
                            isFirstLetter = true;
                    }
                }
            }
            System.out.println(lineBuffer);
        }
    }
}