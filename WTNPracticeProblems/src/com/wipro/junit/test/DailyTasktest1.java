package com.wipro.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.junit.task.DailyTasks;

public class DailyTasktest1 {

	@Test
	public void testSortValues() {
		DailyTasks dT1=new DailyTasks();
		int in[]= {3,1,2};
		int out[]= {1,2,3};
		assertArrayEquals(out,dT1.sortValues(in));
	}

}
