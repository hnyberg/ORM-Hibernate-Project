package JavaFiles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		ClassMate hannes = new ClassMate();
		hannes.setId(1);
		hannes.setFirstName("Hannes");
		hannes.setLastName("Nyberg");
		hannes.setBirthYear(1986);
		hannes.setHobby("Netflixing");
		hannes.setMobile("+46735666740");
		s.save(hannes);
		s.flush();
		tx.commit();
		s.close();
	}
}