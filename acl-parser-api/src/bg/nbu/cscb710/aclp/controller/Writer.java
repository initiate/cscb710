package bg.nbu.cscb710.aclp.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

import bg.nbu.cscb710.aclp.controller.exception.ExportingException;
import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * ����������, ����������� ���������� �� ��������� �� ���� � �������� ������,
 * ������ �� �����������, � ���������� �� ��������.
 * 
 * @author ������ �������
 */
public interface Writer {

	/**
	 * 
	 * �����, ����� ���� �� ���������� �� ����� �� �������� ������� � ������ ��
	 * ����������� ������.
	 * 
	 * @param analyzedRequests
	 *            �������� �� �����, ��������� ���������, ����� ������ ��
	 *            �������.
	 * @param outputFile
	 *            ���� ������ �� ������� ������������� ������.
	 * @param format
	 *            ������ � ����� �� ������� ���������.
	 * 
	 * @throws UnsupportedEncodingException
	 *             ��� ����������� Encoding �� �� ��������.
	 * @throws FileNotFoundException
	 *             ��� ����� �� ����������.
	 * @throws {@link ExportingException} ������ ����� �� ���� ��������, ��� ��
	 *         ����� �� ������ �� ����� �������� �������. �� �� ��� �� �������,
	 *         ��
	 *         ���� ������ � ��������� �� {@link RuntimeException}, � �� ��
	 *         {@link Exception}.
	 */
	public void writeOutputFile ( Collection < UserRequest > analyzedRequests,
			File outputFile, String format )
			throws UnsupportedEncodingException, FileNotFoundException,
			ExportingException;

	/**
	 * 
	 * �����, ����� ���� �� ���������� �� ����� �� �������� ������� � ������ ��
	 * ����������� ������.
	 * 
	 * @param analyzedRequests
	 *            �������� �� �����, ��������� ���������, ����� ������ ��
	 *            �������. ������� ���� �� ����������� � ������������ � ���
	 *            ������.
	 * @param outputFile
	 *            ���� ������ �� ������� ������������� ������.
	 * @param format
	 *            ������ � ����� �� ������� ���������.
	 * 
	 * @throws UnsupportedEncodingException
	 *             ��� ����������� Encoding �� �� ��������.
	 * @throws FileNotFoundException
	 *             ��� ����� �� ����������.
	 * @throws {@link ExportingException} ������ ����� �� ���� ��������, ��� ��
	 *         ����� �� ������ �� ����� �������� �������. �� �� ��� �� �������,
	 *         ��
	 *         ���� ������ � ��������� �� {@link RuntimeException}, � �� ��
	 *         {@link Exception}.
	 */
	public void writeOutputFile ( Map < String, UserRequest > analyzedRequests,
			File outputFile, String format )
			throws UnsupportedEncodingException, FileNotFoundException,
			ExportingException;
}
