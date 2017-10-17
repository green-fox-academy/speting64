public class Gnitrs implements CharSequence {

    String string;

    public Gnitrs(String string){
        this.string = string;
    }

    @Override
    public char charAt(int index){
        return this.string.charAt(string.length()-1-index);
    }

    @Override
    public int length(){
        return string.length();
    }

    @Override
    public CharSequence subSequence(int start, int end){

        String reversed = " ";
        for (int i = end; i >=start ; i--) {

            reversed += this.string.charAt(i);

        }
        return reversed;
    }

}
