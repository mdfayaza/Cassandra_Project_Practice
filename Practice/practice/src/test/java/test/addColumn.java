package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class addColumn {

	public static void main(String args[]) {

		System.out.println("test");
		String query = "alter table emp drop email;";

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();

		Session session = cluster.connect("practice");

		session.execute(query);

		session.execute("use practice");
		System.out.println("Column droped");
	}

}
