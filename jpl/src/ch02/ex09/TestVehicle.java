package ch02.ex09;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void testGetMaxID(){
		//setup
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();

		//execute
		int actual = Vehicle.getMaxID();

		//test
		assertEquals(1,actual);
	}
}
