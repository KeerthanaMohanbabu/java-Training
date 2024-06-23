package day28java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fileio {


	/**
	 * 
	 * In Java, File I/O (Input/Output) refers to the process of reading from and writing to files. 
	 * It allows you to interact with files on your system. 
	 * Let’s explore the basics of Java file I/O:

	 * Streams:
	 
	      - A stream can be defined as a sequence of data.
	      -  There are two types of streams:
	      
	 * InputStream: Used for reading data from a source.
	 * OutputStream: Used for writing data to a destination.
	 * 		-- 3 types Stream,
	 * 
	      - System.out
	      - System.in
	      - System.err
	 
	 * Byte Streams:
	 
	      - Java byte streams handle input and output of 8-bit bytes.
	      - Commonly used classes for byte streams:
	      
	 * FileInputStream: Reads data from a file.
	 * FileOutputStream: Writes data to a file.
	 
	 * Byte Stream
	 * 		-- Input Stream
	 * 				-- FileInputStream
	 * 				-- ByteArrayInputStream
	 * 				-- BufferedInputStream
	 * 				-- StringBufferInputStream
	 * 				-- Data InputStream
	 * 		-- Output Stream
	 * 			    -- FileOutputStream
	 * 				-- ByteArrayOutputStream
	 * 				-- BufferedOutputStream
	 * 				-- StringBufferOutputStream
	 * 				-- Data OutputStream
	 * 
	 * Create an input.txt file with some content, compile the program, and execute it to create an output.txt file with the same content.
	  
	  
	 * Character Streams:
	      - Java character streams handle input and output of 16-bit Unicode characters.
	      - Commonly used classes for character streams:
	      
	 *FileReader: Reads characters from a file.
	 *FileWriter: Writes characters to a file.
	 
	      - The key difference is that FileReader reads two bytes at a time, while FileWriter writes two bytes at a time.
	 
	 * Character Stream
	 * 		-- Reader
	 * 			-- File Reader
	 * 			-- ByteArrayReader
	 * 			-- BufferedReader
	 * 			-- StringBufferReader
	 * 			-- Data Reader
	 * 		-- Writer
	 * 			-- File Writer
	 * 			-- ByteArrayWritter
	 * 			-- BufferedWritter
	 * 			-- StringBufferWritter
	 * 			-- Data Writer
	 */

	public static void main(String[] args) {
		createFolder();
		try {
			//createFile("newFile");
			//getAllTextFileFromPath();
			//fileReaderWritter();
			//bufferedReaderWritter();
			printWritter();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	public static void createFolder() {
		File oDir = new File("C:\\Users\\keert\\OneDrive\\Documents\\File");
		if(oDir.exists()) {
			System.out.println("Folder is already Created");
		}else {
			System.out.println("Folder is not Created, So create a new one.");
			oDir.mkdir();
		}
	}
	
	public static File createFile(String fileName) throws IOException {
		File oFile = new File("C:\\Users\\keert\\OneDrive\\Documents\\File\\"+fileName+".txt");
		if(oFile.exists()) {
			System.out.println("File is already existing.");
		}else {
			System.out.println("File is not existing, So creating the new file");
			oFile.createNewFile();
		}
		return oFile;
	}
	
	public static void getAllTextFileFromPath() {
		String filePath = "C:\\Users\\keert\\OneDrive\\Documents";
		File oPath = new File(filePath);
		String[] allFilesAndFolders = oPath.list();
		for (String fileName : allFilesAndFolders) {
			if(fileName.contains(".txt")) {
				System.out.println(fileName);
			}
			
		}

}

	public static void fileReaderWritter() throws IOException {
		File oFile = createFile("fileReaderWritter");
		FileWriter oWrite = new FileWriter(oFile);
		oWrite.write("This is a Java Session. \n");
		oWrite.write(65);
		oWrite.write("Followed by selenium Session.");
		oWrite.flush();
		oWrite.close();
		
		FileReader oRead = new FileReader(oFile);
		int iRead = oRead.read();
		while(iRead != -1) {
			System.out.print((char)iRead);
			iRead = oRead.read();
		}
		oRead.close();
	}
	
	public static void bufferedReaderWritter() throws IOException {
		File oFile = createFile("bufferReaderWritter");
		FileWriter oWrite = new FileWriter(oFile);
		BufferedWriter oBWrite = new BufferedWriter(oWrite);
		oBWrite.write("This is a Java Session");
		oBWrite.newLine();
		oBWrite.write(65);
		oBWrite.write("Followed by selenium Session.");
		oBWrite.flush();
		oBWrite.close();
		
		FileReader oRead = new FileReader(oFile);
		BufferedReader oBRead = new BufferedReader(oRead);
		String readLine = oBRead.readLine();
		while(readLine != null) {
			System.out.println(readLine);
			readLine = oBRead.readLine();
		}
		oBRead.close();
	}
	
	public static void printWritter() throws IOException {
		File oFile = createFile("printWritter");
		PrintWriter oWrite = new PrintWriter(oFile);
		oWrite.println("This is a Java Session");
		oWrite.println(122);
		oWrite.println(5.7);
		oWrite.println(true);
		oWrite.flush();
		oWrite.close();
	}

}
