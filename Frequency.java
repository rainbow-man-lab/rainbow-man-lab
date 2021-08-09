import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String str=br.readLine();
        int frequency[]=new int[str.length()];
        char string[]=str.toCharArray();
        Arrays.sort(string);
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            frequency[i]=1;
            for (int j = i+1; j < str.length(); j++) {
                if (string[i]==string[j]) {
                    frequency[i]++;
                    string[j]='0';
                }
            }
        }
        System.out.println("Character with frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (string[i] == '0' || string[i] == ' ') {
                continue;
            }
            else{
                System.out.println(string[i]+"-"+frequency[i]);
            }
        }
    }
}