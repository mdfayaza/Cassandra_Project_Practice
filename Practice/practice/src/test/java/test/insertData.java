package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class insertData {

	public static void main(String args[]) {

		String query = "select * from emp where empNo in (1,3)";
 
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();
		Session session = cluster.connect("practice");
		ResultSet result = session.execute(query);
		System.out.println(result.all());

	}
}
