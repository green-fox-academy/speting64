public class Shifter implements CharSequence {

    String string;
    int index;

    public Shifter(String string , int index){
        this.string = string;
        this.index = index;
    }

    @Override
    public char charAt(int index){
        return this.string.charAt(index+2);
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
