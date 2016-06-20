package main.java.org.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Run{
	public static void runCase(ArrayList<Map<String,String>> list) throws ClassNotFoundException{
		Iterator<Map<String, String>> it=list.iterator();
		while(it.hasNext()){
			Map<String, String> map=it.next();
			if(map.get("执行").equals("YES")){
				try{
					// 返回给定字符串名的类 Class 对象
					Class cls = Class.forName(map.get("包名"));
					// 创建此 Class 对象所表示的类的一个新实例
					Object obj = cls.newInstance();
					// 返回方法名为“test12”的一个 Method 对象，后面跟的是该方法参数
					Method a = cls.getDeclaredMethod(map.get("用例名"), new Class[] { String.class });
					// 执行该方法
					a.invoke(obj, new Object[] { new String("呵呵呵呵1") });
					
				}catch(Exception e){
					System.out.println("============================5"+e);
				}				
			}
		}
		
	}
}
