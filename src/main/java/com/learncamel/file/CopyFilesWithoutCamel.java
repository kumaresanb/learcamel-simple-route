package com.learncamel.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CopyFilesWithoutCamel {
	public static void main(String[] args) throws IOException ,FileNotFoundException{
		File inputDir = new File("data/input");
		File outputDir = new File("data/output");

		File[] files = inputDir.listFiles();

		for (File source : files) {
			if (source.isFile()) {
				File dest = new File(outputDir.getPath() + File.separator + source.getName());
				OutputStream oStream=new FileOutputStream(dest);
				byte[] buffer=new byte[(int)source.length()];
				FileInputStream iStream=new FileInputStream(source);
				iStream.read(buffer);
				try {
					oStream.write(buffer);
				}finally {
					oStream.close();
					iStream.close();
				}
				
				
			}
		}
	}
}
