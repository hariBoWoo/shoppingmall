package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class PropertyTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("calc.properties");
		
		prop.load(fis);
		
		Iterator iter = prop.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = (String)iter.next();
			String value = prop.getProperty(key);
			System.out.println(key + "=" + value);
		}
		
		int su1 = Integer.parseInt(prop.getProperty("su1"));
		int su2 = Integer.parseInt(prop.getProperty("su2"));
		
		System.out.println("su1+su2 "+(su1+su2));
		System.out.println("su1-su2 "+(su1-su2));
		System.out.println("su1*su2 "+(su1*su2));
		System.out.println("su1/su2 "+(su1/su2));
	}

}
