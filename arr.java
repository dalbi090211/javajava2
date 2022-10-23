public class arr

{

    public static java.util.Scanner sc  = new java.util.Scanner(System.in);

    public static class Int_arr {

        int arr[];
        int i;

        Int_arr(int ...arr){      //생성자 함수
            this.arr = arr;
        }

        int getMax(){   //배열의 최대값을 구해 리턴하는 함수
            int temp = 0;

            for(i = 0; i < arr.length ; i++){
                if(arr[i] > temp){
                    temp = arr[i];
                }
            }
            return temp;
        }

        int getMin(){   //배열의 최소값을 구해 리턴하는 함수
            int temp = arr[0];

            for(i = 1; i < arr.length ; i++){
                if(arr[i] < temp){
                    temp = arr[i];
                }
            }
            return temp;
        }

        int getSum(){   //배열의 합을 구해 리턴하는 함수
            int temp = 0;

            for(i = 0; i < arr.length ; i++){
                temp += arr[i];
            }
            return temp;
        }

        void leftswap(){    //배열을 왼쪽으로 한칸 씩 당기는 함수. 맨 앞의 값은 배열의 끝 자리로 감.
            int temp = 0;

            temp = arr[0];
            for(i = 0; i < arr.length - 1 ; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
        }

        int getMultiple(int Multiple){  //배수의 개수를 구해 리턴하는 함수.인자로 구할 배수를 받음.
            int temp = 0;
            for(i = 0; i < arr.length ; i++){
                if(arr[i] % Multiple == 0){
                    temp += 1;
                }
            }
            return temp;
        }
    }

    public static void printIntArr(int[] arr){   //배열을 순회하여 출력하는 함수
        int i = 0;
        for(i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    

	public static void main(String[] args) {

	    Int_arr[] fixedArr;
	    int userAnswer = 0;
        int count;
        int i;
        int j;

	    System.out.print("몇 번 코드를 실행할까요 : ");
	    userAnswer = sc.nextInt();
	    if(userAnswer < 9 && userAnswer > 0){
	        switch(userAnswer){
	            case 1 : 
                    fixedArr = new Int_arr[1];
	                fixedArr[0] = new Int_arr(234, 89, 678, 55, 785, 66);
	                System.out.print("[ 배열 : ");
	                printIntArr(fixedArr[0].arr);
	                System.out.println("]");
	                System.out.println();
	                System.out.println("{ 가장 큰 값 : " + fixedArr[0].getMax());
	                System.out.println("가장 작은 값 : " + fixedArr[0].getMin() + "}");
                    break;

	            case 2 : 
                    fixedArr = new Int_arr[1];
	                fixedArr[0] = new Int_arr(234, 89, 678, 55, 785, 66, 88);
	                System.out.print("[ 배열 : ");
	                printIntArr(fixedArr[0].arr);
	                System.out.println("]");
	                System.out.println();
	                System.out.println("{ 가장 큰 값과 작은 값을 제외한 합 : " + (fixedArr[0].getSum() - fixedArr[0].getMax() - fixedArr[0].getMin()));
	                System.out.println("가장 큰 값과 작은 값을 제외한 평균 : " + ((fixedArr[0].getSum() - fixedArr[0].getMax() - fixedArr[0].getMin())/fixedArr[0].arr.length) + "}");
	                break;

	            case 3 : 

                    fixedArr = new Int_arr[1];
	                fixedArr[0] = new Int_arr(33, 2, 189, 72, 7, 91, 5, 14, 17, 9);

	                System.out.print("[ 배열 : ");
	                printIntArr(fixedArr[0].arr);
	                System.out.println("]");
	                System.out.println();

	                System.out.print("{ 초기 배열 값 : " );
	                printIntArr(fixedArr[0].arr);
	                System.out.println();

	                System.out.print("이동 후 배열 값 : ");
	                fixedArr[0].leftswap();
	                printIntArr(fixedArr[0].arr);
	                System.out.println("}");
	                break;
                case 4 : 

                    String[] charArr = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};

                    System.out.print("[ 배열 : ");
	                for(i = 0 ; i < charArr.length; i++){
                        System.out.print(charArr[i] + " ");
                    }
	                System.out.println("]");
	                System.out.println();

	                System.out.print("{ 초기 배열 값 : " );
	                for(i = 0 ; i < charArr.length; i++){
                        System.out.print(charArr[i] + " ");
                    }
	                System.out.println();

	                System.out.print("이동 후 배열 값 : ");
	                for(i = 0 ; i < charArr.length; i++){
                        System.out.print(charArr[i] + " ");
                    }
	                System.out.println("}");
                    break;


                case 5 : 
                    int multiple = 3;
                    count = 0;
                    fixedArr = new Int_arr[4];
                    fixedArr[0] = new Int_arr(28, 33, 36, 7);
                    fixedArr[1] = new Int_arr(56, 66, 44, 20);
                    fixedArr[2] = new Int_arr(88, 7, 21, 44);
                    fixedArr[3] = new Int_arr(33, 2, 643, 4);
                    for(i = 0 ; i < 4 ; i++){
                        count += fixedArr[i].getMultiple(multiple);
                    }
                    System.out.println("{ " + multiple + "의 배수는 " + count + "개입니다. }");
                    break;
                case 6 : 
                    fixedArr = new Int_arr[4];
                    fixedArr[0] = new Int_arr(28, 33, 36, 7);
                    fixedArr[1] = new Int_arr(56, 66, 44, 20);
                    fixedArr[2] = new Int_arr(88, 7, 21, 44);
                    fixedArr[3] = new Int_arr(33, 2, 643, 4);
                    System.out.print("{ ");
                    for(i = 0 ; i < 4 ; i++){
                        count = 0;
                        for(j = 0 ; j < 4 ; j++){
                            count += fixedArr[j].arr[i];
                        }
                        System.out.print(i + "열의 합계 : " + count);
                        if(i != 3){
                            System.out.println();
                        }
                    }
                    System.out.println(" }");
                    break;
                case 7 : 
                    Boolean roopCount = true;
                    int howNum = 4;
                    fixedArr = new Int_arr[3];
                    fixedArr[0] = new Int_arr(7, 9, 4, 7, 2);
                    fixedArr[1] = new Int_arr(3, 4, 6, 7, 2);
                    fixedArr[2] = new Int_arr(3, 2, 6, 9, 8);
                    System.out.print("{ ");
                    while(roopCount == true){
                        count = 0;
                        for(i = 0 ; i < 3 ; i++){
                            for(j = 0 ; j < 5 ; j++){
                                if(fixedArr[i].arr[j] == howNum){
                                    count++;
                                }
                            }
                        }
                        System.out.print(howNum + "의 개수 : " + count);
                        if(howNum != 8){
                            System.out.println();
                        }
                        if(howNum == 4){
                            howNum = 7;
                        }
                        else if(howNum == 7){
                            howNum = 3;
                        }
                        else if(howNum == 3){
                            howNum = 2;
                        }
                        else if(howNum == 2){
                            howNum = 6;
                        }
                        else if(howNum == 6){
                            howNum = 9;
                        }
                        else if(howNum == 9){
                            howNum = 8;
                        }
                        else if(howNum == 8){
                            roopCount = false;
                        }
                    }
                    System.out.println(" }");
                    break;
                case 8 :
                    fixedArr = new Int_arr[2];
                    fixedArr[0] = new Int_arr(7, 9, 4, 7, 2);
                    fixedArr[1] = new Int_arr(3, 4, 6, 7, 2);
                    Int_arr[] fixedArr2 = new Int_arr[2];
                    fixedArr2[0] = new Int_arr(3, 1, 4, 8, 0);
                    fixedArr2[1] = new Int_arr(3, 5, 6, 9, 1);
                    int[][] temp;
                    temp = new int[fixedArr.length][5];
                    System.out.print("{ ");
                    for(i = 0 ; i < 2; i++){
                        for(j = 0 ; j < 5 ; j++){
                            temp[i][j] = fixedArr[i].arr[j] + fixedArr2[i].arr[j];
                        }
                        printIntArr(temp[i]);
                        if(i == 0){
                            System.out.println();
                        } 
                    }
                    System.out.println("}");
                    break;  
	        }
	    }
	    else{
	        System.out.println("원하시는 번호의 코드가 없습니다.");
	    }
	}
}