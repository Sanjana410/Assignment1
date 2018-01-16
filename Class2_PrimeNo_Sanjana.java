
public class Class2_PrimeNo_Sanjana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =21;
		int i=2;
		int num2=0;
		while(i<=num/i){
			num2 = num%i;
			i++;
		
		if(num2==0)
		{
			System.out.println("it is not prime");
			break;
		}
		}
		if(num2!=0){
			System.out.println("it is prime");
		}
		

}
}
