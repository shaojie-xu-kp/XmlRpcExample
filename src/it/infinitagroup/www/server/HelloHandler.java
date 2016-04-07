package it.infinitagroup.www.server;

public class HelloHandler {

	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	public String add(int a, int b){
		return String.format("The add is %s", String.valueOf(a+b));
	}

}
