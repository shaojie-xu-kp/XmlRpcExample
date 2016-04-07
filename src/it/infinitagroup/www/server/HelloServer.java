package it.infinitagroup.www.server;

import helma.xmlrpc.WebServer;
import helma.xmlrpc.XmlRpc;

import java.io.IOException;

public class HelloServer {

    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println(
//                "Usage: java javaxml2.HelloServer [port]");
//            System.exit(-1);
//        }
    
        try {
            // Use the Apache Xerces SAX Driver
            XmlRpc.setDriver("org.apache.xerces.parsers.SAXParser");

            // Start the server
            System.out.println("Starting XML-RPC Server...");
            WebServer server = new WebServer(8585);   
            
            // Register the handler class
            server.addHandler("hello", new HelloHandler( ));
            System.out.println("Registered HelloHandler class to \"hello\"");     

            System.out.println("Now accepting requests...");

            
        } catch (ClassNotFoundException e) {
            System.out.println("Could not locate SAX Driver");
        } catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                    
    }
}
