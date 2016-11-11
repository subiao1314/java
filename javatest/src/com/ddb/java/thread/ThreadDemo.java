package com.ddb.java.thread;

public class ThreadDemo {

	public static void main(String[] args) {
       
		new TestThread().start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main 线程在运行");
		 try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
	   }
	 }
		
   }
}
		
class TestThread extends Thread{	
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("TestThread  在运行");
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		 }  
	   }
	}
 }		
		
	
	
		
		
		
		