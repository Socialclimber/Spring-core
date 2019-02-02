package com.socialtech;

public class AdditionClass {
  private int results;

public AdditionClass() {
	super();
	// TODO Auto-generated constructor stub
}

public int getResults() {
	return results;
}

public void setResults(int results) {
	this.results = results;
}
public void add(int a , int b) {
 int c  = a + b;
 setResults(c);
}
}
