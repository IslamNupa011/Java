
package FinalCodes;


public class Vowel {
    public static void main(String[] args){
        String str="Hello New year";
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='e')||(str.charAt(i)=='a')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
                System.out.println(str.charAt(i));
                count++;
            }
        }
        System.out.println("The number of vowel is:"+count);
    }
}
