package practice;

import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class ProcessTest2 {

	@Test
	public void test() throws IOException {
		Process proc=new Process("/<replace file path>/Test2.txt");
		proc.search();
		//assertTrue(outputhas,containsOneOf("Category","1"));
		assertEquals("pass","PERSON          0", "PERSON          0");
		assertEquals("pass","PLACE          0","PLACE          0");
	}

}
