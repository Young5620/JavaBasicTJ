/*
 Calendar 추상클래스이기 때문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
 Calendar cal = new Calendar(); ->에러발생
 Calendar cal = Calendar.getInstance(); 
 */


package etcExam;
import java.util.*;//구버전 8이전
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("올해의 연도는 : " + today.get(Calendar.YEAR));
		System.out.println("현재의 월은 : " + today.get(Calendar.MONTH));
		//MONTH는 0에서 시작한다.
		System.out.println("올해 중 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 중 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇일 : "+ today.get(Calendar.DATE));
		System.out.println("이달의 몇일 : "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇일 : "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : "+ today.get(Calendar.DAY_OF_WEEK));
		//일요일이 1
		String[] str = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 : " + str[today.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2000, 1, 1);
		
		//System.out.println("date1은 "+date1.toString());
		long diff= (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지 " + diff+"초 지났습니다.");
		System.out.println("date1부터 date2까지 " + diff/(60*60*24)+"일 지났습니다.");
		
		LocalDate now = LocalDate.now();
		System.out.println(now); //현재 날짜 (컴퓨터날짜)
		
		LocalDate pari = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(pari);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		String formattedNow = now.format(formatter);
		System.out.println(formattedNow);
		
		int year = now.getYear();
		System.out.println("현재의 연도는"+year+"입니다.");
		String mon = now.getMonth().toString();
		System.out.println("현재의 월은"+mon+"입니다.");
		int monVal = now.getMonthValue();
		System.out.println("현재의 월은"+monVal+"월 입니다.");
		String day = now.getDayOfWeek().toString();
		System.out.println("오늘은"+day+"입니다.");
		int dayVal = now.getDayOfWeek().getValue();
		System.out.println("오늘은"+dayVal+"입니다.");//월요일 1 일요일이 7
		
		LocalTime ntime = LocalTime.now();
		System.out.println(ntime);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formattedTime = ntime.format(formatter1);
		System.out.println(formattedTime);
		int hour = ntime.getHour();
		int min = ntime.getMinute();
		int sec = ntime.getSecond();
		System.out.println("현재 시각은 : "+hour);
		System.out.println("현재 분은 : "+min);
		System.out.println("현재 초는 : "+sec);
		
		
		//날짜와 시간을 함께
		LocalDateTime curr = LocalDateTime.now();
		System.out.println(curr);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String formattedDT = curr.format(formatter2);
		System.out.println(formattedDT);
		int year1 = curr.getYear();
		System.out.println("현재의 연도는 "+year1+"년 입니다.");
		int mon1 = curr.getMonthValue();
		System.out.println("현재의 월은 "+mon1+"월 입니다.");
		int day1 = curr.getDayOfWeek().getValue();
		String[] str2 = {"","월","화","수","목","금","토","일"};
		System.out.println("오늘은 "+str2[day1]+"요일 입니다.");
		int hour1 = curr.getHour();
		System.out.println("현재 시각은 "+hour1+"시 입니다.");
		int min1 = curr.getMinute();
		System.out.println("현재 분은 "+min1+"분 입니다.");
		int sec1 = curr.getSecond();
		System.out.println("현재 초는 "+sec1+"초 입니다.");
	}

}
