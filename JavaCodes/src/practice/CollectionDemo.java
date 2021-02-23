package practice;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print duplicate number and count
		
		int a[] = {4,5,5,5,5,6,7,8,5,4,3,7,5,2,3,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			int k=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				
				//System.out.println(a[i] + " - " + k);
				if(k==1) {
					System.out.println(a[i] + " is a unique number in the given array");
				}
				
			}
			
		}
		

	}

}
