package com.ddb.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpSeccionAttributeListenerDemo
 *
 */
@WebListener
public class HttpSeccionAttributeListenerDemo implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public HttpSeccionAttributeListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSeccionAttributeListenerDemo 增加属性....");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSeccionAttributeListenerDemo 删除属性....");

    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	System.out.println("HttpSeccionAttributeListenerDemo 替换属性....");

    }
	
}
