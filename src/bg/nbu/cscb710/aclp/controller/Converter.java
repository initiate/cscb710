package bg.nbu.cscb710.aclp.controller;

import java.util.List;

import bg.nbu.cscb710.aclp.controller.exception.MalformedRowFormatException;
import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * ���������, ������������ �� ������������� �� ������ ����������, ���� ��������
 * ��
 * Apache Combined Log ����.
 * 
 * <p>
 * ��������������� �� ���� ��������� �� ������������� ������� � ������� ��
 * ������������� ������ ( List<{@link UserRequest}> ), ����� �� ����� ��������
 * �� ������ �� ������������.
 * </p>
 * 
 * @author ������ �������
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
