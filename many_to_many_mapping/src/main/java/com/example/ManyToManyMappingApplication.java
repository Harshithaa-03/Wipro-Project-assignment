package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyMappingApplication implements CommandLineRunner{

	@Autowired
	private PostingRepository postingRepository;
	
	@Autowired
	private TagRepository tagRepository;
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyMappingApplication.class, args);
	}

	@Override
	public void run(String...args)throws Exception{
		
		Posting post=new Posting("many to many","many to many","many to many");
		Tag springBoot=new Tag("Spring Boot");
		Tag hibernate=new Tag("Hibernate");
		
		post.getTags().add(springBoot);
		post.getTags().add(hibernate);
		
		springBoot.getPosting().add(post);
		hibernate.getPosting().add(post);
		
		this.postingRepository.save(post);
		
	
		
	}
}
