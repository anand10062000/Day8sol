public class UC5 {

	public static void main(String[] args) { 


		int fulltime=16;
		int parttime=8;
		System.out.println("enter employee status:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 0:
			System.out.println("emp absent");
			break;
		case 1:
			int empfulltimewage=20*fulltime;
			System.out.println("fumm time employee wage is :"+empfulltimewage);
			break;
		case 2:
			int parttimewage=20*parttime;
			System.out.println("part time employee wage is :"+parttimewage);
			break;
		default:
			System.out.println("wrong input");
		}
}
