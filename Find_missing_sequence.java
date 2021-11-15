package geekster;

public class Find_missing_sequence {
	
	public static void main(String []args) {
		int arr[]= {1,2,3,5,6,7,8,9,10};
		int n=arr.length;
		int n1=n+1;
		int sum=0;
		int totalsum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		totalsum=(n1*(n1+1))/2;
		int miss=totalsum-sum;
		System.out.println(miss);
	}

}
