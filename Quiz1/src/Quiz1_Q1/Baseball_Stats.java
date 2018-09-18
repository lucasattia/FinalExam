package Quiz1_Q1;
import java.util.Scanner;
public class Baseball_Stats {
	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homers;
	private int runs; 
	private int walks;
	private int singles;
	private String name;
	public Baseball_Stats() {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter player name:");
		name = stdin.nextLine();
		System.out.println("Please enter number of at bats:");
		atBats = stdin.nextInt();
		System.out.println("Please enter number of hits:");
		hits = stdin.nextInt();
		System.out.println("Please enter number of doubles:");
		doubles = stdin.nextInt();
		System.out.println("Please enter number of triples:");
		triples = stdin.nextInt();
		System.out.println("Please enter number of homers:");
		homers = stdin.nextInt();
		System.out.println("Please enter number of runs:");
		runs = stdin.nextInt();
		System.out.println("Please enter number of walks:");
		walks = stdin.nextInt();
		stdin.close();
	}
	public double battingAverage() {
		return (double) hits/atBats;
	}
	public double onBasePercentage() {
		return (double) (walks+ hits)/(atBats+ walks);
	}
	public int totalBases() {
	 singles = hits - doubles - triples - homers;
	return (singles) + (2*doubles) + (3*triples)+ (4*homers);
	}
	public double sluggingPercentage() {
		return (double) totalBases()/atBats;
	}
	public double onBaseSlugging() {
		return (double) sluggingPercentage() + onBasePercentage();
	}
	public static void main(String [] args) {
		Baseball_Stats myStats = new Baseball_Stats();
		System.out.println("BA: " + myStats.battingAverage());
		System.out.println("OBP: " + myStats.onBasePercentage());
		System.out.println("TB: " + myStats.totalBases());
		System.out.println("SLG: " + myStats.sluggingPercentage());
		System.out.println("OBS: " + myStats.onBaseSlugging());
	}
}
