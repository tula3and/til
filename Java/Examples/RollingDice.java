public class RollingDice {
	
	private int faceNumber; // current value
	private int numSides; // the number of sides
	private String name;

	public int getSideNumber() {
		return numSides;
	}

	public int getFaceNumber() {
		return faceNumber;
	}

	public String getName() {
		return name;
	}

	public void roll() {
		faceNumber = (int) (Math.random() * numSides) + 1;	// 0.0 <= Math.random() < 1.0 // double
	}

	public String toString() {
		return String.format("Name: %s, The number of sides: %d", name, numSides);
	}

	public int compareTo(Object obj) {
		if (faceNumber > ((RollingDice) obj).faceNumber) {
			return -1;
		}
		else if (faceNumber < ((RollingDice) obj).faceNumber) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
    
		RollingDice die1 = new RollingDice();
		die1.name = "die1"; die1.numSides = 6;
		System.out.println(die1);
    
		RollingDice die2 = new RollingDice();
		die2.name = "die2";	die2.numSides = 6;
		System.out.println(die2);
    
		System.out.println("------------");
		System.out.println(" die1  die2 ");
		System.out.println("------------");
    
		int result, i = 0;
		while (i < 10) {
			i++;
			die1.roll();
			die2.roll();
			result = die1.compareTo(die2);
			if (result == -1) {
				System.out.printf("%3d, %3d (die1 > die2)\n", die1.faceNumber, die2.faceNumber);
			}
			else if (result == 1) {
				System.out.printf("%3d, %3d (die1 < die2)\n", die1.faceNumber, die2.faceNumber);
			}
			else {
				System.out.printf("%3d, %3d (die1 = die2)\n", die1.faceNumber, die2.faceNumber);
			}
		}

	}
	
}
