package com.learncamel.file.test;

import java.io.File;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.learncamel.file.CopyFilesRoute;

public class CopyFilesRouteTest extends  CamelTestSupport {
	
	@Override
	  protected RoutesBuilder createRouteBuilder() throws Exception {
        return new CopyFilesRoute();
    }
	
	@Test
	public void checkFileExistsInOutputDir() throws InterruptedException {
		Thread.sleep(5000);
		File file=new File("data/output");
		assertTrue(file.isDirectory());
		assertEquals(2, file.listFiles().length);
	}

}
