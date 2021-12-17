package algo;

public class SearchExam {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		
		for (int i = 0; i<arr.length;i++) {
			if(arr[i] ==5) {
				System.out.println(i);
				break;
			} else if (i==arr.length-1) {
				System.out.println("찾지못했습니다.");
			}
			
		}

	}

}
