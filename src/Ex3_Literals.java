// Rules for Variable Naming

public class Ex3_Literals {

    public static void main(String[] args) {
        int binary_num=0b0111010111;
        System.out.println(binary_num);
        int ticketPrice_decimal = 900;  // decimal system
        System.out.println(ticketPrice_decimal);
        int ticketPrice_octal = 0120;   // octal system
        System.out.println(ticketPrice_octal);
        int ticketPrice_hexa = 0x4A;   // hexa system
        System.out.println(ticketPrice_hexa);
//        int phoneNumber = 077_123_3678;
//        System.out.println(phoneNumber);

        long lng1 = 71;
        System.out.println(lng1);
        long lng2 = 7L;
        System.out.println(lng2);
        
        float pi_1=3.14159f;
        float pi_2=314159e-05f;

        boolean soldOut = false;
        char ch = '0';
    }
}
