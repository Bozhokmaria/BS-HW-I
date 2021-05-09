package com.binary_studio.academy_coin;

import java.util.stream.Stream;

public final class AcademyCoin {

	private AcademyCoin() {
	}

	public static int maxProfit(Stream<Integer> prices) {
		int [] allPrices = prices.mapToInt(x -> x).toArray();

		int maxProfit = 0;
		int minPrice = allPrices[0];

		for (int i = 1; i < allPrices.length; i++)
		{

			if (allPrices[i - 1] > allPrices[i]) {
				minPrice = allPrices[i];
			}

			if (allPrices[i - 1] < allPrices[i] && (i + 1 == allPrices.length || allPrices[i] > allPrices[i + 1])){
				maxProfit += (allPrices[i] - minPrice);
			}
		}
		return maxProfit;
	}

}
