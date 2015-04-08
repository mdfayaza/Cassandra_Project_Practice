package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class createTable {
	public static void main(String args[]) {

		String createTable = "Create table emp(empNo int Primary Key,Name text,Area text,Salary varint);";
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();

		Session session = cluster.connect("practice");

		session.execute(createTable);
		System.out.println("Table Created");

	}
}
