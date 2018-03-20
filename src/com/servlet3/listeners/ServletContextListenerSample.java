package com.servlet3.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListenerSample
 *
 */
@WebListener
public class ServletContextListenerSample implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextListenerSample() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("Removing params");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         ServletContext servletContext = arg0.getServletContext();
         servletContext.setInitParameter("ContextInitParam", "ContextInitParamValue");
    }
	
}
