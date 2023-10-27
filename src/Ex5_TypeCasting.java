// Type Casting

public class Ex5_TypeCasting {

    public static void main(String[] args) {

        byte a=5;
        int c;
        c=a; //automatic type conversion - implicit
        System.out.println(c); 
        
        byte b; //1byte
        int n = 100000; //4byte
        b = (byte)n; //explicit type conversion
        System.out.println(b);
        
    }
}
