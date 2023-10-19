package Assisment1;

public class Even {

	public static void main(String[] args) {
		int [] num_arr = {1,2,3,4,5,6,77,73,44};
        for (int i = 0; i <= num_arr.length; i++) {

            if (num_arr[i] % 2 == 0) {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            };}

	}

}
