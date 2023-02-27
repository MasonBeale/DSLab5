import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Passenger {
	private int seatNumber;
	private String name;
	private String seatClass;
	private static Scanner scan = new Scanner(System.in);

	public Passenger(int sit, String nm, String sc) {
		seatNumber = sit;
		name = nm;
		seatClass = sc;
	}
	public String toString() {
		return this.getName()+this.getSeatNumber()+this.getSeatClass();
	}

	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the seatClass
	 */
	public String getSeatClass() {
		return seatClass;
	}

	class simulation {
		private static final int FIRST = 10;
		private static final int BUSINESS = 10;
		private static final int ECONOMY = 20;
		private static final Random RANDOM = new Random();
		private static ArrayList<Passenger> united = new ArrayList<>();
		private static ArrayList<Passenger> delta = new ArrayList<>();

		public static void loadTextFile(String file, ArrayList<Passenger> pass) {
			try {
				Scanner fileScan = new Scanner(new File(file));
				while (fileScan.hasNextLine()) {
					String line = fileScan.nextLine();

					// Get the passenger name
					int index1 = line.indexOf(" ");
					int index2 = line.indexOf(" ", index1 + 1);
					String name = line.substring(0, index2);

					// Get the seat number
					int index3 = line.indexOf(" ", index2 + 1);
					int seatNumber = Integer.parseInt(line.substring(index2 + 1, index3));

					// Get the seat class
					String seatClass = line.substring(index3 + 1);
					Passenger passenger = new Passenger(seatNumber, name, seatClass);
					pass.add(passenger);
				}
				fileScan.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			// load the file here
			loadTextFile("Delta.txt", delta);
			loadTextFile("United.txt", united);

			// menu system
			boolean end = false;
			while (!end) {
				System.out.println("Please choose an option:");
				System.out.println("1. Check-in a passenger");
				System.out.println("2. Add a new passenger");
				System.out.println("3. Board passengers");
				System.out.println("4. Quit");
				int choice = scan.nextInt();
				//scan.nextInt();

				if (choice == 1) {
					// checkIn();
					break;
				} else if (choice == 2) {
					// addPassenger();
					break;
				} else if (choice == 3) {
					// board();
					break;
				} else if (choice == 4) {
					end = true;
					break;
				} else {
					System.out.println("Please input a valid value.\n");

				}
			}
			//System.out.println(delta.get(0));
		}
	}

}
