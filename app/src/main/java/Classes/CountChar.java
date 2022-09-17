package Classes;

public class CountChar {
    public static int getCharLength(String text, int spinnerIndex){
        int len = 0;
        if(spinnerIndex == 0)
        {
            len = text.split(" ").length;
        }
        else if(spinnerIndex == 1)
        {
            len = text.trim()
                    .replace(" ","")
                    .replace("\n","").length();
        }
        return len;
    }
}
