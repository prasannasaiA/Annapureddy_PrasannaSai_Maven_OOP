package com.epam;
import java.util.ArrayList;
import java.util.Random;

import candies.*;
import candies.chocolates.*;
import candies.sweets.*;

public class NewYearGift{
	
	public ArrayList<ArrayList<Candies>> candy=new ArrayList<ArrayList<Candies>>();
	
	public ArrayList<ArrayList<Candies>> gift() {
		prepareGift();
		return candy;
	}
	
	public void prepareGift() {
		 ArrayList<Candies> chocolate= addChocolates();
		 ArrayList<Candies> sweets=addSweets();
		 candy.add(chocolate);
		 candy.add(sweets);
	}
	
	public  ArrayList<Candies> addChocolates() {
		ArrayList<Candies> cand1=new ArrayList<Candies>();
		Random rand=new Random();
		int c,q,i=2;
		while(i!=0) {
			c=rand.nextInt(3);
			q=rand.nextInt(5)+1;
			switch(c){
			case 0:
				Snickers ch=new Snickers();
				Chocolate choc=new Chocolate(ch.getName(),ch.getCost(),ch.getWeight(),q);
				System.out.println(choc);
				cand1.add(choc);
				break;
			case 1:
				Kitkat ch1=new Kitkat();
				Chocolate choc1=new Chocolate(ch1.getName(),ch1.getCost(),ch1.getWeight(),q);
				cand1.add(choc1);
				System.out.println(choc1);
				break;
			case 2:
				Cadbury ch11=new Cadbury();
				Chocolate choc11=new Chocolate(ch11.getName(),ch11.getCost(),ch11.getWeight(),q);
				cand1.add(choc11);
				System.out.println(choc11);
				break;
			}
			i-=1;
		}
		return cand1;
	}
	
	public ArrayList<Candies> addSweets() {
		ArrayList<Candies> cand2=new ArrayList<Candies>();
		Random rand=new Random();
		int s,q,i=2;
		while(i!=0) {
			s=rand.nextInt(3);
			q=rand.nextInt(5)+1;
			switch(s){
			case 0:
				Baklava ch=new Baklava();
				Sweets choc=new Sweets(ch.getName(),ch.getCost(),ch.getWeight(),q);
				cand2.add(choc);
				System.out.println(choc);
				break;
			case 1:
				Cannoli ch1=new Cannoli();
				Sweets choc1=new Sweets(ch1.getName(),ch1.getCost(),ch1.getWeight(),q);
				cand2.add(choc1);
				System.out.println(choc1);
				break;
			case 2:
				Doughnut ch11=new Doughnut();
				Sweets choc11=new Sweets(ch11.getName(),ch11.getCost(),ch11.getWeight(),q);
				cand2.add(choc11);
				System.out.println(choc11);
				break;
			}
			i-=1;
		}
		return cand2;
	}
	
}
