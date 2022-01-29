
/*Author Adityaraj*/
import java.io.*;
import java.util.*;

public class Main {
	// initialize variable
	// Initialize the reader
	private static FastScanner scan = new FastScanner();
	// Initialize the writer
	private static FastOutput out = new FastOutput();

	public static void main(String[] args) throws IOException {
		/**********************************************************************************************************************************/
		int t = 1;
		t = scan.readInt();

		while (t != 0) {
			solve();
			t--;
		}

		/**************************************************************************************************************************************/
	}

	/**************************************************************************************************************************************/
	// Function
	public static void solve() throws IOException {
		int[] arr = scan.readIntArray(2);
		int n = arr[0];
		int m = arr[1];
		int[] a = scan.readIntArray(n);
		int[] b = scan.readIntArray(m);
		out.writeInt(LIS(a) + LIS(b));
	}

	/**************************************************************************************************************************************/
	static int LIS(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> lis = new ArrayList<>();
		lis.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (lis.get(lis.size() - 1) <= arr[i]) {
				lis.add(arr[i]);
			} else {
				int idx = upper_bound(lis, 0, lis.size(), arr[i]);
				lis.set(idx, arr[i]);
			}
		}
		return lis.size();
	}

	public static int upper_bound(ArrayList<Integer> lis, int low, int high, int k) {
		while (low != high) {
			int mid = low + high >> 1;
			if (lis.get(mid) <= k) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (low == lis.size()) {
			return -1;
		}
		return low;
	}

	public static int lower_bound(ArrayList<Integer> lis, int low, int high, int k) {
		while (low != high) {
			int mid = low + high >> 1;
			if (lis.get(mid) < k) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (low == lis.size()) {
			return -1;
		}
		return low;
	}

	public static int nextpoweroftwo(long n) {
		int i = 0;
		while (n != 0) {
			n >>= 1;
			i++;
		}
		return i;
	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

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

	public static boolean primeornot(long a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				// System.out.println(i);
				return false;
			}
		}
		return true;
	}

	public static List<Integer> primefactorization(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				list.add(i);
				n /= i;
			}
		}
		if (n != 1)
			list.add(n);
		return list;
	}

	public static int countbit(long n) {
		int count = 0;
		while (n > 0) {
			count++;
			n &= n - 1;
		}
		return count;
	}

	public static boolean perfectsquare(long n) {
		if (n >= 0) {
			int sr = (int) Math.sqrt(n);
			return sr * sr == n;
		}
		return false;
	}

	public static boolean poweroftwo(long n) {
		if ((n & n - 1) == 0)
			return true;
		return false;
	}

	public static List<Integer> ConvertToList(int[] arr) {
		List<Integer> lis = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			lis.add(arr[i]);
		return lis;
	}
}

/*************************************************************************************************************************/
/*************************************************************************************************************************/
// pair class of Pair<Integer, Integer>
// like list,queue,etc;(Integer,Integer)
// Pair class of Generic type

class Pair<A, B> {
	A first;
	B second;

	Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}
}

/********************************************************************* */
// Fast Reader Class
class FastScanner {

	// Reader object
	BufferedReader reader;
	public int[] intarr;

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
class FastOutput {

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

	public void writeNewline() throws IOException {
		writer.newLine();
		writer.flush();
	}

	public void writeStringWithoutNewline(String s) throws IOException {
		writer.write(s);
		// writer.newLine();
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

	public void writeLongArray(Long[] arr) throws IOException {
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
