package bg.nbu.cscb710.aclp.extractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import bg.nbu.cscb710.aclp.controller.Reader;
import bg.nbu.cscb710.aclp.util.Constants;

public class InputReader implements Reader{

	@Override
	public String readInputFile(File file) throws FileNotFoundException {
		StringBuilder content = new StringBuilder ( );

		Scanner scanner = new Scanner ( new FileInputStream ( file ), Constants.UTF8_ENCODING );

		// Read contents of the file, line by line, and store them.
		while ( scanner.hasNextLine ( ) ) {
			content.append ( scanner.nextLine ( ) + Constants.NEW_LINE );
		}

		scanner.close ( );

		return content.toString ( );
	}

}
