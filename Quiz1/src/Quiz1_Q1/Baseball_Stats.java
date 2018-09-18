package Quiz1_Q1;
import java.util.Scanner;
public class Baseball_Stats {
	private double battingAverage;
	private double onBasePercentage;
	private int totalBases;
	private double sluggingPercentage;
	private double onBaseSlugging;
	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homers;
	private int runs; 
	private int walks;
	private int singles;
	public Baseball_Stats() {
		Scanner stdin = new Scanner(System.in);
		atBats = stdin.nextInt();
		hits = stdin.nextInt();
		doubles = stdin.nextInt();
		triples = stdin.nextInt();
		homers = stdin.nextInt();
		runs = stdin.nextInt();
		walks = stdin.nextInt();
		stdin.close();
	}
	public void set_battingAverage() {
		battingAverage = (double) hits/atBats;
		System.out.println(battingAverage);
	}
	public void set_onBasePercentage() {
		onBasePercentage = (double) (walks+ hits)/(atBats+ walks);
		System.out.println(onBasePercentage);
	}
	public void set_totalBases() {
		singles = hits - doubles - triples - homers;
		totalBases = (singles) + (2*doubles) + (3*triples)+ (4*homers);
		System.out.println(totalBases);
	}
	public void set_sluggingPercentage() {
		sluggingPercentage = (double) totalBases/atBats;
		System.out.println(sluggingPercentage);
	}
	public void set_onBaseSlugging() {
		onBaseSlugging = (double) onBasePercentage + sluggingPercentage;
		System.out.println(onBaseSlugging);
	}
	public static void main(String [] args) {
		Baseball_Stats myStats = new Baseball_Stats();
		myStats.set_battingAverage();
		myStats.set_onBasePercentage();
		myStats.set_totalBases();
		myStats.set_sluggingPercentage();
		myStats.set_onBaseSlugging();
	}
}
