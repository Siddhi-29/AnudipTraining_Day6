package com.demo.Project1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "update agent set name='siddhi' where id=29";
		String SQL = "select * from agent";
		Agentdao a1 = (Agentdao) context.getBean("a2");
		int st = a1.saveAgent(new Agent(29, "Amit", "31%"));
		int st1= a1.updateAgent(new Agent(29,"Rani","29%"));
		int st2=a1.deleteAgent(new Agent(29,"Rani","29%"));
		System.out.println(st);
    }
}
