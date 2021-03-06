package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	private final static int QUALITY = 50;
	private final static int SELLIN = 30;
	
	@Test
	public void decreaseQualityAndSellInEveryDayTest()
	{
		Item item = new Item("Aged Brie", SELLIN, QUALITY);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), QUALITY-1);
		assertEquals(item.getSellIn(), SELLIN-1);
	}
	
	@Test
	public void ifSellInIsNegativeDecreaseQualityOfTwoAndSellInOfOne(){
		Item item = new Item("Aged Brie", -1, QUALITY);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), QUALITY-2);
		assertEquals(item.getSellIn(), -2);
	}
	
	@Test
	public void qualityMustBePositiveOrEqualsToZero(){
		Item item = new Item("Aged Brie", SELLIN, 0);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), 0);
	}
	@Test
	public void increaseQualityOfOneIfTheNameOfTheItemEqualsAgedBrie(){
		Item item = new Item("Aged Brie", SELLIN, 25);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), 25 +1 < 50);
		
	}
}