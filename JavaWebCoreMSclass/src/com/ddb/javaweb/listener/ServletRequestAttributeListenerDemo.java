package com.ddb.javaweb.listener;

import java.util.Date;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Application Lifecycle Listener implementation class ServletRequestAttributeListenerDemo
 *
 */
@WebListener
public class ServletRequestAttributeListenerDemo implements ServletRequestAttributeListener {
         String now=new Date().toLocaleString();
     /**
     * Default constructor. 
     */
    public ServletRequestAttributeListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
    	System.out.println("ServletRequestAttributeListenerDemo 删除request属性....");    	
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    	System.out.println(now+"新增的request属性名："+arg0.getName()+"-->"+"新增的属性值为："+arg0.getValue());    	
       
    		  
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	HttpServletRequest  request = (HttpServletRequest)arg0.getServletRequest();
    	System.out.println(now+"替换的request属性名："+ arg0.getName()+"--->"+"替换的属性值为："+ request.getAttribute(arg0.getName()));    	
 
    }
	
}
