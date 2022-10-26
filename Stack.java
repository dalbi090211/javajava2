public class Stack {
//이름이 stack이긴한데 q_sort구현임
	public static int i = 0;

	public static void swap(int[] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void q_sort(int[] arr, int left, int right){
		makeBorder(arr, left, right);
	}

	public static void makeBorder(int[] arr, int left, int right){
		//정렬을 실행할 배열의 좌, 우가 일치하는 경우
		if(left == right){
			return;
		}
		
		int border = partition(arr, left, right);
		makeBorder(arr, 0, border - 1);
		makeBorder(arr, border, right);

	}

	public static int partition(int[] arr, int left, int right){
		int border = left;
		int lowerIndex = right;
		int higherIndex = left;
		while(lowerIndex > higherIndex){
			while(arr[higherIndex] <= border && higherIndex < lowerIndex){	//pivot보다 크거나 higher==lower일 때 종료
				higherIndex++;
			}
			while(arr[lowerIndex] > border && higherIndex < lowerIndex){	//pivot과 작거나 같을 때, higher==lower일 때 종료
				lowerIndex++;
			}
			swap(arr, higherIndex, lowerIndex);
		}
		return higherIndex;
	}

	

	public static void main(String[] args) {
		int[] anyValue;
		anyValue = new int[] {10, 40, 30, 40, 70, 10};
		System.out.println("이전 ");
		for(int i = 0 ; i < 6; i++){
			System.out.println("i : " + anyValue[i]);
		}
		q_sort(anyValue, 0, anyValue.length - 1);
		System.out.println("이후");
		for(int i = 0 ; i < 6; i++){
			System.out.println("i : " + anyValue[i]);
		}
		
	}
}


