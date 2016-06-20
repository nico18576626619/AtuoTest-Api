package main.java.org.driver;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import main.java.org.core.GetData;
import main.java.org.core.HttpRequest;
import main.java.org.core.Run;

public class driver {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		GetData data=new GetData();
//		
//		Run.runCase(data.FromExcel());
		
        //∑¢ÀÕ POST «Î«Û
        String sr=HttpRequest.sendPost("http://114.215.198.127/", "appkey=MOBH37H66U9&dataformat=json&v=1.0&sign_method=1&method=login&data=%7B%22custName%22%3A%2218576626619%22%2C%22custPassword%22%3A%22123456%22%2C%22weixin_code%22%3A%22%22%7D&timestamp=2016-06-15+15%3A17%3A30&sign=26105D9637663DCDF098D8DAC01626F3");
        System.out.println(sr);
        
        
    }


}
