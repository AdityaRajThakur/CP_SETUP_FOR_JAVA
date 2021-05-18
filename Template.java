
/*Author Adityaraj*/
import java.io.*;
import java.util.*;
import java.math.*;

public class Template {
	// static int count = 0 ;

	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		// initialize the mod variabel of very big prime number
		final int mod = 1000000007;
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
		// Intitialize the Map of <integer,integer> --------------------------Map

		// Map<Integer,Integer> map = new HashMap<>();

		// Intitialize the iterator for the map-------------Map-Iterator

		// Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

		// Intitialize the PriorityQueue of <Integer> with comparator or use the
		// Collections.reverseOrder() to sort the element in the desecnding order
		// -----------------------------------------------------------------------------PriorityQueue

		// Queue<Integer> pq = new PriorityQueue<Integer>();

		// ----------------------------------------------------------------------------Simple
		// Queue
		// Queue<Pair> pq = new LinkedList<Pair>();

		// --------------------------------------------------------------PriorityQueue<Pair>
		// With Lambda Comparator and Pair

		// Queue<Pair> pq = new PriorityQueue<>(
		// 		(Pair p1, Pair p2) -> {
		// 			if (p1.w < p2.w)
		// 				return -1;
		// 			else if (p1.w > p2.w)
		// 				return 1;
		// 			else
		// 				return 0;
		// 		});
		// Queue<Pair> pq = new LinkedList<>();

		// ----------------------------------------------------------------Set
		// Element in the set are not in the sorted order

		// Set<Integer> set = new HashSet<Integer>();

		// ---------------------------------------------------------------SortedSet
		// use the Collection.reverseOrder() to sort the set in the decreasign order

		// SortedSet<Integer> set = new TreeSet<Integer>();

		// For the graph adjacent list ---------------------------------Adjacency--List

		// List<List<Pair>> adjlist = new ArrayList<>(10);

		/************************************************************************************************************************************/
		// writer your code here




		


