package uvu.cs3250.inclass.demo.classes;

public interface Crawlable {
	default String crawl() {
		return "I am crawling...";
	}
}
