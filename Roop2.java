public class Roop2 {
    //전역함수 선언
    public static int i = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);

    public static class first{
        int end = 0;
        int temp = 0;
        void get_endvalue(){
            System.out.print("값을 입력해주세요 : ");
            this.end = sc.nextInt();
        }
        void output_value(){
            System.out.print("{");
            for(i = 1; i < end + 1; i++){
                temp += i;
                if(i == end){
                    System.out.println("1 - " + i + "까지의 합 : " + temp + " }");
                }
                else if(i%10 == 0){
                    System.out.println("1 - " + i + "까지의 합 : " + temp);
                }
            }
        }
    }
    
    //main함수
    public static void main(String args[]){
       first open = new first();
       open.get_endvalue();
       open.output_value();
    }
}
