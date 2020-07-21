package com.employee_leave_mgmt.operations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class RemainingLeaveDaysOperationsImpl implements RemainingLeaveDaysOperations {

	@Override
	public long calculateLeaveDays(String startDate,String endDate) {
		LocalDate startingDate = LocalDate.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate endingDate = LocalDate.parse(endDate, DateTimeFormatter.ISO_LOCAL_DATE);
		Duration difference = Duration.between(startingDate.atStartOfDay(), endingDate.atStartOfDay());
		long daysOfLeave = difference.toDays();
		return daysOfLeave ;
	}

}
