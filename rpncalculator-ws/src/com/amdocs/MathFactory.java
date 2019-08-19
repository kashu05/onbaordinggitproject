package com.amdocs;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class MathFactory {
	
private static HashMap<String, String> classNameMap;
	
	static
	{
		classNameMap = new HashMap<String, String>();
		
		
		classNameMap.put("+", "com.amdocs.Addition");
		classNameMap.put("-", "com.amdocs.Subtraction");
		classNameMap.put("*", "com.amdocs.Multiplication");
		classNameMap.put("/", "com.amdocs.Division");
		
		/*FileInputStream file ;
		
		try
		{
		
		file= new FileInputStream("./config.properties");
		Properties properties = new Properties();
		properties.load(file);
		
		properties.forEach( (key, value) -> {
			
			classNameMap.put((String)key, (String)value);
		});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
	}
	
	public static IMathOperation getObject(String mathOperator)
	{
		IMathOperation mathOperation = null;
		
		String classname;
		classname=classNameMap.get(mathOperator);
		
		try
		{
		mathOperation= (IMathOperation) Class.forName(classname).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return mathOperation;
		
		
		
		
	}

}
