package Cicli;

public class Calendar {

    static String Zellercongruence(int day, int month, int year) {
        String ret = "";
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h) {
            case 0:
                ret = ("Saturday");
                break;
            case 1:
                ret = ("Sunday");
                break;
            case 2:
               ret = ("Monday");
                break;
            case 3:
                ret = ("Tuesday");
                break;
            case 4:
                ret = ("Wednesday");
                break;
            case 5:
                ret = ("Thursday");
                break;
            case 6:
                ret = ("Friday");
                break;
        }
       return ret; 
    }
}


