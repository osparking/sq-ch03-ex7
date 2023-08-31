package jb.ssh.ch3_e7.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Person {
	private String name = "영희";
	private Parrot parrot;

	@Autowired
	public Person(Parrot parrot) {
		this.parrot = parrot;
	}

}
