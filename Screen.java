public class Screen
{
	public static final Point MESSAGE = new Point(25,0);

	public static void clear()
	{
		System.out.print("\033[1;1H\033[2J");
	}

	public static void clearLine(Point locat)
	{
		Screen.set(locat);
		System.out.print("\033[2K");
	}

	public static void saveAndClear()
	{
		System.out.print("\033[?47h");
	}

	public static void restore()
	{
		System.out.print("\033[?47l");
	}

	public static void set(Point locat)
	{
		System.out.printf("\033[%d;%dH",locat.v,locat.h);
	}

	public static void printat(Point locat, char c)
	{
		Screen.set(locat);
		System.out.write(c);
	}

	public static void color(char c)
	{
		switch(c) {
		case '@': System.out.print("\033[31m@\033[0m");		break;
		case '?': System.out.print("\033[1;33m?\033[0m");	break;
		default:  System.out.write(c);
		}
	}
}
