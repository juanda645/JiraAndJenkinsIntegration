package com.jira.jenkins.jiraJenkinsIntegration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App p = new App();
        System.out.println( "Divicion="+p.prueba() );
    }
    
    public int prueba(){
    	int div=8/0;
    return div;
    }
}
