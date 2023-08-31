package jb.ssh.ch3_e7;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jb.ssh.ch3_e7.config.ProjectConfig;
import jb.ssh.ch3_e7.domain.Person;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var person = (Person) ctx.getBean(Person.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println(person);
	}

}
