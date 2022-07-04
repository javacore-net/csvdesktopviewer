package net.javacore.csvdesktopviewer;

public class Utils {
	public static String getFileExtension(String filename) {
		final String extensionSeparator = ".";
		int lastIndex = filename.lastIndexOf(extensionSeparator);
		if(lastIndex >= 0 && lastIndex != filename.length() - 1) {
			return filename.substring(lastIndex + 1);
		}
		return "";
	}
}
