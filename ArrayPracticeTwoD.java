import java.util.Scanner;
import java.util.Arrays;

public class ArrayPracticeTwoD {

	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int user1, user2;


		String[][] arr = new String[6][7];



		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = "*";
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		while(true){
			System.out.println("Input value for user1: ");
			user1 = scan.nextInt();
			while(true){


				for(int i = 5; i > 0; i--){
					if(arr[i][user1] == "*"){
						arr[i][user1] = "X";
						break;
					}else{
						continue;
					}
				}
				/*
				if(arr[5][user1] == "*"){
					arr[5][user1] = "X";
				}else if(arr[4][user1] == "*"){
					arr[4][user1] = "X";
				}else if(arr[3][user1] == "*"){
					arr[3][user1] = "X";
				}else if(arr[2][user1] == "*"){
					arr[2][user1] = "X";
				}else if(arr[1][user1] == "*"){
					arr[1][user1] = "X";
				}else if(arr[0][user1] == "*"){
					arr[0][user1] = "X";
				}else{
					break;
				}*/
				break;
			}
			
			System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		}

		

		/*
		System.out.println("Input value for user1: ");
		user1 = scan.nextInt();

		
		//****************************************************
		for(int i = 0; i < arr.length; i++){
			while(arr[][user1] == "*"){

			}
		}
		*/

		
		/*
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = "*";
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		*/
		//****************************************************



		/*
		for(int i = 0; i < arr.length; i++){
			if(arr[i][user1] == "*"){
				continue;
			}else{
				arr[i][user1-1] = "x";
			}
		}
		*/

	}
}