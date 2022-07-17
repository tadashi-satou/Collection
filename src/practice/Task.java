package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

	private LocalDate date;
	private String task;

	Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}

	@Override
	public String toString() {
		return "date=" + date + ", task=" + task;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	@Override
	public int compareTo(Task o) {
		return this.date.compareTo(o.getDate());
	}
}
