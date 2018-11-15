
// Classes and constructors

public class Example7Classes {
	public static void main(String[] args) {
		Person person1 = new Person("Donald Duck");
		Person person2 = new Person("Mickey Mouse");
		Person person3 = new Person("Pluto");
		
		person1.addFriend(person2);
		person1.addFriend(person3);
		
		Event cs110Expo = new Event("CS110 Expo 2018");
		cs110Expo.addMember(person1);
		cs110Expo.addMember(person3);
		
		Post post = new Post("The CS110 expo is going to be soooo awesome, so excited xo xo xo", person2);
		
	}
}