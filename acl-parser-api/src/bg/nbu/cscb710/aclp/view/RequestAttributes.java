package bg.nbu.cscb710.aclp.view;

/**
 * ����, ����� ������ ���������� �� ���� ������.
 * ������� ���������� �� HTTP ������ �� ����� � ��������� ��������, ����� ��
 * �������� ������ �� �����������, ������ � �������� �� ����� � ���������
 * ��������.
 * 
 * @author ������ �������
 */
public final class RequestAttributes {

	private String method;
	private String resource;
	private String protocol;

	/**
	 * ����������� �� �������� �� ������.
	 * 
	 * @param method
	 *            HTTP �����.
	 * @param resource
	 *            �������� ������.
	 * @param protocol
	 *            ��������/������, �� ����� � ��������� ��������.
	 */
	public RequestAttributes ( String method, String resource, String protocol ) {
		this.method = method;
		this.resource = resource;
		this.protocol = protocol;
	}

	/**
	 * @return
	 */
	public String getMethod ( ) {
		return method;
	}

	/**
	 * @return
	 */
	public String getResource ( ) {
		return resource;
	}

	/**
	 * @return
	 */
	public String getProtocol ( ) {
		return protocol;
	}

	/**
	 * @param method
	 */
	public void setMethod ( String method ) {
		this.method = method;
	}

	/**
	 * @param resource
	 */
	public void setResource ( String resource ) {
		this.resource = resource;
	}

	/**
	 * @param protocol
	 */
	public void setProtocol ( String protocol ) {
		this.protocol = protocol;
	}
}
