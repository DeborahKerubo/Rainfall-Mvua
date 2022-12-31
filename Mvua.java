import java.util.Scanner;
public class Mvua
{

public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);

double[] monthlyRain= new double[12]; // Array to hold the rain


double totalRainfall, monthlyRainfall;
int maxRain, minRain;

for(int i = 0; i < 12; i++)
 {
  initRain((i + 1));
 monthlyRain[i] = keyboard.nextDouble();
//input validation
while(monthlyRain[i] < 0)
{
System.out.println("Enter a positive value");
initRain((i + 1));
monthlyRain[i] = keyboard.nextDouble();
}
}


 totalRainfall = totalRain(monthlyRain);
System.out.printf("The total rainfall for this year is %.2f:\n",(totalRainfall));

monthlyRainfall = averageRain(totalRainfall);
System.out.printf("The average rainfall for this year is %.2f:\n",(monthlyRainfall));

maxRain = mostRain(monthlyRain);
System.out.println("The month with the highest amount of rain is "+ (maxRain + 1));

minRain = leastRain(monthlyRain);
System.out.println("The month with the lowest amount of rain is "+ (minRain + 1));
}


public static void initRain(int month)
{
System.out.print("Enter rain fall for month " + month + ": ");
}


/**
Finds out the total amount of rain
*/

public static double totalRain(double[] rain)
{
double totalRain = 0;
int start = 0;

for(start = 0;start < 12; start++)
totalRain = rain[start] + totalRain;

return totalRain;
}


/**
Finds out the average rain in a month
*/

public static double averageRain(double rainfall)
{
double average;

average = rainfall / 12;

return average;
}


/**
Get the character that is in the position of string1
*/

public static int mostRain(double[] rainfall)
{
int pos = 0; // int []maxi  = new int [12];
//int highest= maxi[0];


for(int start = 0; start < 12; start++)
{
if (rainfall[start] > rainfall[pos]) 
pos = start;                             
else if (rainfall[start] == rainfall[pos])
pos = start;
else if (rainfall[start] < rainfall[pos])
continue;
}

return pos;// return higest;
}


/**
Get the character that is in the position of string1
*/

public static int leastRain(double[] rainfall)
{
int pos = 0;
int start = 0;

for(start = 0; start < 12; start++)
{
if (rainfall[start] < rainfall[pos])
pos = start;
else if (rainfall[start] == rainfall[pos])
pos = start;
else if (rainfall[start] > rainfall[pos])
continue;
}

return pos;
}

}

