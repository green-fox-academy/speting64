/*Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/



public class PostIt {
    String backgroundColor;
    String text;
    String textColor;
    public PostIt(){
        this.backgroundColor = "";
        this.text = "";
        this.textColor = "";
    }
    public PostIt(String backgroundColor, String text, String textColor) {

        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
}
class MyBoard{
   public static void main(String[] args){
       PostIt ideal = new PostIt();
       ideal.backgroundColor = "orange";
       ideal.text = "ideal";
       ideal.textColor = "blue";
       PostIt awesome = new PostIt("pink","Awesome" ,"black");
       System.out.println(awesome.backgroundColor + awesome.text + awesome.textColor);
       PostIt superb = new PostIt("yellow", "Super","green" );
       System.out.println(superb.backgroundColor + superb.text + superb.textColor);
       }
   }



