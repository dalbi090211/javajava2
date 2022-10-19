public class Seven {
    //전역함수 선언
    public static int i = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    //main함수
    public static void main(String args[]){
        int a = 1;
        System.out.print("[ ");
       for(i = 0 ; i < 15; i++){
            a += i;
            System.out.print(a);
            if(i!=14){
                System.out.print(", ");
            }else{
                System.out.println(" ]");
            }
       }
    }
}