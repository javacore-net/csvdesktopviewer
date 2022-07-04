package net.javacore.csvdesktopviewer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FileParserTest {
	final FileParser fileParser = new FileParser("data/vaccine_data_vietnam_city.csv");
	@Test
	final void testFileParser() {
		assertInstanceOf(FileParser.class, fileParser);
	}

	@Test
	final void testParseCsvFile() {
		// fail("Not yet implemented");
		
		ArrayList<Cell> cells = this.fileParser.parseCsvFile();
		Cell firstCell = cells.get(0);
		assertEquals(firstCell.getValue(), "fK");
	}

}
