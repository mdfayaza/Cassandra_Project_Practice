package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class UpdateData {

	public static void main(String args[]) {

		String query = "update emp set Area='Bangalore' where empNo=1;";

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();
		Session session = cluster.connect("practice");
		session.execute(query);
		System.out.println("updated datas");

	}
}
