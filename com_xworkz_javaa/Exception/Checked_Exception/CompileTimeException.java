package com_xworkz_javaa.Exception.Checked_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.jar.Manifest;

public class CompileTimeException {
  public static void main(String[] args) {
	  
	  try {
		  FileReader file = new FileReader("C:\\sujjuu.txt");
		BufferedReader reader = new BufferedReader(file);
		  for(int i=0;i<2;i++) {
			  System.out.println(reader.readLine());
		  }
	  }
	  catch(IOException e) {
		  System.out.println("Exception caught.");
	  }
	  System.out.println("main ended.");
  }
}
