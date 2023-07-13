package com.example.nonreactive;

import com.example.nonreactive.PerformaneSize.AddPerson;
import com.example.nonreactive.PerformaneSize.GetPerson;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;


@SpringBootApplication
public class NonreactiveApplication {

	public static void main(String[] args) throws IOException {

		AddPerson addPerson = new AddPerson();
		addPerson.add();
		System.out.println("Adresss added\n The added address : \n");
		GetPerson getPerson = new GetPerson();
		getPerson.get();
	}

}
