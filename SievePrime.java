//This program generate prime numbers by "Sieve of Eratosthens"
class SievePrime{
	public static void main(String[] args){
		int i , j;
		int[] prime = new int[101];
		for(i = 0 ; i <= 100 ; i++){
			prime[i] = 1;//seting that index 1 suggesting the number is  a prime number
		}
		//0 1 2 3 4
		for(i = 2 ; i <= 100 ; i++){
			if(prime[i] == 1){//if the number is prime
				System.out.println(" "+i);
				for(j = 2 ; i*j <= 100 ; j++){
					prime[i*j] = 0; //set its multiples as not prime
				}
			}
			//else 
		}

	}
}
