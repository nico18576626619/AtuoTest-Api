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
			if(map.get("ִ��").equals("YES")){
				try{
					// ���ظ����ַ��������� Class ����
					Class cls = Class.forName(map.get("����"));
					// ������ Class ��������ʾ�����һ����ʵ��
					Object obj = cls.newInstance();
					// ���ط�����Ϊ��test12����һ�� Method ���󣬺�������Ǹ÷�������
					Method a = cls.getDeclaredMethod(map.get("������"), new Class[] { String.class });
					// ִ�и÷���
					a.invoke(obj, new Object[] { new String("�ǺǺǺ�1") });
					
				}catch(Exception e){
					System.out.println("============================5"+e);
				}				
			}
		}
		
	}
}
