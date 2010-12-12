package bg.nbu.cscb710.aclp.view;

/**
 * ����, ���������� �������� ������ �� ����������.
 * 
 * <p>
 * ���������� �� ��������, ���� ����������� �� {@code getXXX()}
 * ������. ������ �� ���������� {@code setXXX()} ������, ��� ����
 * ������ ��������� �������� �� ���� �� ���� ���������.
 * </p>
 * 
 * @param <code>String</code> <b>ipAddress</b>
 *            ������ �� ����� � ��������� ��������.
 * @param <code>String</code> <b>available</b>
 *            �������� �� � �������� ������.
 * @param <code>String</code> <b>userId</b>
 *            ����� �� �����������, �������� ��������.
 * @param {@link RequestTimestamp} <b>timestamp</b>
 *            ����� ����� �� ���������� �� ��������.
 * @param {@link RequestAttributes} attributes �������� �� �������� ������.
 * @param <code>String</code> <b>statusCode</b>
 *            ��� ������ �� �������.
 * @param <code>short</code> <b>size</b>
 *            ������ �� ��������.
 * @param <code>String</code> <b>referer</b>
 *            ����� �� ������ � ����� �������.
 * @param <code>String</code> <b>userAgent</b>
 *            �������� �� �������� �������� ��������.
 *
 * @author ������ �������
 */
public final class UserRequest {

	private String ipAddress;
	private String available;
	private String userId;
	private RequestTimestamp timestamp;
	private RequestAttributes attributes;
	private short statusCode;
	private String size;
	private String referer;
	private String userAgent;

	/**
	 * ����������� �� ������.
	 * ������ ��������� � ����������� �� � Apache Combined Log.
	 * 
	 * @param ipAddress
	 *            ������ �� ����� � ��������� ��������.
	 * @param available
	 *            �������� �� � �������� ������.
	 * @param userId
	 *            ����� �� �����������, �������� ��������.
	 * @param timestamp
	 *            ����� ����� �� ���������� �� ��������.
	 * @param {@link RequestAttributes} attributes �������� �� �������� ������.
	 * @param statusCode
	 *            ��� ������ �� �������.
	 * @param size
	 *            ������ �� ��������.
	 * @param referer
	 *            ����� �� ������ � ����� �������.
	 * @param userAgent
	 *            �������� �� �������� �������� ��������.
	 */
	public UserRequest ( String ipAddress, String available, String userId,
			RequestTimestamp timestamp, RequestAttributes attributes,
			short statusCode, String size, String referer, String userAgent ) {
		this.ipAddress = ipAddress;
		this.available = available;
		this.userId = userId;
		this.timestamp = timestamp;
		this.attributes = attributes;
		this.statusCode = statusCode;
		this.size = size;
		this.referer = referer;
		this.userAgent = userAgent;
	}

	/**
	 * @return
	 */
	public String getIpAddress ( ) {
		return ipAddress;
	}

	/**
	 * @return
	 */
	public String getAvailable ( ) {
		return available;
	}

	/**
	 * @return
	 */
	public String getUserId ( ) {
		return userId;
	}

	/**
	 * @return
	 */
	public RequestTimestamp getTimestamp ( ) {
		return timestamp;
	}

	/**
	 * @return
	 */
	public RequestAttributes getAttributes ( ) {
		return attributes;
	}

	/**
	 * @return
	 */
	public short getStatusCode ( ) {
		return statusCode;
	}

	/**
	 * @return
	 */
	public String getSize ( ) {
		return size;
	}

	/**
	 * @return
	 */
	public String getReferer ( ) {
		return referer;
	}

	/**
	 * @return
	 */
	public String getUserAgent ( ) {
		return userAgent;
	}
}
