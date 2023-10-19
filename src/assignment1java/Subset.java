package assignment1java;

public class Subset {

	public static void main(String[] args) {
		int count = 0;
        int[] arr_1 = {1,2,3,4,77};
        int[] arr_2 = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_2.length; j++){
                if (arr_1[i] == arr_2[j])
                {
                    count++;
                }
            }

        }
        if (count == arr_1.length)
        {
            System.out.println("arr_1 is subset of arr_2");
        }
        else{
            System.out.println("arr_1 is not a subset of arr_2");};


	}

}
