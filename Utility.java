

class Utility {
	public static void addOrRemovePersonToArray(Person[] array, Person person, boolean isAdd) {
		for(int i = 0; i < array.length; i++) {
			if(isAdd && array[i] == null) {
				array[i] = person;
				return;
			}
			if(!isAdd && array[i] == person) {
				array[i] = null;
				return;
			}
		}
	}
}