class PrimeFactGen{
	void primeFactors(int n){
		while(n%2==0){
			System.out.println("2");
			n=n/2;
		}
		int x =sqrt(n).floor();
		for(j = 3 ; j <=x ; j+=2){
			if(n%j==0){
				System.out.println(j);
				n=n/j;
				}
			
		}
		if(n>2){
			system.out.prinln(n);
		}
	}

}
