package com.ddb.javaweb.listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class HttpSessionBindingListenerDemo
 *
 */
@WebListener
public class LoginUser implements HttpSessionBindingListener {
        private String name; 
	    public LoginUser(String name){
	    	this.getName();
	    	
	    }
    /**
     * Default constructor. 
     */
    public LoginUser() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
          String now=new Date().toString();
          System.out.println("now :"+now+"**在Session中保存LoginUser(对象+name="+this.getName()+"),session id"+arg0.getSession().getId());
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
    	String now=new Date().toString();
    	System.out.println("now :"+now+"**在Session中保存LoginUser(对象+name="+this.getName()+"),session id"+arg0.getSession().getId());
    
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    
    
    
}
