package 날짜_개념;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 날짜_기본이론3_캘린더 {
	/*
	 * # Date 클래스의 활용
	 * . Date 클래스 객체에서 년, 월, 일, 시, 분, 초를 얻어오려면
	 * . get으로 시작하는 메소드를 사용한다.
	 * . Date 클래스는 1900년을 기준으로 날짜를 처리한다.
	 */

	public static void main(String[] args) {
		
		Date date = new Date();		
		// 작대기가 그어진함수는 곧 사용금지될 함수들이다. date를 사용하지말고
		// Calendar 클래스 사용을 권한다. 
		System.out.println("년 : " + (date.getYear() + 1900));
		System.out.println("월 : " + (date.getMonth() + 1));
		System.out.println("일 : " + date.getDate());
		
		System.out.println("요일 : "+ date.getDay());			
		// 일요일(0), 월요일(1), ..., 토요일(6)
		
		System.out.println("시 : " + date.getHours());
		System.out.println("분 : " + date.getMinutes());
		System.out.println("초 : " + date.getSeconds());
		/*
		 * Calendar 클래스는 singleton 패턴으로 설계된 클래스이므로 객체를 만들어 사용할 수 없다.
		 * 객체를 만들어 사용할 수 없는 클래스는 클래스 내부에 자신의 클래스로 만든 객체를 가지고 있고
		 * 내부에 가지고 있는 클래스 객체를 얻어오는 메소드를 실행해서 사용한다.
		 */
		System.out.println("-----------------------------");
		// Calendar calendar = new Calendar();		// new를 사용해서 객체를 생성할 수 없다.
		Calendar calendar = Calendar.getInstance();	// getInstance() : 클래스 내부에서 선언된 자신의 클래스 객체를 얻어온다.
		System.out.println(calendar);
		
		/*
		 * Calendar 클래스 객체는 날짜 및 시간 정보 이외의 더 많은 정보를 가지고 있으므로 
		 * SimpleDateFormat 클래스 객체를 이용해 서식을 지정하려면 
		 * getTime() 메소드로 날짜와 시간만 얻어온 후 적용시켜야 한다.
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		System.out.println(Calendar.YEAR);
		System.out.println("년 : " + calendar.get(Calendar.YEAR));
		System.out.println("월 : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("일 : " + calendar.get(Calendar.DATE));
		
		// 일요일(1), 월요일(2), ..., 토요일(7)
		System.out.println("요일 : " + calendar.get(Calendar.DAY_OF_WEEK));	
		
		System.out.println("시 : " + calendar.get(Calendar.HOUR));				// 12시각
		System.out.println("시 : " + calendar.get(Calendar.HOUR_OF_DAY));		// 24시각
		System.out.println("분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("초 : " + calendar.get(Calendar.SECOND));

	}
}