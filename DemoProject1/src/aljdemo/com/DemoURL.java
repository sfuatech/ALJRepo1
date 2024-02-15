package aljdemo.com;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			URL url =new URL("https://www.moneycontrol.com/news/technology/lessons-from-byjus-will-keep-investors-board-on-toes-gsvs-michael-moe-12259801.html");
		
			System.out.println("Protocal ="+url.getProtocol());
			System.out.println("Path ="+url.getPath());
			System.out.println("Port ="+url.getPort());
			System.out.println("Query ="+url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
