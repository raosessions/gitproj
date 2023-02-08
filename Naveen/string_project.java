public class String_Project{
    public static void main(String[] args){
        String s = "This is a java class";
        System.out.println("The string length is :"+s.length());
        System.out.println("String in upper case was :"+s.toUpperCase());
        String rev_string = "";
        int n = s.length();
        for(int i=0; i<s.length(); i++){
            char lastchar = s.charAt(n-1);
            rev_string += lastchar;
            n--;
        }
        System.out.println("Reverse string :"+rev_string);
        String[] total_words = s.split(" ");
        System.out.println("Total words in a string was :"+total_words.length);
        for(int i=0; i<total_words.length;i++){
            System.out.println("\'"+total_words[i]+"\' length was :"+total_words[i].length());
        }
        int Start_index = s.indexOf("java");
        System.out.println("Index of word 'java' in a string was :"+Start_index);
        String result = s.replace("java", "SQL");
        System.out.println("After replacing the string was :"+result);
    }  
}
