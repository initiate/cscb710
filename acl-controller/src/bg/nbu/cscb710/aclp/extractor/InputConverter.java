package bg.nbu.cscb710.aclp.extractor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.nbu.cscb710.aclp.controller.Converter;
import bg.nbu.cscb710.aclp.controller.exception.MalformedRowFormatException;
import bg.nbu.cscb710.aclp.util.Constants;
import bg.nbu.cscb710.aclp.view.RequestAttributes;
import bg.nbu.cscb710.aclp.view.RequestTimestamp;
import bg.nbu.cscb710.aclp.view.UserRequest;

public class InputConverter implements Converter {

	@ Override
	public List < UserRequest > convert ( String inputData )
			throws MalformedRowFormatException {
		UserRequest request;
		List < UserRequest > requests = new ArrayList < UserRequest > ( );

		String[] lines = inputData.split ( Constants.NEW_LINE );

		for ( int i = 0; i < lines.length; i++ ) {
			Pattern p = Pattern.compile ( Constants.ACL_REGEX );
			Matcher matcher = p.matcher ( lines[i] );

			if ( matcher.matches ( ) ) {
				String ipAddress = matcher.group ( 1 );
				String available = matcher.group ( 2 );
				String userId = matcher.group ( 3 );
				RequestTimestamp timestamp = extractTimestamp ( matcher
						.group ( 4 ) );
				RequestAttributes attributes = extractRequestAttributes ( matcher
						.group ( 5 ) );
				short statusCode = Short.parseShort ( ( matcher.group ( 6 ) ) );
				String size = matcher.group ( 7 );
				String referer = matcher.group ( 8 );
				String userAgent = matcher.group ( 9 );
				request = new UserRequest ( ipAddress, available, userId,
						timestamp, attributes, statusCode, size, referer,
						userAgent );

				requests.add ( request );
			} else {
				throw new MalformedRowFormatException (
						"Възникна грешка при извличане на информация от ред номер "
								+ i
								+ "! Най-вероятно формата на този ред е грешен." );
			}
		}

		return requests;
	}

	private RequestTimestamp extractTimestamp ( String group ) {
		String[] dayMonth = group.split ( "/" );
		String[] yearAndTime = dayMonth[2].split ( " " );
		String[] chunks = yearAndTime[0].split ( ":" );

		byte day = Byte.parseByte ( dayMonth[0] );
		String month = dayMonth[1];
		short year = Short.parseShort ( chunks[0] );
		byte hours = Byte.parseByte ( chunks[1] );
		byte minutes = Byte.parseByte ( chunks[2] );
		byte seconds = Byte.parseByte ( chunks[3] );
		String timeZone = yearAndTime[1];

		return new RequestTimestamp ( day, month, year, hours, minutes,
				seconds, timeZone );
	}

	private RequestAttributes extractRequestAttributes ( String group ) {
		String[] attributes = group.split ( " " );
		String method = attributes[0];
		String resource = attributes[1];
		String protocol = attributes[2];

		return new RequestAttributes ( method, resource, protocol );
	}
}
