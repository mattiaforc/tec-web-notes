package it.unibo.tw;

import it.unibo.tw.db.PersistenceException;
import it.unibo.tw.db.StudentRepository;

public class Test {

	public static void main(String[] args) {
		StudentRepository st = new StudentRepository(0);
		try {
			st.findAll().stream()
				.map(t -> t.getFirstName()
						.concat(t.getLastName())
						.concat(t.getBirthDate().toString()))
				.forEach(System.out::println);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

}
