package jb.ssh.ch3_e7.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Parrot {
	private String name = "루키";
	private Person owner;

	@Autowired
	public Parrot(Person owner) {
		this.owner = owner;
	}

}
