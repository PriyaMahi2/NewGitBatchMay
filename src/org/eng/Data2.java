package org.eng;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Data2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.setName("priya");
		d.setAge(32);
		
		Data d1=new Data();
		d1.setName("mahi");
		d1.setAge(40);
		
		Data d2 = new Data();
		d2.setName("linu");
		d2.setAge(11);
		
		List<Data> l = new LinkedList<Data>();
		l.add(d);
		l.add(d1);
		l.add(d2);
		Set<Data> s = new LinkedHashSet<Data>();
		s.add(d);
		s.add(d1);
		s.add(d2);
		Map<Integer,Data> m = new LinkedHashMap<>();
		m.put(1,d);
		m.put(2,d1);
		m.put(3,d2);
		Set<Entry<Integer, Data>> entrySet = m.entrySet();
		for (Entry<Integer, Data> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getAge());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getPhno());
			
		}
		
		for (Data data : s) {
			
			System.out.println("Employee age: "+data.getAge());
			System.out.println("Employee name: "+data.getName());
			System.out.println("Employee phoneno: "+data.getPhno());
		}
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Employee no:"+(i+1));
			System.out.println("name:"+l.get(i).getName());
			System.out.println("Age:"+l.get(i).getAge());
			System.out.println("Phno:"+l.get(i).getPhno());}
		
	   System.out.println("Modified the encaptulation");
	
	}}
				
			
			
			
		
		
		

