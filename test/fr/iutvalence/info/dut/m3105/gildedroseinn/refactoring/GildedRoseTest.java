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
	
	

}