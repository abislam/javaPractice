import java.util.Scanner;
import java.util.Arrays;

public class ArrayPracticeTwoD {


	public static void main(String []args){
		boolean gameOn = true;
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
		while(gameOn){
			System.out.println("Input value for Player 1: ");
			user1 = scan.nextInt() - 1;
			int count = 0;
			int countSide = 0;
	
			for(int i = 5; i >= 0; i--){
				if(arr[i][user1] == "*"){
					arr[i][user1] = "X";


					//Vertical check---------------------------------------------------------
					for(int iTop = 0; iTop < arr.length; iTop++){
						if(arr[iTop][user1] == "X"){
							count++;
							//System.out.println(count);
						}else{
							count = 0;
						}

						if(count == 4){
							gameOn = false;
							System.out.println("Player 1 wins!!");
							System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));		
							System.exit(0);
						}
					}
					//Vertical check---------------------------------------------------------

					//Horizontal check---------------------------------------------------------
					for(int iSide = 0; iSide < 7; iSide++){
						if(arr[i][iSide] == "X"){
							countSide++;
							//System.out.println(count);
						}else{
							countSide = 0;
						}
						if(countSide == 4){
							gameOn = false;
							System.out.println("Player 1 wins!!");
							System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));		
							System.exit(0);
						}

					}
					//Horizontal check---------------------------------------------------------
					break;
				}else{
					continue;
				}
			}
			System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			

			

			System.out.println("Input value for Player 2: ");
			user2 = scan.nextInt() - 1;

			for(int i = 5; i >= 0; i--){
				if(arr[i][user2] == "*"){
					arr[i][user2] = "O";
					//Vertical check---------------------------------------------------------
					for(int iTop = 0; iTop < arr.length; iTop++){
						if(arr[iTop][user2] == "O"){
							count++;
						}else{
							count = 0;
						}

						if(count == 4){
							gameOn = false;
							System.out.println("Player 2 wins!!");
							System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));		
							System.exit(0);
						}
					}
					//Vertical check---------------------------------------------------------

					//Horizontal check---------------------------------------------------------
					for(int iSide = 0; iSide < 7; iSide++){
						if(arr[i][iSide] == "O"){
							countSide++;
						}else{
							countSide = 0;
						}
						if(countSide == 4){
							gameOn = false;
							System.out.println("Player 2 wins!!");
							System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));		
							System.exit(0);
						}

					}
					//Horizontal check---------------------------------------------------------
					break;
				}else{
					continue;
				}
			}			
			
			System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			
		}

	}	
}