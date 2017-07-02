import java.net.*;
import java.io.*;
//import IO;

public class ntest1{
    static String charset = java.nio.charset.StandardCharsets.UTF_8.name();
    public static void main(String[] args) {
        String url = "https://screeps.com/api/game/time";
          // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
        //String param1 = "value1";
        //String param2 = "value2";


        String query = "";/*String.format("param1=%s&param2=%s",
        URLEncoder.encode(param1, charset),
        URLEncoder.encode(param2, charset));*/
        IO.print("email");
        String user = IO.inString();
        IO.print("pass");
        String pass = IO.inString();
        authenticate(user, pass);

    }

    static String authenticate(String user, String pass){
        post("https://screeps.com/api/auth/signin", );
        return "";
    }

    static void post(String url, String query){
        URLConnection connection = null;
        try{
            connection = new URL(url).openConnection();
        }catch(Exception e){
            IO.print("f"+e.toString());
        }
        connection.setDoOutput(true); // Triggers POST.
        connection.setRequestProperty("Accept-Charset", charset);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

        try (OutputStream output = connection.getOutputStream()) {
            output.write(query.getBytes(charset));
        }catch(Exception e){
            IO.print("f"+e.toString());
        }
        try{
            InputStream response = connection.getInputStream();
            IO.print(toJSON(response));
        }catch(Exception e){
            IO.print("f"+e.toString());
        }

    }


    static void get(String url, String query){
        try{
            URLConnection connection = new URL(url + "?" + query).openConnection();
            connection.setRequestProperty("Accept-Charset", charset);
            InputStream response = connection.getInputStream();

            int ch = response.read();
            String output = "";
            while(ch != -1){
                output += (char)ch;
                ch = response.read();
            }

            IO.print(output);
        }catch(Exception e){
            IO.print("you fucked up: "+e.toString());
        }
    }

    static String toJSON(InputStream in){
        String output = "";
        try{
            int ch = in.read();
            while(ch != -1){
                output += (char)ch;
                ch = in.read();
            }
        }catch(IOException e){}
        return output;
    }
}
