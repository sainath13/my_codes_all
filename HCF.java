class HighestCommonFactor{
	static int hcf(int a ,int b){
		int r;
		r = a % b;
		if(r != 0){
			a = b ;
			b = r;
			hcf(a,b);
		}
		return b;	
	}
	
	public static void main(String[] args){
		int c = hcf(30,20);
		System.out.println(""+c);	
	
	}
}
