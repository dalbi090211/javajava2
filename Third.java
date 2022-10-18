public class Third {
    public static int i = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    public static void main(String args[]){
        System.out.println("{ ** 2단 **");
        System.out.println("2 * 1 = 2");
        for(i = 3; i < 9; i+=2){
            System.out.println("2 * " + i + " = " + i*2);
        }
        System.out.println("2 * 9 = 18 }");
    }
}

