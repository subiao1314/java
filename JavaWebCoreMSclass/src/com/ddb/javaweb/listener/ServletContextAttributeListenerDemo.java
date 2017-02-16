package com.ddb.javaweb.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextAttributeListenerDemo
 *
 */
@WebListener
public class ServletContextAttributeListenerDemo implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextAttributeListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
    	System.out.println("ServletContextAttributeListenerDemo 增加属性....");
    
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
    	System.out.println("ServletContextAttributeListenerDemo 删除属性....");

    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
     	System.out.println("ServletContextAttributeListenerDemo 替换属性....");

    }
	
}
