package com;
import java.util.stream.*;
import java.util.*;
public class Funtionality {
	static List<Records> adds(List<Records> r,Records rr) {
		//Records rr=new Records(n,id,s);
		r.add(rr);
		return r;
	}
	static List<Records> disp(List<Records> r){
		return r;
	}
	static List<Records> fil(List<Records> r,int i){
		List<Records> r1=r
				.stream()
				.filter(s -> s.getPatientId() > i)
				.collect(Collectors.toList());
		return r1;

	}
	static List<String> name(List<Records> r){
		List<String> pName = r
				.stream()
				.map(Records :: getName)
				.filter(s -> s.startsWith("S"))
				.collect(Collectors.toList());
		 return pName;
	}
 static List<Records> find(List<Records> r,int i){
	 List<Records> r1 = r
			 			.stream()
			 			.filter(s -> s.getPatientId() == i)
						.collect(Collectors.toList());
	return r1;	
	
 }
 static List<Records> alter(List<Records> r,int i,String n){
	 for( Records to : r) {
			if(to.getPatientId()== i) {
				to.setName(n);
				//System.out.print(to.getName()+to.getPatientId()+to.getDiseases());
			}
	 }
	 return r;
 }	 
	 
 static List<String> di(List<Records> r){
	 List<String> d = r
				.stream()
				.map(Records :: getDiseases)
				.flatMap(List :: stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
return d;				
		
 		}
			}
	

