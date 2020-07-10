package com.wipro.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.junit.task.DailyTasks;

public class DailyTasksTest2 {

	@Test
	public void testDoStringConcat() {
		DailyTasks dT2=new DailyTasks();
		assertEquals("hi hello",dT2.doStringConcat("hi", "hello"));
	}

}
