package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.*;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Motorcycle;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Person;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Plane;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Student;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Teacher;
import es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain.Vehicle;

public class Main {

	private static List<Person> people = new ArrayList<>();
	private static List<Vehicle> vehicles = new ArrayList<>();
	private static Session session;
	private static Transaction transaction;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcio;

		do {
			System.out.println("\n===== MENÚ PRINCIPAL =====");
			System.out.println("1) Fase 1: Crear dades de prova");
			System.out.println("2) Fase 2: Treure vehicles de persones");
			System.out.println("3) Fase 3: Actualitzar un vehicle");
			System.out.println("0) Sortir");
			System.out.print("Escull una opció: ");

			opcio = sc.nextInt();
			sc.nextLine();

			switch (opcio) {
				case 1:
					fase1();
					break;
				case 2:
					fase2();
					break;
				case 3:
					fase3();
					break;
				case 0:
					System.out.println("Fins aviat!");
					break;
				default:
					System.out.println("Opció incorrecta.");
			}

		} while (opcio != 0);

		sc.close();
		HibernateSession.getSessionFactory().close();
	}
	
	private static void fase1() {
		try {
			session = HibernateSession.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			// Crear personas
			Student s1 = new Student("Anna", "Lopez", 111111111, "STU001");
			Student s2 = new Student("Jordi", "Martinez", 222222222, "STU002");
			Student s3 = new Student("Clara", "Sanchez", 333333333, "STU003");
			
			// Crear Profes
			Teacher t1 = new Teacher("Joan", "Perez", 444444444, "TEA001");
			Teacher t2 = new Teacher("Maria", "Gomez", 555555555, "TEA002");
			Teacher t3 = new Teacher("Pere", "Ruiz", 666666666, "TEA003");
			
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			session.persist(t1);
			session.persist(t2);
			session.persist(t3);
			
			//Creamos vehiculos
			Car car1 = new Car("Toyota", 2020, 18000, 5, 5);
			Car car2 = new Car("Ford", 2019, 15000, 3, 4);
			
			Plane p1 = new Plane("Cessna", 2015, 120000, 11111, true);
			Plane p2 = new Plane("Boeing", 2010, 900000, 22222, false);
			
			Motorcycle m1 = new Motorcycle("Yamaha", 2021, 9000, false);
			Motorcycle m2 = new Motorcycle("Harley-Davidson", 2018, 20000, true);
			
			//Asociaos los vehiculos a las personas
			s1.addVehicle(car1);
			t2.addVehicle(car2);
			t1.addVehicle(p1);
			s3.addVehicle(p2);
			s2.addVehicle(m1);
			t3.addVehicle(m2);
			//Hacemos que persista enla base de datos
			session.persist(car1);
			session.persist(car2);
			session.persist(p1);
			session.persist(p2);
			session.persist(m1);
			session.persist(m2);
			//Realizamos el commit
			transaction.commit();
			System.out.println("Fase 1 completada");
			
		} catch (Exception ex) {
			if (transaction != null) transaction.rollback();
			ex.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
	}
		
	private static void fase2() {
		try {
			session = HibernateSession.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			//Cargamos la persona i el vehciulo con id = 1
			Person p = session.get(Person.class, 1);
			Vehicle v = session.get(Vehicle.class, 1);
			
			//Si ambos existen elimiaremos el vehiculo de la persona
			if (p != null && v != null) {
				p.removeVehicle(v);
			}
			//Guardamos los cambios con el commit
			transaction.commit();
			System.out.println("Fase 2 completada");
			
		} catch (Exception e) {
			if (transaction != null) transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
	}
	
	private static void fase3() {
		try {
			session = HibernateSession.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			//Cargamos el vehciulo con id = 1
			Vehicle v = session.get(Vehicle.class, 1);
			
			// Y si existe actualizamos sus datos a unos nuevos
			if (v != null) {
				v.setBrand("Seat");
				v.setYear(2022);
				v.setPrice(19999);
			}
			
			//Hacemos un commit para guardar los datos en la bd
			transaction.commit();
			System.out.println("Fase 3 completada");

		} catch (Exception e) {
			if (transaction != null) transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
	}
}
