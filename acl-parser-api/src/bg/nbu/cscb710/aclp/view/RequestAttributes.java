package bg.nbu.cscb710.aclp.view;

/**
 * Клас, който описва атрибутите на една заявка.
 * Съдържа информация за HTTP метода по който е направена заявката, името на
 * търсения ресурс от потребителя, версия и протокол по който е направена
 * заявката.
 * 
 * @author Георги Николов
 */
public final class RequestAttributes {

	private String method;
	private String resource;
	private String protocol;

	/**
	 * Конструктор на атрибути на заявки.
	 * 
	 * @param method
	 *            HTTP метод.
	 * @param resource
	 *            заявения ресурс.
	 * @param protocol
	 *            протокол/версия, по който е направена заявката.
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
