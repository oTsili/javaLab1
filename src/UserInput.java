import java.io.*;
class UserInput { //Class gia eisagogi dedomenwn apo to pliktrologio
    public static String getString(String prompt)  { //Methodos gia eisagogi String

        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line=br.readLine();
            return line;
        }
        catch(Exception e) {
            return "Exception - Lathos";
        }
    }
    public static int getInteger(String prompt) { //Methodos gia eisagogi Integer
        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line=br.readLine();
            int i=Integer.parseInt(line);
            return i;
        }
        catch(Exception e) {
            return -1;
        }
    }
    public static short getShort(String prompt) { //Methodos gia eisagogi short
        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            short i = Short.parseShort(line);
            return i;
        }
        catch(Exception e) {
            return (short)-1;
        }
    }
    public static long getLong(String prompt) { //Methodos gia eisagogi long
        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            long i = Long.parseLong(line);
            return i;
        }
        catch(Exception e) {
            return -1L;
        }
    }
    public static float getFloat(String prompt) { //Methodos gia eisagogi Float
        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            float f = Float.parseFloat(line);
            return f;
        }
        catch(Exception e) {
            return -1f;
        }
    }
    public static double getDouble(String prompt) { //Methodos gia eisagogi Double
        System.out.print(prompt + ": ");
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            double d = Double.parseDouble(line);
            return d;
        }
        catch(Exception e) {
            return -1.0;
        }
    }
}