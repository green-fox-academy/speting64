public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10

        a += 10;


        System.out.println(a);


        int b = 100;
        // make it smaller by 7
        b -= 7;

        System.out.println(b);


        int c = 44;
        // please double c's value
        c *= 2;

        System.out.println(c);


        int d = 125;
        // please divide by 5 d's value
        d /= 5;


        System.out.println(d);


        int e = 8;
        // please cube of e's value
        e = e*e*e;

        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean lt1=(f1>f2);
        System.out.println(lt1);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        g2 *= 2;
        boolean lt2 = (g1<g2);
        System.out.println(lt2);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        boolean i = (h%11 == 0);
        System.out.println(i);

    }
}
