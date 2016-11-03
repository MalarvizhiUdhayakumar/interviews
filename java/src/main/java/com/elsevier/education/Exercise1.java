package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	private static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		private Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) {
			this.firstName = newFirstName;
			this.lastName=newLastName;
			this.phoneNumbers = newPhoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
				
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}
