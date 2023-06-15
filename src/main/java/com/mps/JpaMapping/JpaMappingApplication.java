package com.mps.JpaMapping;

import com.mps.JpaMapping.entity.*;
import com.mps.JpaMapping.repository.AadharRepository;
import com.mps.JpaMapping.repository.LaptopRepository;
import com.mps.JpaMapping.repository.PersonRepository;
import com.mps.JpaMapping.repository.SkillRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class JpaMappingApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaMappingApplication.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		AadharRepository aadharRepository = context.getBean(AadharRepository.class);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
		SkillRepository skillRepository = context.getBean(SkillRepository.class);

//		PersonName name = new PersonName();
//		name.setFirstName("Mr");
//		name.setMiddleName("Suresh");
//		name.setLastName("Singh");
//
//		Person p1 = new Person();
//		p1.setPersonName(name);
//		p1.setPersonAge(32);
//		p1.setPersonMobileNo("8765599665");
//		personRepository.save(p1);// this is imp, since we are saving person as fk in aadhar table so it needs to be saved before setting fk.
//
//		Aadhar a1 = new Aadhar();
//		a1.setAadharNo("4534-4587-0987");
//		a1.setPerson(p1); // This is imp, since aadhar table has fk so it needs to save int table.
//		p1.setAadhar(a1);// This is optional
//		aadharRepository.save(a1);


//		Optional<Aadhar> optionalAadhar = aadharRepository.findById(1);
//		Aadhar aadhar = optionalAadhar.get();
//		System.out.println(aadhar.getPerson().getPersonName().getMiddleName());
//
//		Optional<Person> optionalPerson = personRepository.findById(1);
//		Person person = optionalPerson.get();
//		System.out.println(person.getAadhar().getAadharNo());

//		Laptop l1 = new Laptop();
//		l1.setLaptopBrand("Dell");
//		l1.setLaptopCpu("i7");
//		l1.setLaptopRam("8GB");
//		l1.setPerson(personRepository.findById(2).get());
//
//		Laptop l2 = new Laptop();
//		l2.setLaptopBrand("HP");
//		l2.setLaptopCpu("i9");
//		l2.setLaptopRam("8GB");
//		l2.setPerson(personRepository.findById(2).get());
//
//		Laptop l3 = new Laptop();
//		l3.setLaptopBrand("Macbook");
//		l3.setLaptopCpu("M1");
//		l3.setLaptopRam("8GB");
//		l3.setPerson(personRepository.findById(1).get());
//
//		laptopRepository.saveAll(Arrays.asList(l1,l2,l3));

//		Laptop laptop = laptopRepository.findById(2).get();
//		System.out.println(laptop.getLaptopBrand() +" : "+laptop.getPerson().getPersonName().getMiddleName());

//		Person person = personRepository.findById(2).get();
//		person.getLaptops().forEach((laptop1 -> System.out.println(laptop1.getLaptopBrand())));


//		Skill s1 = new Skill();
//		s1.setSkill("Java Developer");
//		s1.setPersons(Arrays.asList(personRepository.findById(1).get(),personRepository.findById(3).get()));
//
//		Skill s2 = new Skill();
//		s2.setSkill("Cricketer");
//		s2.setPersons(Arrays.asList(personRepository.findById(2).get(),personRepository.findById(3).get()));
//
//		skillRepository.save(s1);
//		skillRepository.save(s2);

		skillRepository.findById(1).get().getPersons().stream().forEach(person -> System.out.println(person.getPersonName().getMiddleName()));
		personRepository.findById(3).get().getSkills().forEach(skill -> System.out.println(skill.getSkill()));

	}

}
