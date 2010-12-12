package bg.nbu.cscb710.aclp.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

import bg.nbu.cscb710.aclp.controller.exception.ExportingException;
import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * Интерфейсм, предоставящ възможност за записване на файл в подходящ формат,
 * указан от потребителя, с информация за заявките.
 * 
 * @author Георги Николов
 */
public interface Writer {

	/**
	 * 
	 * Метод, който може да използваме за запис на изходящи файлове в указан от
	 * потребителя формат.
	 * 
	 * @param analyzedRequests
	 *            колекция от данни, съдържащи резултата, който трябва да
	 *            запишем.
	 * @param outputFile
	 *            файл където ще запишем анализираните заявки.
	 * @param format
	 *            формат в който ще запишем резултата.
	 * 
	 * @throws UnsupportedEncodingException
	 *             ако използвания Encoding не се поддържа.
	 * @throws FileNotFoundException
	 *             ако файла не съществува.
	 * @throws {@link ExportingException} грешка която би била хвърлена, ако по
	 *         време на записа на файла възникне проблем. Да се има на предвид,
	 *         че
	 *         тази грешка е наследник на {@link RuntimeException}, а не на
	 *         {@link Exception}.
	 */
	public void writeOutputFile ( Collection < UserRequest > analyzedRequests,
			File outputFile, String format )
			throws UnsupportedEncodingException, FileNotFoundException,
			ExportingException;

	/**
	 * 
	 * Метод, който може да използваме за запис на изходящи файлове в указан от
	 * потребителя формат.
	 * 
	 * @param analyzedRequests
	 *            колекция от данни, съдържащи резултата, който трябва да
	 *            запишем. Съдържа ключ на категориите и асоциираните с тях
	 *            заявки.
	 * @param outputFile
	 *            файл където ще запишем анализираните заявки.
	 * @param format
	 *            формат в който ще запишем резултата.
	 * 
	 * @throws UnsupportedEncodingException
	 *             ако използвания Encoding не се поддържа.
	 * @throws FileNotFoundException
	 *             ако файла не съществува.
	 * @throws {@link ExportingException} грешка която би била хвърлена, ако по
	 *         време на записа на файла възникне проблем. Да се има на предвид,
	 *         че
	 *         тази грешка е наследник на {@link RuntimeException}, а не на
	 *         {@link Exception}.
	 */
	public void writeOutputFile ( Map < String, UserRequest > analyzedRequests,
			File outputFile, String format )
			throws UnsupportedEncodingException, FileNotFoundException,
			ExportingException;
}
