// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {

    public static void main(String[] args){

        String url = "\"https//www.reddit.com/r/nevertellmethebots\"";
        int index1 = url.indexOf("bots");
        System.out.println(index1);

        String replaceString = url.replace("bots","odds");
        System.out.println(replaceString);

        int index2 = url.indexOf("w");
        System.out.println(index2);

        System.out.println("string length is: "+replaceString.length());

        String s = new String(replaceString);
        System.out.println(replaceString.substring(0,6));
        System.out.println(replaceString.substring(8,44));
        System.out.println(replaceString.substring(0,6)+":"+replaceString.substring(6,44));
    }
}
