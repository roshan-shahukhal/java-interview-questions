package strings;

import java.util.HashSet;

// replace space with %20
public class URLify {
    
    public static void main(String[] args) {
        String url = "Mr John Smith    ";
        replaceSpaceWithPer20(url);
    }
    
    private static void replaceSpaceWithPer20(String url) {
        String newUrl = url.trim();
        String newString = newUrl.replaceAll(" ", "%20");
        System.out.println(newString);
    }
    
    
    
    
    

}
