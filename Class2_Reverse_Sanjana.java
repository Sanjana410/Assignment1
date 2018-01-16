
public class Class2_Reverse_Sanjana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int num2= num;
		int num3 = 0;
		while(num>0){
		int num1 = num%10;
		 num3= num3 *10+ num1;
			num = num/10;
			
		}
		System.out.println(num3);
		

	}

}
