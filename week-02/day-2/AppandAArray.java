// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end

public class AppandAArray {

    public static void main(String[] args){

        String[] nimals = {"kuty", "macsk" ,"cic"};

        for (int i =0; i < nimals.length; i++){
            nimals[i] += 'a';
        }
        System.out.println(nimals[0]);
        System.out.println(nimals[1]);
        System.out.println(nimals[2]);
    }


}

