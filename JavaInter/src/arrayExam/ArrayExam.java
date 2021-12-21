package arrayExam;

public class ArrayExam {
/*
 array 배열 - 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 방식
                      생성시 정한 갯수를 수정할 수 없다.
                      기본적으로 배열은 0으로 초기화 되어 생성된다.
 int[] score = new int[5];
 String[] name = new String[5];
 */
	public static void main(String[] args) {
//		int[] score = new int[5];
//		
//		for (int i = 0; i<5 ; i++)
//		System.out.println(score[i]);
//	
//			score[0] = 10;
//			score[1] = 20;
//			score[2] = 30;
//			score[3] = 40;
//			score[4] = 50;
//		for ( int i =0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		
//		int[] math = new int[5];
//		for(int j = 0; j<=math.length; j++) {
//			math[j] = j*10 + 50;
//		}
//		for(int j = 0; j<=math.length; j++) {
//			System.out.println(math[j]);
//		}
		
		//배열의 길이를 수정하는 방법
		//1. 더 큰 배열을 새로 생성한다.
		//2. 기본 배열의 데이터들을 새로 생성한 배열로 복사한다.
		
//		int[] arr = new int[5];
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = i+1;
//		}
//		System.out.println("배열 수정 전");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr["+ i + "] : " + arr[i]);
//		}
//		
//		System.out.println("배열 수정 후 tmp");
//		
//		int[] tmp = new int[arr.length * 2];
//		for(int i = 0; i<arr.length ; i++) {
//			tmp[i] = arr[i];
//		}
//		for(int i = 0; i<tmp.length; i++) {
//			System.out.println("tmp["+ i + "] : " + tmp[i]);
//		}
//		
//		arr = tmp;
//		System.out.println("배열 수정 후 arr");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr["+ i + "] : " + arr[i]);
//		}
//		
//		char[] abc = {'A','B','C','D'};
//		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
//		System.out.println(abc);
//		System.out.println(num);
//		//두 개의 배열을 붙여서 하나의 배열
//		char[] result = new char[abc.length + num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.out.println(result);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
		//학생 5명의 총점합계 점수와 평균을 구하시오
		//총점 : 평균:
		//int[] score = {100,88,98,90,96};
		//int sum = 0;
		//double avg = 0; 
		
//		for(int i = 0 ; i<=5 ; i++) {
//			sum = sum + score[i];	
//		}
//		avg = sum/5;
//		System.out.println("총점 : "+ sum + " 평균 : " + avg);
		
//		int[] score = {100,88,98,90,96};
//		int sum = 0;
//		double avg = 0;
//		
//		for(int item : score) {
//			sum +=item;
//		}
//		avg = sum / (double)score.length;
//		System.out.println("총점 : "+ sum + " 평균 : " + avg);
		
//		int[] scores = {78,88,98,90,96,67,65,87};
//		//최대값: 최소값:
//		int max = scores[0];
//		int min = scores[0];
//		
//		for(int i : scores) {
//			if(max < i) {
//				max = i;
//			}
//			else if(min > i) {
//				min = i;
//			}
//		}
//		System.out.println("최대값 : " + max + " 최소값 : " + min);
		
		
//		int[] scores = {78,88,98,90,96,67,65,87};
//		//scores = {87,65,67,96,90,98,88,78}
//		int[] tmp = new int[scores.length];
//		
//		for (int i = 0 ; i<scores.length; i++) {
//			tmp[i] = scores[scores.length-i-1];
//		}
//		scores = tmp;
//		System.out.println(scores);
//		
//		for(int item : scores) {
//			System.out.print(item + " ");
//		}
		
		
		//quiz 444657953
		//0의개수: 1의개수: 2의개수: ...
//		int[] arr = {4,4,4,6,5,7,9,7,5,3};
//		int[] counter = new int[10];
//		for(int i =0; i<arr.length; i++) {
//			counter[arr[i]]++;
//			//counter[arr[i]] = counter[arr[i]] + 1;
//		}
//		for(int j = 0; j<counter.length; j++) {
//			System.out.println(j+"의 갯수: " + counter[j]);;
//		}
		
//		String[] name = new String[3]; //길이가 3인 String배열 생성
//		name[0] = "Kim";
//		name[1] = "Song";
//		name[2] = "Park";
//		
//		String[] name2 = {"Kin","Sing","Park"}; //생략
//		String[] name3 = new String[] {"Kin","Sing","Park"}; //정석
//		
//		for(int i =0; i<name.length; i++) {
//			System.out.println("name[" + i + "] = " + name[i]);
//		}
//		for(String each:name) {
//			System.out.print(each + " ");
//		}
		
		// char배열과 String배열 변환
//		char[] chArr = {'A', 'B', 'C'};
//		String str = new String(chArr); //char배열을 스트링으로
//		System.out.println(str); //스트링을 char배열로
//		
//		char[] tmp = str.toCharArray();// 임시변수를 잡아서 str를 char형으로 바꿈
		
		//quiz src라는 String에 "ABCDE"을 만들어 chArr이라는 char[]로 변환하여 출력
		String src = "ABCDE";
		//char[] tmp = src.toCharArray();
		for(int i = 0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+ i+"): " + ch);
		}
		//System.out.println(tmp);
		}

}
