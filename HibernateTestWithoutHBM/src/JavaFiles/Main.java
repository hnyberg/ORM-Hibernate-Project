package JavaFiles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		SessionFactory sFactory = conf.buildSessionFactory();
		Session session = sFactory.openSession();
		session.beginTransaction();
		
		ClassMate hannes = new ClassMate();
		hannes.setId(1);
		hannes.setFirstName("Hannes");
		hannes.setLastName("Nyberg");
		hannes.setBirthYear(1986);
		hannes.setHobby("Netflixing");
		hannes.setMobile("+46735666740");
		
		session.save(hannes);
		session.getTransaction().commit();
		session.close();
		sFactory.close();
	}
}