package practice;

import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class ProcessTest1 {

	@Test
	public void test() throws IOException {
		Process proc=new Process("/<replace file path>/Test1.txt");
		proc.search();
		assertEquals("pass","PERSON          1", "PERSON          1");
		assertEquals("pass","PLACE          0","PLACE          0");
	}

}
