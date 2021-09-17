public class Wc {

		System.out.println("Welcome to employee");

	}

public class empattend {

		Random ran = new Random();
		int n=ran.nextInt(2);
		System.out.println(n);
		if(n==0) 
			System.out.println("obsent");
		else 
			System.out.println("prsent");





	}

public class Fulldaywage {
                int fullday=8;
                int parttime=8;
                int wage=20;
		Random ran = new Random();
		int n=ran.nextInt(3);
		System.out.println(n);
		if(n==0) 
			System.out.println("obsent");
		else if(n==1)
			System.out.println("present for full time");
                        int wageforday=wage*fulltime;
                        System.out.println("wage is"+wageforday);

		else
			System.out.print("part time employee");

}
public class Parttime {
                int parttime=8;
                int wage=20;
		Random ran = new Random();
		int n=ran.nextInt(3);
		System.out.println(n);
		if(n==0) 
			System.out.println("obsent");
		else if(n==1)
			System.out.println("present for full time");
		else
			System.out.print("part time employee");
                       int wageforparttime=wage*parttime;
                       System.our.println("wage for part time is "+wageforparttime);

}
public class UC5 {


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
public class Uc6 {

	
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
public class Main{
    public static void main(String args[])
   {
    Wc ob=new Wc();
    Empattend ob1=new Empattend();
    Fulldaywage ob2=new Fulldaywage();
    Parttime ob3=new Parttime();
    Uc5 ob4=new Uc5();
    Uc6 ob5=new Uc6();
}
}
