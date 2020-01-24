package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	
	@Test
	public void smoleTest() {
		Time t = new Time();
		my = new MyClass(t);
		long SECONDS = 60;
		LocalDateTime time = LocalDateTime.now();
		my.nextTime(SECONDS, time);
	}
	
	//EXAM EXERCISE 2: STATE TEST
	@Test
	public void returnsCorrectDate() {
		Time t = new Time();
		my = new MyClass(t);
		long seconds = 120;
		LocalDateTime time = LocalDateTime.of(2020, Month.JANUARY, 01, 0, 0, 0);
		LocalDateTime correctTime = LocalDateTime.of(2020, Month.JANUARY, 01, 0, 0, 0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		String s = formatter.format(correctTime);
		assertEquals(s, my.nextTime(seconds, time));
	}
}
