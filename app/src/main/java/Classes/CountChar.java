package Classes;

public class CountChar {
    public static int getCharLength(String text){
        int len = 0;
        len = text.trim()
            .replace(" ","")
            .replace("\n","").length();
        return len;
    }
    public static int getWordCount(String text)
    {
        int len = 0;
        len = text.split("\\W").length;
        return len;
    }
}
