public class Simple {

	public static void main(String[] args) {
		String s = "This is a java class";
		String sd = s.replace("java", "SQL");
		System.out.println(s.toUpperCase());
		System.out.println(sd.toUpperCase());
		String[] arr = s.split(" ");
		int c = 0;
		for (String x : arr) {
			String[] ind = x.split("");
			System.out.println(x+" "+x.length());
			c+=1;
			StringBuilder srr = new StringBuilder("");
			for(int i=ind.length-1;i>=0;i--){
				
				
				srr.append(ind[i]);
				
			}
			System.out.println(srr);
			}
		System.out.println(c);
			

	}

}
