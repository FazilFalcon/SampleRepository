package com.java.directory.creation;

import java.io.File;

public class DirectoryAndMultipleDirectoriesCreation {

	    public static void main(String[] args) {

	        File file = new File("C:\\Directory1");
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }

	        File files = new File("C:\\Directory2\\Sub2\\Sub-Sub2");
	        if (!files.exists()) {
	            if (files.mkdirs()) {
	                System.out.println("Multiple directories are created!");
	            } else {
	                System.out.println("Failed to create multiple directories!");
	            }
	        }

	    }

	}
