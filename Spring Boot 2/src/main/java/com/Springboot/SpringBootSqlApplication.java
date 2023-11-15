package com.Springboot;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import Repository.UserRepository;

@SpringBootApplication(scanBasePackages={
		"com.Springboot"})
public class SpringBootSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSqlApplication.class, args);
	}

}
