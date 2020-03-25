package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		
		App test = new App();
        //
		assertEquals("bcd",test.stringreplace("abcd"));
		assertEquals("bcd",test.stringreplace("bacd"));
		assertEquals("cd",test.stringreplace("aacd"));
		assertEquals("bbcd",test.stringreplace("bbcd"));
		assertEquals("baa",test.stringreplace("aabaa"));
	}
	
}
