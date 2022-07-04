/**
 * 
 */
package net.javacore.csvdesktopviewer;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

/**
 * @author javacore.net
 *
 */
public class FileParser {
	String path;
	public FileParser(String path) {
		this.path = path;
	}
	
	public boolean parseCsvFile() {
		// check file extension
		try {
		// check file existed
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(this.path);
			if(resource == null) {
				throw new IllegalArgumentException("File not found !" + this.path);
			}else {				
				File f = new File(resource.toURI());
				System.out.print(f);
				return true;
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
