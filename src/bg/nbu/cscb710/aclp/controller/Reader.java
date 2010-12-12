package bg.nbu.cscb710.aclp.controller;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * ���������, ����� ���������� ���������� �� ������ �� Apache Combined Log.
 * 
 * @author ������ �������
 */
public interface Reader {

	/**
	 * ����� ��������� �� ���������� �� ���� log ����.
	 * 
	 * @param {@link File} ���� �� ����� ������ �� �����.
	 * 
	 * @return {@link String} ������� ��� � ���������� �����.
	 * 
	 * @throws FileNotFoundException
	 *             ��� ���������, �� ����� �� ���� �� ���� �������.
	 */
	public String readInputFile ( File file ) throws FileNotFoundException;
}
