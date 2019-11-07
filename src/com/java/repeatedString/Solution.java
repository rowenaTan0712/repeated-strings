package com.java.repeatedString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	String req = s.toLowerCase();
    	char array[] = req.toCharArray();
    	int arrayLength = array.length;
    	int excess = (int) (n % arrayLength);
    	long wholeNum =  n / arrayLength;
    	
    	int additional = 0;
    	for(int a=0; a < excess; a++) {
    		if(array[a] == 'a') {
    			additional++;
    		}
    	}
    	
    	Arrays.sort(array);
    	int ac = 0;
    	for(int x=0; x < arrayLength; x++) {
    		if(array[x] == 'a') {
    			ac++;
    		}else {
    			break;
    		}
    	}
    	
    	if(wholeNum < 0) {
    		wholeNum = n;
    	}
    	
    	long count = ac * wholeNum + additional;
    	
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        
        System.out.println("result : "+ result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
