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

	public class ComputeScoreTest {

	    private int expected;
	    private int finalScore;
	    private List<Integer> playScores;


	    @Test
	    public void compute1() throws Exception {
	        expected = 4;
	        finalScore = 12;
	        playScores = Arrays.asList(2,3,7);

	        test(expected,finalScore, playScores);
	    }

	    @Test
	    public void compute2() throws Exception {
	        expected = 3;          //this test case will fail expected value =3
	        finalScore = 9;
	        playScores = Arrays.asList(2,3,7);

	        test(expected,finalScore, playScores);
	    }

	    private void test(int expected, int finalScore, List<Integer> playScores) {
	        assertEquals(expected, ScoreCombination.numCombinationsForFinalScore(finalScore, playScores));
	    }

	}