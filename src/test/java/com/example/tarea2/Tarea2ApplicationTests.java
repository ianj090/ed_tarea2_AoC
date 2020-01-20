package com.example.tarea2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tarea2ApplicationTests {

	@Test
	void calculateMassTest() {
		assertEquals(1, Day1_api.calculateMass(10));
		assertEquals(2, Day1_api.calculateMass(14));
		assertEquals(654, Day1_api.calculateMass(1969));
		assertEquals(33583, Day1_api.calculateMass(100756));
	}

}
