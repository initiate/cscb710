package bg.nbu.cscb710.aclp.controller;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Интерфейс, който предоставя възможност за четене на Apache Combined Log.
 * 
 * @author Георги Николов
 */
public interface Reader {

	/**
	 * Метод използван за изчитането на един log файл.
	 * 
	 * @param {@link File} файл от който трябва да четем.
	 * 
	 * @return {@link String} текстов низ с изчетените данни.
	 * 
	 * @throws FileNotFoundException
	 *             при положение, че файла не може да бъде намерен.
	 */
	public String readInputFile ( File file ) throws FileNotFoundException;
}
