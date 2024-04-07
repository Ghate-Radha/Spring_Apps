package com.main.MYsprigJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.main.MYsprigJDBcDAO.Idao;
import com.mia.etity.passanger;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("jdbc.xml");
		
    	 Idao dao=context.getBean("passagerdao",Idao.class);
    	 passanger pass =new passanger();
    	 //******************************save query
//    	 pass.setPname("Radha");
//    	 pass.setPRN(12345678);
//    	 
//    	 pass.setPname("succhita");
//    	 pass.setPRN(9864985);
//    	 
//    	 pass.setPname("aarya");
//    	 pass.setPRN(98686545);
//    	 int output=dao.save(pass);
//    	 System.out.println("passanger data inserted successful"+output);
//    	 
    	 //*******************************update query
//    	 pass.setPname("Radha");
//    	 pass.setPRN(111111);
//    	 int update=dao.update(pass);
//    	 System.out.println("passager data UPDATED successfully"+update);
//    	 
    	 
    	//**********************************select query
  	 List<passanger> passanger =  dao.select();
      
       for(passanger s:passanger) {
   	  System.out.println("passanger data selected from database");
                       System.out.println(s);
        }
   	 
    	 //***************************delete query
    	
    	//int r=dao.delete("suchita");
    //	System.out.println("no of row deleted from passanger database := "+r);
    }
}
