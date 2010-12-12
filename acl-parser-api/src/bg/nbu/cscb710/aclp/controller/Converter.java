package bg.nbu.cscb710.aclp.controller;

import java.util.List;

import bg.nbu.cscb710.aclp.controller.exception.MalformedRowFormatException;
import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * Интерфейс, предназначен за трансформация на входна информация, след изчитане
 * на
 * Apache Combined Log файл.
 * 
 * <p>
 * Имплементациите на този интерфейс ще трансформират данните в списъци от
 * потребителски заявки ( List<{@link UserRequest}> ), които ще бъдат подавани
 * на модела на приложението.
 * </p>
 * 
 * @author Георги Николов
 */
public interface Converter {

	/**
	 * @param inputData
	 * @return
	 * @throws MalformedRowFormatException
	 */
	public List < UserRequest > convert ( String inputData )
			throws MalformedRowFormatException;
}
