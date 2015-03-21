package com.kata;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class StockTest {

	Stocks stocks = new Stocks();
	
	@Test
	public void test() {
		
	HashMap<Integer	 , Float> stocksHashMap= new HashMap<Integer, Float>();
	
	stocksHashMap.put( 60	,  (float) 500.0);
	stocksHashMap.put( 90	,  (float) 300.0);
	
	stocksHashMap.put( 100	,  (float) 600.0);
	
	stocksHashMap.put( 110	,  (float) 599.0);
	
	stocksHashMap.put( 120	,  (float) 580.0);
	
	stocksHashMap.put( 150	,  (float) 400.0);
	
	stocksHashMap.put( 180	,  (float) 200.0);
	
	stocksHashMap.put( 300	,  (float) 420.0);
	
	
	assertEquals(true, (stocks.getBestProfit(stocksHashMap)== 300.0));
	
	
	}
	
	@Test
	public void test2() {
		
	HashMap<Integer	 , Float> stocksHashMap= new HashMap<Integer, Float>();
	
	stocksHashMap.put( 60	,  (float) 100.0);
	
	stocksHashMap.put( 90	,  (float) 90.0);
	
	stocksHashMap.put( 100	,  (float) 120.0);
	
	stocksHashMap.put( 110	,  (float) 32.0);
	
	stocksHashMap.put( 120	,  (float) 30.0);
	
	stocksHashMap.put( 150	,  (float) 101.0);
	
	stocksHashMap.put( 180	,  (float) 102.0);
	
	stocksHashMap.put( 300	,  (float) 20.0);
	
	
	assertEquals(true, (stocks.getBestProfit(stocksHashMap)== 72.0));
	
	
	}

}
