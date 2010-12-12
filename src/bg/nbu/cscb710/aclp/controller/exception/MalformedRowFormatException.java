package bg.nbu.cscb710.aclp.controller.exception;

/**
 * ������, ����� �� ������, ��� ����� ��� �� ��� ����� �� � ���������� ��������,
 * ��� � �������.
 * 
 * @author ������ �������
 */
public class MalformedRowFormatException extends Exception {

	private static final long serialVersionUID = -4431446615484050763L;

	/**
	 * 
	 */
	public MalformedRowFormatException ( ) {
	}

	/**
	 * @param exceptionMessage
	 */
	public MalformedRowFormatException ( String exceptionMessage ) {
		super ( exceptionMessage );
	}

	/**
	 * @param exceptionMessage
	 * @param throwable
	 */
	public MalformedRowFormatException ( String exceptionMessage,
			Throwable throwable ) {
		super ( exceptionMessage, throwable );
	}
}
