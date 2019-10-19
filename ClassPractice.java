public class ClassPractice{

	public static void main(String[] args){
		User user = new User(); //constructor
		user.firstName = "Sub";
		user.lastName = "Human";



		System.out.println(user.firstName + " " + user.lastName);

		user.output();
	}
}

//if you have this class in another file, it can be public.
//there can only be one public class per file.
class User{
	//creating fields
	public String firstName;
	public String lastName;

	//method
	public void output(){
		System.out.println("This was printed using a method: " + firstName + " " + lastName);
	}
}