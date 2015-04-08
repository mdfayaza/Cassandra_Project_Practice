package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class SelectQuery {
	public static void main(String args[]) {

		String query = "select * from emp;";

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();
		Session session = cluster.connect("practice");
		ResultSet output = session.execute(query);
		System.out.println(output.all());
		System.out.println("Displayed all results");

	}
}
