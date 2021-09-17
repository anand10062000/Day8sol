public class Uc6 {

	public static void main(String[] args) {
		System.out.println("enter employee hour");
		Scanner sc=new Scanner(System.in);
		int hrs=sc.nextInt();
		System.out.println("enter employee worked days");
		int days=sc.nextInt();
		int day=5;
		int chargesperhrs=60;
		if(hrs<=100 && days<=20) {
			int	hrswage=hrs*chargesperhrs;
		    int daywage=(days*day)*60;
		    System.out.println("empwage for hrs"+hrswage);
		    System.out.println("empwage for days"+daywage);

		}






	}


