package algo;

public class Search2Exam {
	static int[] arr = {11,13,15,17,24,29};
	static int search2Exam (int key, int head, int tail) {
		int center;
		while (head<=tail) {
			center = (head+tail)/2;
			if (arr[center]==17) {
				return center;
			}
			else if (arr[center]>key) {
				tail = center-1;
			}
			else {
				head = center+1;
			}			
		}
		return -1;
	}

	public static void main(String[] args) {
		int a = search2Exam(17,0,arr.length-1);
		if(a ==-1) {
			System.out.println("찾지못했습니다.");
		}else {
			System.out.println(a+"번째 요소와 일치합니다.");
		}
	}

}
