package com.algs4.fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInfo;
//	import org.junit.Test;

	import java.util.Arrays;
	import java.util.List;

	import static org.junit.Assert.*;
	
public class KnapsackTest {

	 private int expected;
	  //  private List<Tuple> items;
	 int val[] = new int[]{60, 100, 120};
	    int wt[] = new int[]{10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    
	    @Test
	    public void compute1() throws Exception {
	        expected = 220 ;       //220
	        
	        test(expected, W, wt, val, n);
	    }

	    private void test(int expected, int W,int wt[],int val[],int n) {
	        assertEquals(expected, Knapsack.Knapsack(W, wt, val, n));
	    }

	}