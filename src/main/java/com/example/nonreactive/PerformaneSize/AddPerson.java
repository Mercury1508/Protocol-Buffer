package com.example.nonreactive.PerformaneSize;
import com.example.proto.Person;
import com.google.protobuf.util.JsonFormat;

import java.io.*;

public class AddPerson {

    public void add() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 to add , 2 to exit");
		int x = Integer.parseInt(bf.readLine());
		if (x == 1) {
			Person.Builder p = Person.newBuilder();
			System.out.println("Enter Id: ");
			p.setId(Integer.parseInt(bf.readLine()));
			System.out.println("Enter name: ");
			p.setName(bf.readLine());
			System.out.println("Enter email (can leave blank): ");
			String y = bf.readLine();
			if (y.length() > 0)
				p.setEmail(y);
			while (true) {
				System.out.println("Enter phone number (can leave blank): ");
				String ph = bf.readLine();
				if (ph.length() > 0) {
					Person.PhoneNumber.Builder phoneNumber = Person.PhoneNumber.newBuilder().setNumber(ph);
					System.out.println("Is this a mobile, home, or work phone? ");
					String type = bf.readLine();
					if (type.equals("mobile")) {
						phoneNumber.setType(Person.PhoneType.MOBILE);
					} else if (type.equals("home")) {
						phoneNumber.setType(Person.PhoneType.HOME);
					} else if (type.equals("work")) {
						phoneNumber.setType(Person.PhoneType.WORK);
					} else {
						System.out.println("Unknown phone type.  Using default.");
					}
					p.addPhones(phoneNumber);
				} else
					break;
			}

			try (FileOutputStream output = new FileOutputStream("/Users/hriday/Downloads/nonreactive/src/main/java/com/example/nonreactive/PerformaneSize/Data",true)) {
					p.build().writeDelimitedTo(output);
			} catch (IOException e) {
				e.printStackTrace();
			}

			var j = JsonFormat.printer().print(p);
			try (PrintWriter out = new PrintWriter(new FileWriter("/Users/hriday/Downloads/nonreactive/src/main/java/com/example/nonreactive/PerformaneSize/test.jsonl",true))) {
					out.write(j);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
