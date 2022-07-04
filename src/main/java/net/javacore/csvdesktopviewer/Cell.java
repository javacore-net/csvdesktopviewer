/**
 * 
 */
package net.javacore.csvdesktopviewer;

/**
 * @author javacore.net
 *
 */
public class Cell {
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public boolean isHeading() {
		return isHeading;
	}

	private int rowIndex;
	private int columnIndex;
	private String value;
	private boolean isHeading;
	
	public Cell(int rowIndex, int columnIndex, String value, boolean isHeading) {
		// TODO Auto-generated method stub
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
		this.value = value;
		this.isHeading = isHeading;
	}
}
