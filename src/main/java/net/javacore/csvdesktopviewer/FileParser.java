/**
 * 
 */
package net.javacore.csvdesktopviewer;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author javacore.net
 *
 */
public class FileParser {
	String path;
	public FileParser(String path) {
		this.path = path;
	}
	
	private boolean isValidFileExtension(String filename) {
		String ext = Utils.getFileExtension(filename) ;
		return ext.equals("csv");
	}
	
	private Cell createCell(int row, int column, String value, boolean isHeading) {
		return new Cell(row, column, value, isHeading);
	}
	
	public ArrayList<Cell> parseCsvFile(){
		// check file extension
		ArrayList<Cell> cells = new ArrayList<Cell>();
		try {
		// check file existed
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(this.path);
			if(resource == null) {
				throw new Exception("File not found !" + this.path);
			}else {				
				File f = new File(resource.toURI());
				if(!this.isValidFileExtension(f.getName())) {
					throw new Exception("File extension is not valid !");
				}
				// otherwise start reading file line by line
				Scanner fileReader = new Scanner(f);
				int row = 0;
				while(fileReader.hasNext()) {
					String line = fileReader.nextLine();
										
					boolean isHeading = row == 0; // first row
					String[] columns = line.split(",");
					for(int col = 0; col < columns.length; col++) {
						cells.add(this.createCell(row, col, columns[col].replaceAll("\"", ""), isHeading));
					}
					row += 1;
				}
				fileReader.close();
				
				return cells;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return cells;
		}
	}
}
