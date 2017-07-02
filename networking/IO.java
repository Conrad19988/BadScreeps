import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

public class IO
{
   /*
      SUBMODULE: inputInt
      IMPORTS:NA
      EXPORTS:the integer from the user
      PURPOSE:get the next integer inputed to the terminal
   */
   public static int inInt()
   {
      int myValue = 0;
      boolean done = false;
      while(!done){
         try{
            Scanner sc = new Scanner(System.in);
            myValue = sc.nextInt();
            done = true;
         }catch(InputMismatchException e){
            print("thats not the correct type");
         }
      }
      return myValue;
   }

   /*
      SUBMODULE: inputDouble
      IMPORTS:NA
      EXPORTS:the double from the user
      PURPOSE:get the next double inputed to the terminal
   */
   public static double inDouble()
   {
      double myValue = 0;
      boolean done = false;
      while(!done){
         try{
            Scanner sc = new Scanner(System.in);
            myValue = sc.nextDouble();
            done = true;
         }catch(InputMismatchException e){
            print("thats not the correct type");
         }
      }
      return myValue;
   }

   public static float inFloat()
   {
      float myValue = 0;
      boolean done = false;
      while(!done){
         try{
            Scanner sc = new Scanner(System.in);
            myValue = sc.nextFloat();
            done = true;
         }catch(InputMismatchException e){
            print("thats not the correct type");
         }
      }
      return myValue;
   }

   /*
      SUBMODULE: inputChar
      IMPORTS:NA
      EXPORTS:the double from the user
      PURPOSE:get the next double inputed to the terminal
   */
   public static char inChar()
   {
      Scanner sc = new Scanner(System.in);
      return sc.next().charAt(0);
   }

   public static String inString()
   {
      Scanner sc = new Scanner(System.in);
      return sc.nextLine();
   }

   public static void print(String outString)
   {
      System.out.println(outString);
   }

   /*public static DSALinkedList<DSALinkedList<String>> getCSV(String inFileName){
       return tokeniseLines(getLines(inFileName));
   }

   public static DSALinkedList<String> getLines(String inFileName)
   {
      //int linesInFile = numOfLines(inFileName);
      DSALinkedList<String> lines = new DSALinkedList<String>();

      FileInputStream fileStrm = null;
      InputStreamReader rdr;
      BufferedReader bufRdr;
      try {
         fileStrm = new FileInputStream(inFileName);//Open the file
         rdr = new InputStreamReader(fileStrm);//Create a reader to read the stream
         bufRdr = new BufferedReader(rdr);//To read the stream one line at a time
         String line = bufRdr.readLine();
         while(line!=null) {
             lines.insertLast(line);
             line = bufRdr.readLine();//Read the next line
         }
         fileStrm.close();//Clean up the stream
      }
      catch (IOException e) {//MUST catch IOExceptions
         if (fileStrm != null) {//Clean up the stream if it was opened
            try { fileStrm.close(); } catch (IOException ex2) { } // We canâ€™t do anything more!
         }
         System.out.println("Error in file processing: " + e.getMessage());//Or do a throw
      }
      return lines;
   }

      public static DSALinkedList<DSALinkedList<String>> tokeniseLines(DSALinkedList<String> lines){
          DSALinkedList<DSALinkedList<String>> tokenisedLines = new DSALinkedList<DSALinkedList<String>>();
          while(!lines.isEmpty()){
              tokenisedLines.insertLast(tokeniseLine(lines.removeFirst()));//steps through tokenising lines
          }
          return tokenisedLines;
      }

      public static DSALinkedList<String> tokeniseLine(String line){
          DSALinkedList<String> tokenisedLine = new DSALinkedList<String>();
          for (String token : line.split(",")) {//splits the line into a lonked list containing each csv
              tokenisedLine.insertLast(token);
          }
          return tokenisedLine;
      }

   public static boolean isFileEmpty(String fileName)
   {
      boolean isEmpty = false;
      FileInputStream fileStrm = null;
      InputStreamReader rdr;
      try {
         fileStrm = new FileInputStream(fileName);//Open the file
         rdr = new InputStreamReader(fileStrm);//Create a reader to read the stream
         if(rdr.read()== -1)
         {
            isEmpty = true;
         }
         fileStrm.close();//Clean up the stream
      }
      catch (IOException e) {//MUST catch IOExceptions
         if (fileStrm != null) {//Clean up the stream if it was opened
            try { fileStrm.close(); } catch (IOException ex2) { } // We canâ€™t do anything more!
         }
         System.out.println("Error in file processing: " + e.getMessage());//Or do a throw
      }
      return isEmpty;
   }



   public static String getFromLine(int whichThing, String csvRow)
   {
      String token = "";
      StringTokenizer strTok;
      strTok = new StringTokenizer(csvRow, ",");//Initialise tokenizer to parse the csvRow
      for (int i = 0; i<=whichThing; i++) {
         token = strTok.nextToken();
      }
      return token;
  }*/


   public static void saveToFile(String name, String output)
   {
      try{
      FileWriter myFile = new FileWriter(name);
      myFile.write(output);
      myFile.close();
      }
      catch(IOException e){
         print("File handling failed");
      }
   }
}
