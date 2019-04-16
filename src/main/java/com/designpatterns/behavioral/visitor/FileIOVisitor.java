package com.designpatterns.behavioral.visitor;

public interface FileIOVisitor<IN, OUT> {

	OUT visitTXT(IN in);

	OUT visitXLS(IN in);

	OUT visitCSV(IN in);
}
