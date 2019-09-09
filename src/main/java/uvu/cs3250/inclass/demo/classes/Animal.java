package uvu.cs3250.inclass.demo.classes;

public class Animal implements Movable, Crawlable {
	@Override
	public String run() {
		return Movable.super.run() + "\n" + Crawlable.super.run();
	}
}
