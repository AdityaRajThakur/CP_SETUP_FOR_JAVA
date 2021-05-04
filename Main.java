// fast input output
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		// Initialize the reader
		FastScanner scan = new FastScanner();
		// Initialize the writer
		FastOutput out = new FastOutput();
/*********************************************************************************************************************************************/
		// writer your code here
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

/*********************************************************************************************************************************************/
	}
/*********************************************************************************************************************************************/
	// writer your function hereAccepted






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/**********************************************************************************************************************************************/

	public static class FastScanner {

		// Reader object
		BufferedReader reader;

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
		public int[] readIntArray(int numInts) throws IOException {
			int[] nums = new int[numInts];
			tokenizer = new StringTokenizer(reader.readLine());

			for (int i = 0; i < numInts; i++) {
				nums[i] = Integer.parseInt(tokenizer.nextToken());
			}
			return nums;
		}
		public Long[] readLongArray(int n)throws IOException{
			tokenizer = new StringTokenizer(reader.readLine());
			Long[] arr= new Long[n];
			int i =0;
			while (tokenizer.hasMoreTokens()) {
				arr[i]  = Long.parseLong(tokenizer.nextToken());
				i++;
			}
			return arr;
		}

		public List<Integer> readIntAsList() throws IOException {
			List<Integer> list = new ArrayList<Integer>();
			tokenizer = new StringTokenizer(reader.readLine());
			while (tokenizer.hasMoreTokens()) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
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
		// to extend the fast reader class writer your function here
		// public void writerboolean(boolean b) throws IOException{
		// 	if (b==true) {
		// 		writer.write("true");
		// 	}else{
		// 		writer.write("false");
		// 	}
		// }
		public void writeInt(int i) throws IOException {
			writer.write(Integer.toString(i));
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
		public void writelist(List<Integer> num)throws IOException {
			for (Integer integer : num) {
				writer.write(integer+" ");
			
			}
			writer.newLine();
			writer.flush();
		}
		

	}
	}

