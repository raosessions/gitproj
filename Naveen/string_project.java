public class Current{
    public static void main(String[] args){
        String s = "This is a java class";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        String[] total_words = s.split(" ");
        System.out.println(total_words.length);
        int count=0;
        for(int i=0; i<total_words.length;i++){
            System.out.println(total_words[i].length());
        }
        int Start_index = s.indexOf("java");
        System.out.println(Start_index);
        String result = s.replace("java", "SQL");
        System.out.println(result);
    }  
}
