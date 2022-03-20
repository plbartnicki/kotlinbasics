package integrationwithjava;

public class Logger
{
	public static void logMessage(LogType logType, String message ) {
		System.out.println(String.format("%s %s", logType, message));
	}
}
