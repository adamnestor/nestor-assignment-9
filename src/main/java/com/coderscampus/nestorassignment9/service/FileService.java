package com.coderscampus.nestorassignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class FileService {

	private String fileName;

	public FileService() {
	}

	public FileService(String fileName) {
		this.fileName = fileName;
	}

	public void processCSV() throws IOException {
		Reader in = new FileReader("recipes.txt");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		for (CSVRecord record : records) {
			record.get(0);
			record.get(1);
			record.get(2);
		}
	}

}
