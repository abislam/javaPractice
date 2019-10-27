//this comment is testing branch updates
//branch update: correct board placement based on user input
//branch update: add second user input
//check for win condition

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPracticeTwoD {

	public static String checkWin(String gameArr[][]){
		for(int i = 0; i < gameArr.length; i++){

			for(int j = 0; j < gameArr[i].length; j++){

				if(gameArr[i][j] == "X" && gameArr[i][j+1] == "X" && gameArr[i][j+2] == "X" && gameArr[i][j+3] == "X"){
					return "User1 wins";
				}else if(gameArr[i][j] == "X" && gameArr[i+1][j] == "X" && gameArr[i+2][j] == "X" && gameArr[i+3][j] == "X"){
					return "User1 wins";
				}else if(gameArr[i][j] == "O" && gameArr[i][j+1] == "O" && gameArr[i][j+2] == "O" && gameArr[i][j+3] == "O"){
					return "User2 wins";
				}else if(gameArr[i][j] == "O" && gameArr[i+1][j] == "O" && gameArr[i+2][j] == "O" && gameArr[i+3][j] == "O"){
					return "User2 wins";
				}else{
					continue;
				}

			}
		}
		return "checked for win";
	}

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
			checkWin(arr);

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
			checkWin(arr);
		}

	}



	//methods over here
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

	
}