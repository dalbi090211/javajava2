public class Second {
    //전역함수 선언
    public static int i = 0;
    public static int j = 0;
    public static java.util.Scanner sc  = new java.util.Scanner(System.in);

    public static class student{
        int math, english, korean;
        void get_value(){
            System.out.print("국어 : ");
            this.korean = sc.nextInt();
            System.out.print("영어 : ");
            this.english = sc.nextInt();
            System.out.print("수학 : ");
            this.math = sc.nextInt();
        }
        void output_value(int temp){
            int all = 0;
            all = this.math + this.english + this.korean;
            System.out.println(temp + "번째 학생 : " + "총점 " + all + "점, 평균 " + all/3 + "점");
            
        }
    }
    
    //main함수
    public static void main(String args[]){
        student[] students = new student[50];
        int count = 0;
        i = 0;
        do{
            count++;
            i++;
            students[i] = new student();
            students[i].get_value();
        }while(students[i].math != 0 || students[i].english != 0 || students[i].korean != 0);
        System.out.print("{ ");
        for(i = 1; i < count; i++){  //마지막 케이스는 출력하지 않음
            if(i == count - 1){
                students[i].output_value(i);
                System.out.println(" }");
            }
            else{
            students[i].output_value(i);
            }
        }
    }
}
