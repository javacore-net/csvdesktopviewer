/**
 * 
 */
package net.javacore.csvdesktopviewer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author javacore.net
 *
 */
class UtilsTest {
	final static String filename = "vaccine_data_vietnam_city.csv";
	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.Utils#getFileExtension(java.lang.String)}.
	 */
	@Test
	final void testGetFileExtension() {
		String fileExtension = Utils.getFileExtension(filename);
		assertEquals("csv", fileExtension);
	}

}
