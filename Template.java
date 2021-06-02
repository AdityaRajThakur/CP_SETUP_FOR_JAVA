
/*Author Adityaraj*/
import java.io.*;
import java.util.*;

public class Template {
	// initialize variable
	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
		/**********************************************************************************************************************************/
		// writer your code here
		














		// your code end here
		/**********************************************************************************************************************************/
		// compute the time elapsed
		if (System.getProperty("ONLINE_JUDGE") == null) {
			try {
				long end = System.nanoTime();

				System.out.print((end - start) / 1000000 + " ms");

				System.exit(0);
			} catch (Exception exception) {
			}
		}
	}

	/**************************************************************************************************************************************/
	/**************************************************************************************************************************************/
	// Function

	/**************************************************************************************************************************************/
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
	// Pair class of Generic type

	static class Pair<A, B> {
		A first;
		B second;

		Pair(A first, B second) {
			this.first = first;
			this.second = second;
		}
	}

	/********************************************************************* */
	// Fast Reader Class
	public static class FastScanner {

		// Reader object
		BufferedReader reader;
		public int[] intarr;
		public Long[] longarr;
		public Float[] floatarr;
		public Double[] doublearr;

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

			intarr = new int[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				intarr[i] = Integer.parseInt(tokenizer.nextToken());
			}
			return intarr;
		}

		public Float[] readfloatArray(int n) throws IOException {

			floatarr = new Float[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				floatarr[i] = Float.parseFloat(tokenizer.nextToken());
			}
			return floatarr;
		}

		public Double[] readDoubleArray(int n) throws IOException {

			doublearr = new Double[n];
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				doublearr[i] = Double.parseDouble(tokenizer.nextToken());
			}
			return doublearr;
		}

		public Long[] readLongArray(int n) throws IOException {
			tokenizer = new StringTokenizer(reader.readLine());

			longarr = new Long[n];
			int i = 0;
			while (tokenizer.hasMoreTokens()) {
				longarr[i] = Long.parseLong(tokenizer.nextToken());
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
		public void writeIntArray(int[] arr) throws IOException {
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i] + " ");
			}
			writer.newLine();
			writer.flush();
		}

		// Function to write Integer of
		// array without spaces in 1 line
		public void writeIntArrayWithoutSpaces(int[] arr) throws IOException {
			for (int i = 0; i < arr.length; i++) {
				writer.write(Integer.toString(arr[i]));
			}
			writer.newLine();
			writer.flush();
		}

		public void writeIntegerlist(List<Integer> list) throws IOException {
			if (list != null) {
				for (Integer integer : list) {
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