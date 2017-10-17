package CreditCard;

import java.util.Random;

public class CreditCard implements CreditCardy {

   static int counter;

    public int getSumCVV()    {
        return 0;
    }

    @Override
    public String getNameCardholder() {
        String cardUser = "ABC";
        cardUser = cardUser.concat(String.valueOf(counter));
        counter++;
        return cardUser;
    }

    @Override
    public String getCodeAccount() {

         return getRandomCreditNumber();
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        int sumCVV =0;
        for (int i = 0; i <codeAccount.length() ; i++) {
            sumCVV += Character.getNumericValue(codeAccount.charAt(i));
        }
        return sumCVV;
    }

    String getRandomCreditNumber(){
        String randomCardNumber = "";
        for (int i = 0; i < 16 ; i++) {
            randomCardNumber += String.valueOf(new Random().nextInt(10));
            if(i ==0 && Integer.parseInt(randomCardNumber) == 0){
                randomCardNumber = "";
                randomCardNumber += String.valueOf(new Random().nextInt(9)-1);
            }
        }
        return randomCardNumber;
    }

    public String toString(){
        String codeAcc = getCodeAccount();
        return String.format("Name=%s CC#=%s CVV=%d (validated)", getNameCardholder(), codeAcc,cumeSumCVV(codeAcc));
    }

}
