package com.jocata.Mapping_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	org.hibernate.service.ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(registry);
    	Session s1 = sf.openSession();
    	

    	Laptop lap = new Laptop();
    	lap.setLaptop_id(51231);
    	lap.setLaptop_name("Asus");
    	
    	Student s = new Student();
    	s.setRollno(101);
    	s.setName("Rahul");
    	s.setMarks(50);
    	s.setLapobj(lap);
    	
    	Laptop lap1 = new Laptop();
    	lap1.setLaptop_id(51232);
    	lap1.setLaptop_name("Dell");
    	
    	Student stu = new Student();
    	stu.setRollno(102);
    	stu.setName("Ankit");
    	stu.setMarks(50);
    	stu.setLapobj(lap);
    	
    	s1.beginTransaction();
    	
    	s1.save(lap);
    	s1.save(s);

    	s1.save(lap1);
    	s1.save(stu);
    	
    	s1.getTransaction().commit();
    	
    	
    }
}
