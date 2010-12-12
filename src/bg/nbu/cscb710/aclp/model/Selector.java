package bg.nbu.cscb710.aclp.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * ���������, ����������� ������ �� ���������� �� ������ ������ �������� ��
 * ����������� �������.
 * 
 * @author ������ �������
 */
public interface Selector {

	/**
	 * �����, ����� ������ ������� ������� �� ��������.
	 * 
	 * @param requests
	 *            ������ ��������� ������.
	 * @return {@link Map} � ���� ����� �� ���������� � ����������� �� �����
	 *         ������ ���������� � ���� ��������.
	 */
	public Map < String, UserRequest > getTopCampaigns (
			Collection < UserRequest > requests );

	/**
	 * �����, ����� �������� ������� ���-����� ��������� ����������� ��
	 * ��������.
	 * 
	 * @param requests
	 *            ������ ��������� ������.
	 * @return {@link Map} � ���� ��� �� ����������� � ����������� �� �����
	 *         ������ ���������� � ���� �����������.
	 */
	public Map < String, UserRequest > getTopProducts (
			Collection < UserRequest > requests );

	/**
	 * �����, ����� �������� �������� �� ��������� � ������ ����� ���-�������
	 * �������� �� ����� ���������.
	 * 
	 * @param requests
	 *            ������ ��������� ������.
	 * @return {@link Map} � ���� ����� �� ����������� � �������� �� ������ �
	 *         ����� ���-������� �������� �� ���� ���������.
	 */
	public Map < String, List < UserRequest > > getTopCategories (
			Collection < UserRequest > requests );
}
