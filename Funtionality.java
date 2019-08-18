package com;
import java.util.stream.*;
import java.util.*;
public class Funtionality {
	Scanner sc=new Scanner(System.in);
	static List<Records> adds(List<Records> r,Records rr) {
		List<Records> fr=new ArrayList<>(r);
		fr.add(rr);
		//fr.add(new Records("Amrita",46,Arrays.asList("HypoThermia","Fever")));
		return fr;
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
				System.out.print(to.getName()+to.getPatientId()+to.getDiseases()+"\n");
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
 static List<Records> del(List<Records> r,int i){
	 List<Records> fr=new ArrayList<>(r);
	 fr.removeIf(t -> t.getPatientId()== i);
	 
	 return fr;
 }	 
	 

}
	

