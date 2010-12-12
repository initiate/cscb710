package bg.nbu.cscb710.aclp.util;

public final class Constants {

	public static final String UTF8_ENCODING = "UTF-8";

	public static final String NEW_LINE = System.getProperty ( "line.separator" );

	public static final String WHITESPACE_REGEX = "\\s";

	public static final String ACL_REGEX = "([\\d.]+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) (\\d+) \"([^\"]+)\" \"([^\"]+)\"";
}
