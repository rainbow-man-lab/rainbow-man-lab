import java.io.*;
public class LongestPalindromeString {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string ");
        String str=br.readLine();
        String strArray[]=str.split(" ",10);
        int len[]=new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            if(isPalindrome(strArray[i])){
                len[i]=strArray[i].length();
            }
            else{
                len[i]=0;
            }
        }
        int max=0;
        int pointer=0;
        for (int i = 0; i < len.length; i++) {
            if(max<len[i]){
                max=len[i];
                pointer=i;
            }
        }
        System.out.println(strArray[pointer]);
    }
    static boolean isPalindrome(String str){
        int low=0;
        int high=str.length()-1;
        boolean check=true;
        while(high>low){
            if(str.charAt(high--)!=str.charAt(low++)){
                check=false;
                return false;
            }            
        }
        return check;
    }
}