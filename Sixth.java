public class Sixth {
    public static int i = 0;
    public static int j = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);
    public static void main(String args[]){
        System.out.print("{ ");  
       while(j !=5){
        for(i = 1; i< 6; i++){
            System.out.print(j*5 + i);
            System.out.print(" ");
            if(i == 5){
                if(j == 4){
                    System.out.println("}");
                }
                else{
                    System.out.println();
                }
            }
        }
        j++;
       }
    }
}