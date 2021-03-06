package com.assign.three;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
	static Random random;
	static ArrayList<Integer> hiddenIndices;
	static HashMap<String, HashSet<Integer>> map=new HashMap<String, HashSet<Integer>>();
	static int totalChance;
	static String word;
	static String hiddenWord;
	static String remainWord;
	static HashSet<Integer> temp;

	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		word=getRandomWord();
//		System.out.println(word);
		hiddenWord=hideLetters(word);
		remainWord=hiddenWord;
		totalChance=hiddenIndices.size()+1;

		
		while(totalChance>0){
			clearScreen();
			
			if(!remainWord.contains("_"))
			{
				showYouWonUI();
				break;
			}
				
			
			showUI();
			String c =in.next();
			if(c.length()!=1){
				System.err.println("Only one character is allowed.");
			}
			else{
				guess(c);
			}
			totalChance--;
			
			if(totalChance==0){
				showYouLoseUI();
				break;
			}
		}
		
		

	}
	public static void clearScreen() {  
	    //TODO write clear screen code..
		System.out.println("\n\n\n\n\n");
	}  
	
	private static void showYouLoseUI() {
		System.out.println("-------------Hangman Game-------------");
		System.out.println(String.format("\n%20s","You lose!!!! "));
		System.out.println(String.format("\n%20s","Better Luck Next Time... :("));
		System.out.println(String.format("\n%20s","it's \""+word+"\""));
		System.out.println("\n");
		System.out.println("------------------------------------- ");
		clearScreen();
		
	}

	private static void showYouWonUI() {
		System.out.println("-------------Hangman Game-------------");
		System.out.println(String.format("\n%20s","You Won!!!! "));
		System.out.println(String.format("\n%20s","Congratulations... :)"));
		System.out.println("\n");
		System.out.println("------------------------------------- ");
		clearScreen();
		
	}
	
	
	static void guess(String s){
		if(map.keySet().contains(s)){
//			System.out.println(map.get(s));
			for(Integer i:map.get(s)){				
				remainWord=(new StringBuilder(remainWord).replace(i, i+1, s)).toString();
//				System.out.println(i);
			}
			
		}
	}
	static void showUI(){
		System.out.println("-------------Hangman Game-------------");
		System.out.println(String.format("\n%20s","Chances : ")+totalChance);
		System.out.println(String.format("\n%20s",remainWord));
		System.out.println("\n");
		System.out.println("Your Guessed Letter : ");
		clearScreen();
	}
	private static String hideLetters(String word) {
		int toHide=word.length()/2;
		ArrayList<Integer> indices=new ArrayList<Integer>();
		while(indices.size()!=toHide){
			random=new Random();
			Integer i=Integer.valueOf(random.nextInt(word.length()));
			if(!indices.contains(i)){
				indices.add(i);
			}		
			
		}
		String hiddenWord=word;
		hiddenIndices=indices;
		for(Integer i:indices){
			char ch=word.charAt(i.intValue());
//			System.out.println(i+" "+ch);
			
			temp=map.getOrDefault(""+ch, new HashSet<Integer>());
			
			for(int q=0;q<word.length();q++)
				if(word.charAt(q)==ch)
					temp.add(q);			
			
			
			temp.add(i);
			map.put(""+ch,temp);			
			
			
			hiddenWord=hiddenWord.replace(ch,'_');		
		}
		return hiddenWord;
		
	}

	public static String getRandomWord() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("H:/Users/aman_gupta1/Downloads/words.txt"));
		ArrayList<String> arr=new ArrayList<String>();
		String line;
		while((line=br.readLine())!=null){
			arr.add(line);
		}
		
		random=new Random();
		return arr.get(random.nextInt(arr.size()));	
		
	}

}


