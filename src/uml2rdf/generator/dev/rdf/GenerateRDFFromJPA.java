package uml2rdf.generator.dev.rdf;

import java.io.File;
import org.apache.commons.cli.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GenerateRDFFromJPA {

	public static void main(String[] args) throws Exception {

		Options options = new Options();

		// Option set
		Option filename = new Option("n","name",true,"filename");
		filename.setRequired(true);
		options.addOption(filename);

		Option filetype = new Option("t","type",true,"spreadsheet file type");
		filetype.setRequired(true);
		options.addOption(filetype);

		Option pack = new Option("g","generatejar",true,"jar file with JPA classes used for validation / template creation");
		pack.setRequired(true);
		options.addOption(pack);
		
		Option exporttype = new Option("e","exportchoice",true,"export choise used for the exportation of data to RDF or CSV acomics compatible");
		exporttype.setRequired(true);
		options.addOption(exporttype);
		
		Option format = new Option("f","exportformat",true,"format used for the export RDF : XML or turtle");
		format.setRequired(true);
		options.addOption(format);

		// Parse the arguments
		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			formatter.printHelp("argument names", options);
			System.exit(1);
			return;
		}
		

		// Get arguments' options 
		String inputFileName = cmd.getOptionValue("name");	
		String inputFileType = cmd.getOptionValue("type");	
		String generatejar = cmd.getOptionValue("generatejar");
		String export = cmd.getOptionValue("exportchoice");
		String exportformat = cmd.getOptionValue("exportformat");
		ReadWorkBook f = new ReadWorkBook(inputFileName,inputFileType,generatejar);
		File file = new File(inputFileName);
		

		// Read the given input file or print an error
		if ( !(inputFileName==null) && file.exists() && export !=null) {
			f.parseFile(export, exportformat);
		}
		else {
			System.err.println("file not found or export choice not valide"+file.getAbsolutePath());
			System.exit(1);
		}

	}
}