		// your code end here
		/*************************************************************************************************************************************/
		// compute the time elapsed
		if (System.getProperty("ONLINE_JUDGE") == null) {
			try {
				long end = System.nanoTime();

				System.out.print((end - start) / 1000000 + " ms");

			} catch (Exception exception) {
			}
		}
	}

	/**************************************************************************************************************************************/
	// do not touch it
	/**************************************************************************************************************************************/
	// Write here the function which do you want to insert into the code during the
	// sumbition
	public static boolean sorted(int[] arr){
		boolean flag = true;
		int n =arr.length;
		for (int i = 0; i < n-1; i++) {
			if(arr[i]>arr[i+1]){
				flag = false;
			}
		}
		return flag;
	}
	// this function will the gcd of two numbers
	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// this will return the pow of a^b
	public static long binexp(long a, long b) {
		long res = 1;
		while (b != 0) {
			if (b % 2 != 0)
				res *= a;
			a *= a;
			b /= 2;
		}
		return res;
	}

	public static long binexpomod(long a, long b, long mod) {
		long res = 1;
		a %= mod;
		while (b != 0) {
			if (b % 2 != 0)
				res = (res % mod) * (a % mod);
			a = (a % mod) * (a % mod);
			b /= 2;
		}
		return res;
	}

	// this will return true if a is prime and false if not
	public static boolean primeornot(long a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				// System.out.println(i);
				return false;

			}
		}
		return true;
	}

	// this function will check that a given string is palindrome or not
	public static boolean palindrome(String string) {
		StringBuffer buffer = new StringBuffer(string);
		buffer = buffer.reverse();
		if (string.equals(buffer.toString())) {
			return true;
		}
		return false;
	}

	// this function count the number of digit in a number
	public static int countdigit(long a) {
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}
		return count;
	}

	// this funciton will count the number of bit in a binary representation of a
	// number
	public static int countbit(Long n) {
		int count = 0;
		while (n > 0) {
			count++;
			n &= n - 1;
		}
		return count;
	}

	// this method will return the sum of its digit
	public static int sumofdigits(int digit) {
		int sum = 0;
		while (digit > 0) {
			sum += digit % 10;
			digit /= 10;
		}
		return sum;
	}

	// this method check that a number is a perfect square or not
	public static boolean perfectsquare(long n) {
		if (n >= 0) {
			int sr = (int) Math.sqrt(n);
			return sr * sr == n;
		}
		return false;
	}

	/*************************************************************************************************************************/
	/*************************************************************************************************************************/
	// pair class of Pair<Integer, Integer>

	// like list,queue,etc;(Integer,Integer)
	public static class Pair {
		Integer node;
		Integer w;
		// Integer w;

		public Pair(Integer node, Integer w) {
			this.node = node;
			this.w = w;
			// this.w = w ;
		}
	}

	// Pair class of Generic type

	// static class Pair<A, B> {
	// A first;
	// B second;

	// Constructor
	// public Pair(A first, B second) {
	// this.first = first;
	// this.second = second;
	// }
	// }

	/********************************************************************* */
	// Fast Reader Class
	public static class FastScanner {

		// Reader object
		BufferedReader reader;
		public int[] intarr;
		public Long[] longarr;
		public Float[] floatarr;
		public Double[] doublearr;

		int sum;
		long longsum;
		float floatsum;
		Double doublesum;

		// Constructor
		public FastScanner() {

			// Initialize the reader
			reader = new BufferedReader(new InputStreamReader(System.in));

			if (System.getProperty("ONLINE_JUDGE") == null) {
				try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
				} catch (Exception e) {
				}
			}
		}

		// String tokenizer
		StringTokenizer tokenizer;

		// Function to read a
		// single integer
		// to extend the fast reader class writer your function here

		public int readInt() throws IOException {
			return Integer.parseInt(reader.readLine());
		}

		// Function to read a
		// single long
		public long readLong() throws IOException {
			return Long.parseLong(reader.readLine());
		}

		// Function to read string
		public String readString() throws IOException {
			return reader.readLine();
		}

		// Function to read a array
		// of numsInts integers
		// in one line
		public int[] readIntArray(int n) throws IOException {
			sum = 0;
			intarr = new int[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				sum += intarr[i] = Integer.parseInt(tokenizer.nextToken());
			}
			return intarr;
		}

		public Float[] readfloatArray(int n) throws IOException {
			floatsum = 0f;
			floatarr = new Float[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				floatsum += floatarr[i] = Float.parseFloat(tokenizer.nextToken());
			}
			return floatarr;
		}

		public Double[] readDoubleArray(int n) throws IOException {
			doublesum = 0d;
			doublearr = new Double[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				doublesum += doublearr[i] = Double.parseDouble(tokenizer.nextToken());
			}
			return doublearr;
		}

		public Long[] readLongArray(int n) throws IOException {
			tokenizer = new StringTokenizer(reader.readLine());
			longsum = 0L;
			longarr = new Long[n];
			int i = 0;
			while (tokenizer.hasMoreTokens()) {
				longsum += longarr[i] = Long.parseLong(tokenizer.nextToken());
				i++;
			}
			return longarr;
		}

		public List<Integer> readIntAsList() throws IOException {
			List<Integer> list = new ArrayList<Integer>();
			tokenizer = new StringTokenizer(reader.readLine());
			while (tokenizer.hasMoreTokens()) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
			}
			return list;
		}

		public List<Long> readLongAsList() throws IOException {
			List<Long> list = new ArrayList<Long>();
			tokenizer = new StringTokenizer(reader.readLine());
			while (tokenizer.hasMoreTokens()) {
				list.add(Long.parseLong(tokenizer.nextToken()));
			}
			return list;
		}

	}

	// Fast Writer Class
	public static class FastOutput {

		// Writer object
		BufferedWriter writer;

		// Constructor
		public FastOutput() {

			// Initialize the writer
			writer = new BufferedWriter(new OutputStreamWriter(System.out));
			if (System.getProperty("ONLINE_JUDGE") == null) {
				try {
					writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
				} catch (Exception e) {
				}
			}
		}

		// Function to write the
		// single integer
		public void writeInt(int i) throws IOException {
			writer.write(Integer.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to writer a single character
		public void writeChar(char c) throws IOException {
			writer.write(Character.toString(c));
			writer.newLine();
			writer.flush();
		}

		// Function to write single long
		public void writeLong(long i) throws IOException {
			writer.write(Long.toString(i));
			writer.newLine();
			writer.flush();
		}

		// Function to write String
		public void writeString(String s) throws IOException {
			writer.write(s);
			writer.newLine();
			writer.flush();
		}

		public void writeStringWithSpace(String s) throws IOException {
			writer.write(s);
			writer.write(" ");
			writer.flush();
		}

		// Function to write a Integer of
		// array with spaces in one line
		public void writeIntArray(int[] nums) throws IOException {
			for (int i = 0; i < nums.length; i++) {
				writer.write(nums[i] + " ");
			}
			writer.newLine();
			writer.flush();
		}

		// Function to write Integer of
		// array without spaces in 1 line
		public void writeIntArrayWithoutSpaces(int[] nums) throws IOException {
			for (int i = 0; i < nums.length; i++) {
				writer.write(Integer.toString(nums[i]));
			}
			writer.newLine();
			writer.flush();
		}

		public void writeIntegerlist(List<Integer> num) throws IOException {
			if (num != null) {
				for (Integer integer : num) {
					writer.write(integer + " ");

				}
			}
			writer.newLine();
			writer.flush();
		}

		public void writeintmatrix(int[][] matrix) throws IOException {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					writer.write(matrix[i][j] + " ");
				}
				writer.newLine();
			}

			writer.flush();

		}

	}
}