package bg.nbu.cscb710.aclp.controller.exception;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Грешка, която бива хвърлена, ако нещо необичайно се случи по време на записа
 * на изходния файл, и случая не се покрива от
 * {@link UnsupportedEncodingException} и {@link FileNotFoundException}.
 * 
 * <p>Наследник на {@link RuntimeException}, не сме длъжни да проверяваме за нея.</p>
 * 
 * @author Георги Николов
 */
public class ExportingException extends RuntimeException {

	private static final long serialVersionUID = -5777043905259819013L;

	/**
	 * 
	 */
	public ExportingException ( ) {
	}

	/**
	 * @param message
	 */
	public ExportingException ( String message ) {
		super ( message );
	}

	/**
	 * @param message
	 * @param throwable
	 */
	public ExportingException ( String message, Throwable throwable ) {
		super ( message, throwable );
	}
}
