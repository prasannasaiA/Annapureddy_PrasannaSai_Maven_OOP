package com.epam;
import candies.*;
import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
    	int[] gweights=new int[4];
     //Create gift object1
    	NewYearGift g=new NewYearGift();
    	System.out.println("Gift Details");
    	System.out.println("\nGift1:\n");
    	ArrayList<ArrayList<Candies>> gift1=g.gift();
    //Create gift object 2
    	System.out.println("\nGift2:\n");
    	NewYearGift g1=new NewYearGift();
    	ArrayList<ArrayList<Candies>> gift2=g1.gift();
    //Create gift object 3
    	System.out.println("\nGift3:\n");
    	NewYearGift g2=new NewYearGift();
    	ArrayList<ArrayList<Candies>> gift3=g2.gift();
    //Create gift object 4
    	System.out.println("\nGift4:\n");
    	NewYearGift g3=new NewYearGift();
    	ArrayList<ArrayList<Candies>> gift4=g3.gift();    	
    	
    	System.out.println("\nThe sorted order of Gifts according to weights are:\n");
    	gweights[0]=(gift1.get(0).get(0)).getWeight();
    	gweights[1]=(gift2.get(0).get(0)).getWeight();
    	gweights[2]=(gift3.get(0).get(0)).getWeight();
    	gweights[3]=(gift4.get(0).get(0)).getWeight();
    	
    	ArrayList<Integer> copyweights=new ArrayList<Integer>(4);
    	for(int i: gweights) {
    		copyweights.add(i);
    	}
    //Sorting and printing gifts according to their weights.
    	String[] gifts= {"Gift1","Gift2","Gift3","Gift4"};
    	Arrays.sort(gweights);
    	int ele,ind;
    	for(int i=0;i<4;i++) {
    		ele=gweights[i];
    		ind=copyweights.indexOf(ele);
    		copyweights.set(ind,0);
    		System.out.println(gifts[ind]+" : "+gweights[i]);
    	}
    }
}
