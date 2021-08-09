public class NearestPalendrome {
    public static void main(String[] args) {
        int num=1930;
        String str=Integer.toString(num);
        calcPalendrome(str);
    }
    static void calcPalendrome(String str){
        String left="";
        int len=str.length();
        if(len%2==0){
            left=str.substring(0, len/2);
            StringBuffer st=new StringBuffer(left);
            System.out.println("Closest palendrome is : "+left+st.reverse());
        }
        else{            
            System.out.print("Closest palendrome is : "+str.substring(0,(len/2+1)));
            left=str.substring(0,(len/2));
            StringBuffer st=new StringBuffer(left);
            System.out.print(st.reverse());
        }
                
    }
}
