public class Stack {
//이름이 stack이긴한데 q_sort구현임
	public static int i = 0;

	public static void swap(String[] arr, int i, int j){
		String temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void q_sort(String[] arr, int left, int right){
		makeBorder(arr, left, right);
	}

	public static void makeBorder(String[] arr, int left, int right){
		//정렬을 실행할 배열의 좌, 우가 일치하는 경우
		if(left == right){
			return;
		}
		
		int border = partition(arr[], left, right);
		makeBorder(arr, 0, border - 1);
		makeBorder(arr, border, right);

	}

	public static int partition(String[] arr, int left, int right){
		int border = left;
		int lowerIndex = right;
		int higherIndex = left;
		while(lowerIndex > higherIndex){
			while(arr[higherIndex] <= border && higherIndex < lowerIndex){
				higherIndex++;
			}
			while(arr[higherIndex] <= border && higherIndex < lowerIndex){
				higherIndex++;
			}
			swap(arr, higherIndex, lowerIndex);
		}
		return higherIndex;
	}

	

	public static void main(String[] args) {
		int i = 0;
		while(i < 5){
			i++;
			System.out.println("i : " + i);
		}
		String[] charArr = {"kim", "park", "oh", "lim", "pang", "seo", "lee", "yang", "bae", "back"};
		System.out.print("[ 배열 : ");
		for(i = 0 ; i < charArr.length; i++){
			System.out.print(charArr[i] + " ");
		}
		System.out.println("]");
		System.out.println();

		System.out.print("{ 정렬 전 : " );
		for(i = 0 ; i < charArr.length; i++){
			System.out.print(charArr[i] + " ");
		}
		System.out.println();
		
		q_sort(charArr, 0, charArr.length-1);

		System.out.print("정렬 후 :  ");
		for(i = 0 ; i < charArr.length; i++){
			System.out.print(charArr[i] + " ");
		}
		System.out.println("}");
	}
}


