package algo;

public class SumArray {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int[] arr = {1,2,3,4,5};
		for (i = 0; i< arr.length ; i++) {
			sum +=arr[i];
		}
		System.out.println("sum : " + sum);

	}

}
