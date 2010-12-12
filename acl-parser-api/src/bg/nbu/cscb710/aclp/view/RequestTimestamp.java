package bg.nbu.cscb710.aclp.view;

/**
 * Клас, който описва точното време по което една заявка е направена.
 * 
 * @author Георги Николов
 */
public final class RequestTimestamp {

	private byte day;
	private String month;
	private short year;
	private byte hours;
	private byte minutes;
	private byte seconds;
	private String timeZone;

	public RequestTimestamp ( byte day, String month, short year, byte hours,
			byte minutes, byte seconds, String timeZone ) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.timeZone = timeZone;

	}

	public byte getDay ( ) {
		return day;
	}

	public String getMonth ( ) {
		return month;
	}

	public short getYear ( ) {
		return year;
	}

	public byte getHours ( ) {
		return hours;
	}

	public byte getMinutes ( ) {
		return minutes;
	}

	public byte getSeconds ( ) {
		return seconds;
	}

	public String getTimeZone ( ) {
		return timeZone;
	}
}
