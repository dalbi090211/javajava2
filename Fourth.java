public class Fourth {
    public static int i = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    public static void main(String args[]){
        int temp = 0;
        int selection = 0;
        System.out.print("{ 사용자 입력 : ");
        selection = sc.nextInt();
        for(i = 3; i < selection ; i+=3){
            temp += i;
            if(i == selection){}
        }
        System.out.println(selection + "을 넘었을 때의 값 : " + i);
        System.out.println(selection + "을 넘었을 때까지의 총 합계 : " + temp);
        System.out.println(selection + "을 넘었을 때까지 몇 번째 3의 배수인가 : " + (i/3) + " }");
    }
}
