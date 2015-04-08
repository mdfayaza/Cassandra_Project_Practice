package test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class test {
public static void main(String args[]) {
	
	System.out.println("test");
String query = "create keyspace practice with replication={'class' : 'SimpleStrategy','replication_factor': 1};";
	
	Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	
	Session session= cluster.connect();
			
		session.execute(query);
	
	session.execute("use practice");
	System.out.println("Keyspace Created");
}
}
