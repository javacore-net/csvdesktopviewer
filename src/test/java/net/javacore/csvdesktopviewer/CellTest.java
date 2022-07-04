/**
 * 
 */
package net.javacore.csvdesktopviewer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * @author ASUS
 *
 */
class CellTest {
	private static int rowIndex = 0;
	private static int columnIndex = 0;
	private static String value = "Title";
	private static boolean isHeading = true;
	private final Cell cell = new Cell( rowIndex, columnIndex, value, isHeading);

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#getValue()}.
	 */
	@Test
	final void testGetValue() {
		String outputValue = cell.getValue();
		assertEquals(value, outputValue);
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#setValue(java.lang.String)}.
	 */
	@Test
	final void testSetValue() {
		// fail("Not yet implemented");		
		String newValue = "tada";
		// change new value
		cell.setValue(newValue);
		String outputValue = cell.getValue();
		assertEquals(newValue, outputValue);
	}

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#getRowIndex()}.
	 */
	@Test
	final void testGetRowIndex() {
		assertEquals(rowIndex, cell.getRowIndex());
	}

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#getColumnIndex()}.
	 */
	@Test
	final void testGetColumnIndex() {
		assertEquals(columnIndex, cell.getColumnIndex());
	}

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#isHeading()}.
	 */
	@Test
	final void testIsHeading() {
		assertEquals(isHeading, cell.isHeading());
	}

	/**
	 * Test method for {@link net.javacore.csvdesktopviewer.main.Cell#Cell(int, int, java.lang.String, boolean)}.
	 */
	@Test
	final void testCell() {
		assertInstanceOf(Cell.class, cell);
	}
}
