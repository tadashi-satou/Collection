package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter5 {
	public static void main(String[] args) {

		ArrayList<Task> tasklists = new ArrayList<>();
		tasklists.add(new Task(LocalDate.parse("2021-10-21"), "牛乳を買う"));
		tasklists.add(new Task(LocalDate.parse("2021-08-10"), "散髪に行く"));
		tasklists.add(new Task(LocalDate.parse("2021-11-09"), "スクールの課題を解く"));
		tasklists.add(new Task(LocalDate.parse("2021-09-15"), "○○社面接"));
		tasklists.add(new Task(LocalDate.parse("2021-12-04"), "手帳を買う"));

		//ソートする
		Collections.sort(tasklists);

		//拡張forで表示する
		for (Task task : tasklists) {
			System.out.println(task.getDate() + ":" + task.getTask());
		}
	}

}
