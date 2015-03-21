package com.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stocks {


	public double getBestProfit(HashMap<Integer, Float> stocksHashMap) {

		Set<Entry<Integer, Float>> entry = stocksHashMap.entrySet();

		Iterator<Entry<Integer, Float>> entryIterator = entry.iterator();

		Float profitEstimation = 0f;
		Float profitEstimationTemporal = 0f;
		List<Profit> profitPossible = new ArrayList<Stocks.Profit>();

		// O (n)
		sortProfitData(entryIterator, profitPossible);
		
		//O(n^2 + 2 ) => O(n^2)
		for (int i = 0; i < profitPossible.size(); i++) {

			for (int j = i; j < profitPossible.size(); j++) {

				profitEstimationTemporal = 0.f;

				if (profitPossible.get(i).prize < profitPossible.get(j).prize) {

					profitEstimationTemporal = profitPossible.get(j).prize
							- profitPossible.get(i).prize;

				}

				if (profitEstimationTemporal > profitEstimation) {

					profitEstimation = profitEstimationTemporal;
				}
			}

		}

		return profitEstimation;
	}

	// O(n) + O(n)
	private void sortProfitData(Iterator<Entry<Integer, Float>> entryIterator,
			List<Profit> profitPossible) {
		Map.Entry<Integer, Float> temporal;
		while (entryIterator.hasNext()) {

			temporal = (Entry<Integer, Float>) entryIterator.next();

			profitPossible.add(new Profit(temporal.getKey(), temporal
					.getValue()));

		}

		Collections.sort(profitPossible);
	}

	private class Profit implements Comparable<Profit> {

		private Integer time;
		private Float prize;

		public Profit(Integer time, Float prize) {
			super();
			this.time = time;
			this.prize = prize;
		}

		@Override
		public int compareTo(Profit o) {

			if (this.time == o.time) {

				return 0;
			}

			if (this.time > o.time) {

				return 1;
			}

			return -1;
		}

		@Override
		public String toString() {
			return "Profit [time=" + time + ", prize=" + prize + "]";
		}

	}

	
	
	
	
}
