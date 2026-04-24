package chap11;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TimeExam {

	public static void main(String[] args) {
		
		// timestamp, UNIX time
		Long before = System.currentTimeMillis();
		System.out.println(before);
		
		for(int i=0; i<100000000; i++) {
			
		}
		
		Long after = System.currentTimeMillis();
		System.out.println("걸린시간 : "+ (after - before));
		
		System.out.println(Long.MAX_VALUE);
		
		Date date = new Date(after);
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
	}

}
