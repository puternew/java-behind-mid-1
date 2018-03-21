package exceptionproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static int countWords(String fileName) throws FileNotFoundException ,WrongWordException{
        //Scanner scKeyboard = new (Scanner.in);
        int numOfWords = 0;    
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            String word = scFile.next();
            System.out.println("word="+word);
            if (word.equalsIgnoreCase("your")) {
                throw new WrongWordException("your word is wrong");
            }
            numOfWords++;
        }System.out.println("------------countWords Working ..‼‼------------");
        return numOfWords;
    }
    //......................................................................................
        public static int countLine(String fileName) throws FileNotFoundException {
        //Scanner scKeyboard = new (Scanner.in);
        int numOfLine = 0;
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            System.out.println(scFile.nextLine()+"");
            
            numOfLine++;
        }System.out.println("------------countLine Working ..‼‼------------");
        return numOfLine;
    }   
  //-----------------------------------------------------------------------------------------      
        public static int countChar (String fileName) throws FileNotFoundException {
        //Scanner scKeyboard = new (Scanner.in);
        int numOfChar = 0;
        int i=0;
        Scanner scFile = new Scanner(new File(fileName));
        while (scFile.hasNext()) {
            System.out.println(scFile.next().charAt(i));
            
            numOfChar++;
        }System.out.println("------------countChar Working ..‼‼------------");
        return numOfChar;
    }

    
    public static void main(String[] args) {
            int wordCount =-1;
            int lineCount =-1;
        try {
            wordCount = countWords("words.txt");
            lineCount = countLine("words.txt");
            int charCount = countChar("words.txt");
            System.out.println("Is "+wordCount+" word");
            System.out.println("Is "+lineCount+" line");
            System.out.println("Is "+charCount+" char");
        } 
        catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        }
         catch (WrongWordException ww) {
            System.out.println(ww);
        }
    }
}
