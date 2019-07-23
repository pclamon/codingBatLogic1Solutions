package com.company;

public class Main
{

    public static void main(String[] args)
    {

    }

    public boolean cigarParty(int cigars, boolean isWeekend)
    {
        boolean success = false;

        if (cigars >= 40 && (cigars <= 60 || isWeekend))
        {
            success = true;
        }

        return success;
    }

    public int dateFashion(int you, int date)
    {
        if (you <= 2 || date <= 2)
        {
            return 0;
        }
        else if (you >= 8 || date >= 8)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        if (isSummer)
        {
            if (temp >= 60 && temp <= 100)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (temp >= 60 && temp <= 90)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday)
    {
        if (isBirthday)
        {
            speed = speed - 5;
        }

        if (speed <= 60)
        {
            return 0;

        }
        else if ((speed > 60) && (speed <= 80))
        {
            return 1;

        }
        else
        {
            return 2;

        }

    }

    public int sortaSum(int a, int b)
    {
        int sum = a + b;

        if (sum >= 10 && sum <= 19)
        {
            return 20;
        }

        return sum;
    }

    public String alarmClock(int day, boolean vacation)
    {
        if (!(vacation))
        {
            if ((day == 0) || (day == 6))
            {
                return "10:00";
            }
            else
            {
                return "7:00";
            }
        }
        else
        {
            if ((day == 0) || (day == 6))
            {
                return "off";
            }
            else
            {
                return "10:00";
            }
        }
    }

    public boolean love6(int a, int b)
    {
        int sum = a + b;
        int dif = Math.abs(a - b);

        if (a == 6 || b == 6 || sum == 6 || dif == 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean in1To10(int n, boolean outsideMode)
    {
        if (!(outsideMode))
        {
            if (n >= 1 && n <= 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (n <= 1 || n >= 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public boolean specialEleven(int n)
    {
        int div11 = n % 11;

        if (div11 == 0 || div11 == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean more20(int n)
    {
        int div20 = n % 20;

        if (div20 == 1 || div20 == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean old35(int n)
    {
        boolean isMultipleButNotBoth = false;

        int div3 = n % 3;
        int div5 = n % 5;

        if (div3 == 0 && div5 == 0)
        {
            isMultipleButNotBoth = false;
        }
        else if (div3 == 0 || div5 == 0)
        {
            isMultipleButNotBoth = true;
        }
        else
        {
            isMultipleButNotBoth = false;
        }
        return isMultipleButNotBoth;
    }

    public boolean less20(int n)
    {
        int div20 = n % 20;

        if (div20 == 19 || div20 == 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean nearTen(int num)
    {
        int div10 = num % 10;

        if (div10 <= 2 || div10 >= 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int teenSum(int a, int b)
    {
        int sum = a + b;

        if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
        {
            return 19;
        }
        else
        {
            return sum;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        boolean answer = true;

        if (isAsleep || isMorning && !isMom)
        {
            answer = false;
        }
        else
        {
            answer = true;
        }

        return answer;
    }

    public int teaParty(int tea, int candy)
    {
        int dblTea = 2 * tea;
        int dblCandy = 2 * candy;

        if (tea < 5 || candy < 5)
        {
            return 0;
        }
        else if (tea >= (dblCandy) || candy >= (dblTea))
        {
            return 2;
        }
        else if (tea >= 5 && candy >= 5)
        {
            return 1;
        }
        return 1;
    }

    public String fizzString(String str)
    {
        if (str.startsWith("f") && str.endsWith("b"))
        {
            return "FizzBuzz";
        }
        else if (str.startsWith("f"))
        {
            return "Fizz";
        }
        else if (str.endsWith("b"))
        {
            return "Buzz";
        }
        else
        {
            return str;
        }
    }

    public String fizzString2(int n)
    {
        int div3 = n % 3;
        int div5 = n % 5;
        String str = "i";

        if (div3 == 0 && div5 == 0)
        {
            return "FizzBuzz!";
        }
        else if (div3 == 0)
        {
            return "Fizz!";
        }
        else if (div5 == 0)
        {
            return "Buzz!";
        }
        else
        {
            return n + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c)
    {
        if (a + b == c || b + c == a || a + c == b)
        {
            return true;
        }
        return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        boolean inOrder = false;

        if (!bOk)
        {
            if (b > a && c > b)
            {
                inOrder = true;
            }
            else
            {
                inOrder = false;
            }
        }
        else if (bOk)
        {
            if (c > b)
            {
                inOrder = true;
            }
            else
            {
                inOrder = false;
            }
        }
        else
        {
            inOrder = false;
        }

        return inOrder;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        if (!equalOk)
        {
            if (a < b && b < c)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (equalOk)
        {
            if ((a < b || a == b) && (b < c || b == c))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean lastDigit(int a, int b, int c)
    {
        if ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10))
        {
            return true;
        }
        return false;
    }

    public boolean lessBy10(int a, int b, int c)
    {
        int a10 = a + 10;
        int b10 = b + 10;
        int c10 = c + 10;

        if ((a10 <= b) || (a10 <= c) || (b10 <= a) || (b10 <= c) || (c10 <= a) || (c10 <= b))
        {
            return true;
        }
        return false;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        int sum = die1 + die2;
        int die3 = die1 + 1;
        int rollover = 1;
        int sum2 = die3 + die2;
        int sum3 = rollover + die2;

        if (noDoubles && die1 == die2)
        {
            if (die1 == 6)
            {
                return sum3;
            }
            return sum2;
        }
        return sum;
    }

    public int maxMod5(int a, int b)
    {
        if (a == b)
        {
            return 0;
        }
        else if (a % 5 == b % 5)
        {
            if (a < b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public int redTicket(int a, int b, int c)
    {
        if (a == 2 && b == 2 && c == 2)
        {
            return 10;
        }
        else if (a != b && a != c)
        {
            return 1;
        }
        else if (a == b && b == c)
        {
            return 5;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c)
    {
        if (a == b && b == c)
        {
            return 20;
        }
        else if (a == b || b == c || a == c)
        {
            return 10;
        }
        else
        {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c)
    {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)
        {
            return 10;
        }
        else if (ab == 10 + bc || ab == 10 + ac)
        {
            return 5;
        }
        return 0;
    }

    public boolean shareDigit(int a, int b)
    {
        int leftDigita = a / 10;
        int rightDigita = a % 10;
        int leftDigitb = b / 10;
        int rightDigitb = b % 10;

        if (leftDigita == leftDigitb || leftDigita == rightDigitb || rightDigita == rightDigitb || rightDigita == leftDigitb)
        {
            return true;
        }
        return false;
    }

    public int sumLimit(int a, int b)
    {
        int sum = a + b;
        String sumDigits = String.valueOf(sum);
        String aDigits = String.valueOf(a);

        if (sumDigits.length() == aDigits.length())
        {
            return sum;
        }
        else if (sumDigits.length() > aDigits.length())
        {
            return a;
        }
        return sum;
    }
}
