import java.util.Scanner;
public class TemperatureConversion
	{

		public static void main(String[] args)
			{	
					{
						Scanner userInput = new Scanner (System.in);
						System.out.println("Which way would you like to convert?");
						System.out.println("1. Celsius to Farenheit");
						System.out.println("2. Farenheit to Celsius");
						int choice = userInput.nextInt();
						if (choice==1)
							{
								System.out.println("What is the temperature in Celsius?");
								double celsiustemperature = userInput.nextInt();
								double celsiusConversion =((celsiustemperature*9/5)+32 ) ;
								System.out.println(+celsiustemperature+" in Celsius is "+celsiusConversion+".");
							}
							
						else if (choice==2)
						{
						System.out.println("What is the temperature in Farenheit?");
						double farenheittemperature = userInput.nextInt();
						double farenheitConversion = ((farenheittemperature)-32)*5/9;
						System.out.println(+farenheittemperature+" in Celsius is "+farenheitConversion+".");
							}
						else
							{
								System.out.println("I only gave you 2 options and you messed it up.");
							}
					}
						}
					}
