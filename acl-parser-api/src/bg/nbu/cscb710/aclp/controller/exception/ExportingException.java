package bg.nbu.cscb710.aclp.controller.exception;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * ������, ����� ���� ��������, ��� ���� ���������� �� ����� �� ����� �� ������
 * �� �������� ����, � ������ �� �� ������� ��
 * {@link UnsupportedEncodingException} � {@link FileNotFoundException}.
 * 
 * <p>��������� �� {@link RuntimeException}, �� ��� ������ �� ����������� �� ���.</p>
 * 
 * @author ������ �������
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
