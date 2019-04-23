package uml2rdf.test.inra_dev_test;

import javax.validation.constraints.NotNull;

import thewebsemantic.Id;
import thewebsemantic.Namespace;

@Namespace("http://inra/pegase#")
public class Sampletest {

	@Id
	private String sampleID ;
	
	private String nameAnimal ;
	
	@NotNull
	private int numAnimal ;
	
	@NotNull
	private String organism ;

	public String getSampleID() {
		return sampleID;
	}

	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public int getNumAnimal() {
		return numAnimal;
	}

	public void setNumAnimal(@NotNull int numAnimal) {
		this.numAnimal = numAnimal;
	}

	public String getOrganism() {
		return organism;
	}

	public void setOrganism(String organism) {
		this.organism = organism;
	}
	
	
}
