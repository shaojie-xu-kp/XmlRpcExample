package it.infinitagroup.www.client;

import helma.xmlrpc.XmlRpc;
import helma.xmlrpc.XmlRpcClient;
import helma.xmlrpc.XmlRpcException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;

public class HelloClient {
 
    public static void main(String args[]) {
    	
//        if (args.length < 1) {
//            System.out.println(
//                "Usage: java HelloClient [your name]");
//            System.exit(-1);
//        }
//        
        try {
            // Use the Apache Xerces SAX Driver
            XmlRpc.setDriver("org.apache.xerces.parsers.SAXParser");

            // Specify the server
            XmlRpcClient client = new XmlRpcClient("http://localhost:8585/");  

            // Create request  
            Vector params = new Vector( );            
            params.addElement("xushaojie");

            // Make a request and print the result          
            String result = (String)client.execute("hello.sayHello", params);
        
            System.out.println("Response from server: " + result);
          
        } catch (ClassNotFoundException e) {
            System.out.println("Could not locate SAX Driver");
        } catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
    } 
}
