package practice;

import javafx.util.Pair;

public class CountHeadtail {
	// Function to find count of head and tail
	public static Pair<Integer, Integer> count_ht(char s, int N) {
		// Check if initially all the
		// coins are facing towards head
		Pair<Integer, Integer> p = new Pair<Integer, Integer>(0, 0);
		if (s == 'H') {
			p = new Pair<Integer, Integer>((int) Math.floor(N / 2.0), (int) Math.ceil(N / 2.0));
		}
		// Check if initially all the coins
		// are facing towards tail
		else if (s == 'T') {
			p = new Pair<Integer, Integer>((int) Math.ceil(N / 2.0), (int) Math.floor(N / 2.0));
		}
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char C = 'H';
		int N = 1100;
		Pair<Integer, Integer> p = count_ht(C, N);
		System.out.println("Head = " + p.getKey());
		System.out.println("Tail = " + p.getValue());
	}
}
