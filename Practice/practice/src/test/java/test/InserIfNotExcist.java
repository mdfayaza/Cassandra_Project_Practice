package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class InserIfNotExcist {
	public static void main(String args[]) {

		String query = "insert into emp(empNo,Name,Area,Salary) values(4,'Manoj','Chennai',20000) if not exists;";

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();
		Session session = cluster.connect("practice");
		session.execute(query);
		System.out.println("Datas Inserted Successfully");

	}
}
