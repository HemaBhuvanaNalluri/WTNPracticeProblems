package com.wipro.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.junit.task.DailyTasks;

public class DailyTaskTest3 {

	@Test
	public void testCheckPresence() {
		DailyTasks dT3=new DailyTasks();
		assertEquals(true,dT3.checkPresence("hello", "he"));
	}

}
