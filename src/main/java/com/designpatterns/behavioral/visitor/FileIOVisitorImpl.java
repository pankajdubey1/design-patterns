package com.designpatterns.behavioral.visitor;

public class FileIOVisitorImpl implements FileIOVisitor<String, String> {

	@Override
	public String visitTXT(String filePath) {
		return "TXT";
	}

	@Override
	public String visitXLS(String filePath) {
		return "XLS";
	}

	@Override
	public String visitCSV(String filePath) {
		return "CSV";
	}
}
