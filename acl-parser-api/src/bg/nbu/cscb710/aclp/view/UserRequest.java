package bg.nbu.cscb710.aclp.view;

/**
 * Клас, представящ единична заявка от потребител.
 * 
 * <p>
 * Атрибутите са достъпни, чрез съответните им {@code getXXX()}
 * методи. Класът не предоставя {@code setXXX()} методи, тъй като
 * веднъж изпратена заявката не може да бъде променяна.
 * </p>
 * 
 * @param <code>String</code> <b>ipAddress</b>
 *            адреса от който е направена заявката.
 * @param <code>String</code> <b>available</b>
 *            достъпен ли е търсения ресурс.
 * @param <code>String</code> <b>userId</b>
 *            името на потребителя, направил заявката.
 * @param {@link RequestTimestamp} <b>timestamp</b>
 *            точно време на обслужване на заявката.
 * @param {@link RequestAttributes} attributes атрибути на търсения ресурс.
 * @param <code>String</code> <b>statusCode</b>
 *            код върнат на клиента.
 * @param <code>short</code> <b>size</b>
 *            размер на заявката.
 * @param <code>String</code> <b>referer</b>
 *            място от където е дошъл клиента.
 * @param <code>String</code> <b>userAgent</b>
 *            описание на браузъра направил заявката.
 *
 * @author Георги Николов
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
	 * Конструктор на заявки.
	 * Приема параметри в поредността им в Apache Combined Log.
	 * 
	 * @param ipAddress
	 *            адреса от който е направена заявката.
	 * @param available
	 *            достъпен ли е търсения ресурс.
	 * @param userId
	 *            името на потребителя, направил заявката.
	 * @param timestamp
	 *            точно време на обслужване на заявката.
	 * @param {@link RequestAttributes} attributes атрибути на търсения ресурс.
	 * @param statusCode
	 *            код върнат на клиента.
	 * @param size
	 *            размер на заявката.
	 * @param referer
	 *            място от където е дошъл клиента.
	 * @param userAgent
	 *            описание на браузъра направил заявката.
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
