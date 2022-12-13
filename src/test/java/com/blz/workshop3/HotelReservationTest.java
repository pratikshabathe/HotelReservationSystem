package com.blz.workshop3;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void testMessageForHotel(){

	HotelReservation hotel = new HotelReservation("Lackwood", "160");
	String ht = HotelReservation.hotelReservation();
	Assert.assertEquals("Rate", ht);
	}

	}
