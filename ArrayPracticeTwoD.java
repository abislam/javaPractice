//this comment is testing branch updates
//branch update: correct board placement based on user input
//branch update: add second user input
//check for win condition
/*
win condition algorithm:
loop from array[0,0]
	check 4 right
	check 4 left
	check 4 down
	check 4 down right
	check 4 down left

do this loop after every user input
*/
import java.util.Scanner;
import java.util.Arrays;

public class ArrayPracticeTwoD {

	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int user1, user2;


		String[][] arr = new String[6][7];


		//This code block prints the initial board
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = "*";
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		//--------------------------------------------

		//loop for getting user input and printing new board
		while(true){
			System.out.println("Input value for user1: ");
			user1 = scan.nextInt() - 1;

			for(int i = 5; i >= 0; i--){
				if(arr[i][user1] == "*"){
					arr[i][user1] = "X";
					break;
				}else{
					continue;
				}
			}
			System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));


			System.out.println("Input value for user2: ");
			user2 = scan.nextInt() - 1;

			for(int i = 5; i >= 0; i--){
				if(arr[i][user2] == "*"){
					arr[i][user2] = "O";
					break;
				}else{
					continue;
				}
			}			
			
			System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		}

	}
}