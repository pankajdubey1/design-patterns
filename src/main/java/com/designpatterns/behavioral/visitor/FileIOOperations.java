package com.designpatterns.behavioral.visitor;

public enum FileIOOperations {

	TXT {
		@Override
		public <IN, OUT> OUT accept(FileIOVisitor<IN, OUT> visitor, IN in) {
			return visitor.visitTXT(in);
		}
	},

	XLS {
		@Override
		public <IN, OUT> OUT accept(FileIOVisitor<IN, OUT> visitor, IN in) {
			return visitor.visitXLS(in);
		}
	},

	CSV {
		@Override
		public <IN, OUT> OUT accept(FileIOVisitor<IN, OUT> visitor, IN in) {
			return visitor.visitCSV(in);
		}
	};

	public abstract <IN, OUT> OUT accept(FileIOVisitor<IN, OUT> visitor, IN in);
}
