package uml2rdf.entity.example;

import thewebsemantic.Id;

public class WorkingGenre {
	
	public static WorkingGenre ROCK = new WorkingGenre("ROCK");
	public static WorkingGenre CLASSICAL = new WorkingGenre("CLASSICAL");
	public static WorkingGenre JAZZ = new WorkingGenre("JAZZ");
	
	private String id;
	
	public WorkingGenre(String id) {
		this.id = id;
	}
	
	@Id
	public String getName() {
		return id;
	}
	
}
