package com;
import java.util.*;
import java.util.stream.Collectors;
public class FetchRecords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Funtionality  fn=new  Funtionality ();
		 List<Records> fr = new ArrayList<>();
		 System.out.println("Enter list elements");
		/* for(int i=0;i<2;i++) {
			 String n=sc.next();
				int id=sc.nextInt();
				sc.next();
				String d1=sc.nextLine();
				sc.next();
				String d2=sc.nextLine();
				r.add(new Records(n,id,Arrays.asList(d1,d2)));
		 }*/
		 List<Records> r = Arrays.asList(new Records("Suraj",234,Arrays.asList("Maleria","Fever")),
				 						new Records("Rujan",534,Arrays.asList("Dengue","Fever")),
				 						new Records("Sreejita",34,Arrays.asList("Maleria","Scoliosis")),
				 						new Records("Sanhita",98,Arrays.asList("Maleria","Phnemoinia")));		
		 System.out.println(r);
		while(true){
		System.out.println("1.Add Records\n2.Display\n3.Filter by PatientId\n4.Name of patients whose name starts with a particular Alphabet\n5.Find Patient.\n6.Ater\n7.List of diseases\n8.exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:System.out.println("Add Records");
					String n=sc.next();
					int id=sc.nextInt();
					List<String> d=Arrays.asList("Maleria","Dengue");
					Records r1 = new Records(n,id,d);
					fr=fn.adds(r,r1);
					System.out.print(fr);
					System.out.println("Added successfully");
					break;
			case 2:System.out.print("The patient records");
			       	fr=fn.disp(r);
			       	System.out.println(fr);
			       	break;
			case 3:System.out.println("Filter patient records");
					int i=sc.nextInt();
					fr=fn.fil(r,i);
					System.out.println(fr);
			       	break;
			case 4:System.out.println("Display Names");
					List<String> f=fn.name(r);
					System.out.println(f);
			       	break;
			case 5:System.out.println("Find patient record");
					int j=sc.nextInt();
					fr=fn.find(r,j);
					System.out.println(fr);
					break;
			case 6:System.out.println("Alter record");
					int k=sc.nextInt();
					sc.next();
					String na=sc.next();
					fr=fn.alter(r,k,na);
					System.out.println(fr);
					break;
			case 7:System.out.println("Display Diseases");
					List<String> f1=fn.di(r);
					System.out.println(f1);
					break;
			

			default:System.out.println("Wrong Choice");
					break;
		}	
		System.out.println("Go Again? y/n");
		String con=sc.next();
		if(!con.equals("y"))
			break;
		}
		// TODO Auto-generated method stub

	}
		

}
