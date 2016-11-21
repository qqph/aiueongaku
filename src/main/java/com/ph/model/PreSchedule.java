package com.ph.model;

import java.util.Date;

public class PreSchedule {
	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		PreSchedule.title = title;
	}

	public static Date getStartDate() {
		return startDate;
	}

	public static void setStartDate(Date startDate) {
		PreSchedule.startDate = startDate;
	}

	public static Date getEndDate() {
		return endDate;
	}

	public static void setEndDate(Date endDate) {
		PreSchedule.endDate = endDate;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		PreSchedule.description = description;
	}

	private static String title;
	private static Date startDate;
	private static Date endDate;
	private static String description;

}
