package uml2rdf.entity.example;

import java.util.Collection;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;
import thewebsemantic.Id;
import thewebsemantic.RdfProperty;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;
import thewebsemantic.vocabulary.Foaf;

public class WorkingSong extends RdfBean<WorkingSong> {
	//@RdfProperty(Foaf.+ "name")
	@RdfProperty(FOAF.NS + "name")
	private String composer = "aa";
	private WorkingGenre genre; 
	private String title = "t1";
	
	/*public static Collection<WorkingSong> load() {
		return Jenabean.load(WorkingSong.class);
	}*/
	
	// @Id
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	@Id
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public WorkingGenre getGenre() {
		return genre;
	}
	public void setGenre(WorkingGenre genre) {
		this.genre = genre;
	}
}
