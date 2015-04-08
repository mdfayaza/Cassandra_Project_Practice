package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class BatchInsert {
	public static void main(String args[]) {

		String query = "begin batch insert into emp(empNo,Name,Area,Salary) values(1,'Azar','Chennai',30000);"
				+ "insert into emp(empNo,Name,Area,Salary) values(2,'Ashik','Chittoor',40000);"
				+ "insert into emp(empNo,Name,Area,Salary) values(3,'Arif','Coimbature',50000);"
				+ "apply batch;";

		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.build();
		Session session = cluster.connect("practice");
		session.execute(query);
		System.out.println("Datas Inserted Successfully");

	}
}
