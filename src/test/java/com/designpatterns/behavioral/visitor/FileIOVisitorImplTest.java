package com.designpatterns.behavioral.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.designpatterns.behavioral.visitor.FileIOOperations;
import com.designpatterns.behavioral.visitor.FileIOVisitor;
import com.designpatterns.behavioral.visitor.FileIOVisitorImpl;
import org.junit.jupiter.api.Test;

class FileIOVisitorImplTest {

	@Test
	void testFileIOVisitor() {
		FileIOVisitor<String, String> visitor = new FileIOVisitorImpl();
		String expected = "CSV";
		String actual = FileIOOperations.CSV.accept(visitor, "filePath");
		assertEquals(expected, actual);
	}
}
