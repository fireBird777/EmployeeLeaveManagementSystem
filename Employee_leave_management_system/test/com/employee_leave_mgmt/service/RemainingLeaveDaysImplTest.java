package com.employee_leave_mgmt.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemainingLeaveDaysImplTest {

	RemainingLeaveDaysService remainingLeaveDaysService;
	
	@BeforeEach
	void setUp() throws Exception {
		remainingLeaveDaysService = new RemainingLeaveDaysServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		remainingLeaveDaysService = null;
	}

	@Test
	void testGetRemainingLeaveDays() {
		System.out.println(remainingLeaveDaysService.getRemainingLeaveDays(1));
	}

	@Test
	void testSetRemainingLeaveDays() {
		fail("Not yet implemented");
	}

}
