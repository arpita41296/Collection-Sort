package io.naztech.Collection_sort;
import java.time.Month;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.print.attribute.standard.MediaSize.NA;

import java.time.LocalDate;
public class App 
{
    public static void main( String[] args )
    {
    	///list bwork 
    /*	ArrayList<Human> hlist = new ArrayList<Human>();
		 hlist.add(new Human(20,"nisha",2000,LocalDate.of(1998, Month.APRIL, 2)));
		 hlist.add(new Human(22,"mithila",3000,LocalDate.of(1996, Month.FEBRUARY, 22)));
		 hlist.add(new Human(21,"kona",1000,LocalDate.of(1997, Month.AUGUST, 21)));
		 hlist.add(new Human(24,"lipi",500,LocalDate.of(1994, Month.DECEMBER, 12)));
		 hlist.add(new Human(23,"mim",6000,LocalDate.of(1995, Month.JULY, 27)));
		 System.out.println("SORTED BY INCOME");
		// Collections.sort(hlist);
		
		 
		 Collections.sort(hlist, new Comparator<Human>() {

			public int compare(Human a, Human b) {
				// TODO Auto-generated method stub
				if(a.age==b.age)
		    		return 0;
		    	else if(a.age>b.age)
		    		return 1;
		    	else
		    		return -1;
			}
			 
		 
		 });
		 
		 for(Human st:hlist){    
			 System.out.println(st.toString());    
			 } 
		*/
    	
    	//map  work start
    	
    	 /*Map<Integer, Human> map = new HashMap<Integer,Human>();
		   
		   map.put(0,new Human(20,"nisha",2000,LocalDate.of(1998, Month.APRIL, 2)));
		   map.put(1,new Human(22,"mithila",3000,LocalDate.of(1996, Month.FEBRUARY, 22)));
		   map.put(2,new Human(21,"kona",1000,LocalDate.of(1997, Month.AUGUST, 21)));
		   map.put(3,new Human(24,"lipi",500,LocalDate.of(1994, Month.DECEMBER, 12)));
		   map.put(4,new Human(23,"mim",6000,LocalDate.of(1995, Month.JULY, 27)));
    	
		   List<Map.Entry<Integer, Human>> entryList = new ArrayList<Map.Entry<Integer, Human>>(map.entrySet());

           Collections.sort(
                   entryList, new Comparator<Map.Entry<Integer, Human>>() {

					public int compare(Entry<Integer, Human> h1, Entry<Integer, Human> h2) {
						 if(h1.getValue().getSalary()==h2.getValue().getSalary())
		            			return 0;
		            		else if(h1.getValue().getSalary()>h2.getValue().getSalary())
		            			return 1;
		            		else
		            			return -1;
					}
               
           }
       );
           System.out.println("SORTED BY Salary");
      
       for(Entry<Integer, Human> st:entryList){    
			 System.out.println(st.toString());    
			 } 
       Collections.sort(
               entryList, new Comparator<Map.Entry<Integer, Human>>() {

				public int compare(Entry<Integer, Human> h1, Entry<Integer, Human> h2) {
					if(h1.getValue().getAge()==h2.getValue().getAge())
	        			return 0;
	        		else if(h1.getValue().getAge()>h2.getValue().getAge())
	        			return 1;
	        		else
	        			return -1;
				}
            	   
               });

       System.out.println("SORTED BY Age");
       
       for(Entry<Integer, Human> st:entryList){    
			 System.out.println(st.toString());    
			 } */
		   
		  
    	
    }
}
