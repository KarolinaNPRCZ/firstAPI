package com.example.DockerMongoExTcLombkWeb;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@EnableJpaAuditing
@Configuration
@EntityScan("com.example.DockerMongoExTcLombkWeb")
class UserRepositoryTestConfig {


}