import java.util.*;    //importing util class to use scanner method

class FindAliquot {    //class to find the Aliquot number
	
	int i, sum = 0;
	public void aliquotSum(int num) {
		System.out.println("The Aliquot Numbers are: ");
		for(i=1;i<num;i++)
		{
			if(num % i == 0) {
				System.out.print(i+"\t");
				sum += i;
			}
		}
		System.out.println();
		if(sum == num) {
			System.out.println("The number " +num+ " is a Perfect Number");
		}
		else {
			System.out.println("The number " +num+ " is not a Perfect Number");
		}
	}
}
public class AliquotDemo {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		FindAliquot  fa = new FindAliquot();
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		fa.aliquotSum(num);
		sc.close();
	}

}
