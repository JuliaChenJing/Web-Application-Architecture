package lab2;

public class Person {
	int key;
	String firstName;
	String lastName;

	public Person(int key, String firstName, String lastName) {
		this.key =key;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
