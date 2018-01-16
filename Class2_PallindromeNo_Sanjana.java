
public class Class2_PallindromeNo_Sanjana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int num1 = num;
		int num2 = 0;
		int num3;
		
		while(num>0){
		num3 = num%10;
		num2 = num2*10+num3;
		num = num/10;
		}
		if(num1 == num2){
		System.out.println("It is palindrome no");
		}

	}

}
