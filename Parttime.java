public class Parttime {

	public static void main(String[] args) {
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

}
