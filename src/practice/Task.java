package practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task {
	public void main() {
		Map<LocalDate, String> tasklist = new LinkedHashMap<>();

		tasklist.put(LocalDate.parse("2021-10-21"), "牛乳を買う");
		tasklist.put(LocalDate.parse("2021-08-10"), "散髪に行く");
		tasklist.put(LocalDate.parse("2021-11-09"), "スクールの課題を解く");
		tasklist.put(LocalDate.parse("2021-09-15"), "○○社面接");
		tasklist.put(LocalDate.parse("2021-12-04"), "手帳を買う");

		// キーでソートする
		Map<LocalDate, String> results = sortMapByKey(tasklist);

		// キーと値のペア
		for (Map.Entry<LocalDate, String> result : results.entrySet()) {
			System.out.println(result.getKey() + ":" + result.getValue());
		}
	}

	// キーでソートするメソッド
	private LinkedHashMap<LocalDate, String> sortMapByKey(Map<LocalDate, String> tasklist) {
	    List<Map.Entry<LocalDate, String>> entries = new LinkedList<>(tasklist.entrySet());
	    Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

	    LinkedHashMap<LocalDate, String> result = new LinkedHashMap<>();
	    for (Map.Entry<LocalDate, String> entry : entries) {
	        result.put(entry.getKey(), entry.getValue());
	    }
	    return result;
	}
}