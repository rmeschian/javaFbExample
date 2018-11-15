

public class Person {
	
	Person[] friends;
	String name;
	
	
	public Person(String name) {
		this.name = name;
		this.friends = new Person[5000];
	}
	
	public void addFriend(Person person) {
		Utility.addOrRemovePersonToArray(this.friends, person, true);
	}
	
	public void removeFriend(Person person) {
		Utility.addOrRemovePersonToArray(this.friends, person, false);
	}
	public int getNumFriends() {
		int numFriends = 0;
		for(int i = 0; i < this.friends.length; i++) {
			if(this.friends[i] != null) {
				numFriends++;
			}
		}
		return numFriends;
	}
	
	public String[] getFriendNames() {
		int numFriends = this.getNumFriends();
		int nameIndex = 0;
		String[] names = new String[numFriends];
		for(int i = 0; i < this.friends.length; i++) {
			if(this.friends[i] != null) {
				names[nameIndex] = this.friends[i].name;
				nameIndex++;
			}
		}
		return names;
	}
	
}