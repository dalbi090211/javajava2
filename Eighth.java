public class Eighth {
    public static int i = 0;
    public static int j = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    public static void main(String args[]){
        int end = 0;
        int max = 0;
        System.out.print("목표 값 : ");
        end = sc.nextInt();
        System.out.print("소수 : ");
        for(i = 1; i < end; i++){
            if(i < 10){
                max = i;
            }
            else{
                max = i /2;
            }
            for(j = 2 ; j < max; j++){
                if(i%j== 0){
                    j = i+1;
                }
            }
            if(j < i + 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
