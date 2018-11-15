
public class Event {
	String name;
	Person[] members;
	public Event(String nameOfEvent) {
		this.name = nameOfEvent;
		this.members = new Person[3000];
	}
	public void addMember(Person person) {
		Utility.addOrRemovePersonToArray(this.members, person, true);
	}
	public void removeMember(Person person) {
		Utility.addOrRemovePersonToArray(this.members, person, false);
	}
}