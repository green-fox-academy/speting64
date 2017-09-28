public class Fibonacci {

    int number;

    public int getNumber(int number) {
        if(number == 1 || number ==2){
            return 1;
        }
        return getNumber(number - 1) + getNumber(number - 2);
    }
}
