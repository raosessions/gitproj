public class Length {

    public int length(){
        String s = "This is a java class";
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            length++;
        }
        return length;
    }
}