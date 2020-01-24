package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	protected Time time;
	
	public MyClass(Time t) {
		time = t;
	}
	
	public String nextTime(long seconds, LocalDateTime tm) {
		String next = time.getFutureTime(seconds, tm);
		//System.out.println(next);
		return next;
	}

}
