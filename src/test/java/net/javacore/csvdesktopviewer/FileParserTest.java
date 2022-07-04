package net.javacore.csvdesktopviewer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileParserTest {
	final FileParser fileParser = new FileParser("vaccine_data_vietnam_city.csv");
	@Test
	final void testFileParser() {
		assertInstanceOf(FileParser.class, fileParser);
	}

	@Test
	final void testParseCsvFile() {
		// fail("Not yet implemented");
		
		boolean parsedStatus = this.fileParser.parseCsvFile();
		assertEquals(parsedStatus, true);
	}

}
