package algo;

public class MaxExam {

	public static void main(String[] args) {
		int i = 0;
		int max = 0;
		int[] arr = {1,2,3,4,5};
		for (i = 0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("max : " +max);
	}

}
