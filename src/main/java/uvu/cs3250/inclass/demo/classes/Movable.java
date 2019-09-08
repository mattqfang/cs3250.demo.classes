package uvu.cs3250.inclass.demo.classes;

public interface Movable {
	default String move() {
		return "I am moving!";
	}
}
