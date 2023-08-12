package com.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CSVKredos {
	

	public static void main(String[] args) {
		
	
	String filePath = "C:\\Users\\vamsh\\Downloads\\kredos sheets\\manualinput.csv";

	List<String> Creditclass = Arrays.asList("a", "b", "c", "d", "e", "f", "1", "2", "3", "4", "5", "6");
	List<String> RiskProfile = Arrays.asList("301", "302", "303", "304", "305", "306", "307", "110", "111", "112",
			"113", "114", "115", "116");
	List<String> State = Arrays.asList("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL",
			"IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM",
			"NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
			"WY");
	List<String> Accounttype = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9");
	List<String> Lastpaymentmethod = Arrays.asList("in person", "via app", "via care", "auto pay", "via web");
	List<String> EasyPayIndicator = Arrays.asList("enrolled", "not enrolled");
	List<String> PaStatus = Arrays.asList("No PA", "Pending PA", "Current PA", "Post PA");
	List<String> Writeoff = Arrays.asList("Yes", "No");
	List<String> headers = Arrays.asList("BAN","mobile number","dpd","location","mail");
	//List<String> headers = Arrays.asList("BAN","Mobile","customer name","bill amount due","location","bill date","bill due date","due (bill date - today)","bill period","Risk Profile","Behaviour Score",
	//		"Credit Class","State","Account Type","Wireless Balance","Payment Amount","Days Deliquent","Last Payment Method","Easy Pay Indicator","PA Status","Write Off","Result");
	Random random = new Random();
	long banId=100000000;
    //ArrayList<HashMap<String, String>> valueslist = new ArrayList<>(); 
    try {
		writeToTrainingCsv(addHeaderstoCSV(headers), filePath);
	
       for(int i = 0;i<2500;i++)
	     {
    	    //String banid = RandomStringUtils.randomNumeric(9);
    	  // banId = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		HashMap<String, String> values = new HashMap<>();
		values.put("BAN", String.valueOf(banId+i));
		values.put("Mobile", "+91 9182682899");
		values.put("customer name", "shiva");
		values.put("bill amount due", String.valueOf(random.nextInt(1000)));
		values.put("location", "US");
		values.put("bill date", "9/13/2021");
		values.put("bill due date", "10/13/2021");
		values.put("due (bill date - today)", "0");
		values.put("bill period", "09-13-2021 to 10-13-2021 ");
		values.put("Risk Profile", RiskProfile.get(random.nextInt(RiskProfile.size())));
		values.put("Behaviour Score", String.valueOf(random.nextInt(100)));
		values.put("Credit Class", Creditclass.get(random.nextInt(Creditclass.size())));
		values.put("State", Creditclass.get(random.nextInt(Creditclass.size())));
		values.put("Account Type", Accounttype.get(random.nextInt(Accounttype.size())));
		values.put("Wireless Balance", String.valueOf(random.nextInt(1000)));
		values.put("Payment Amount", String.valueOf(random.nextInt(1000)));
		values.put("Days Deliquent", String.valueOf(random.nextInt(70)));
		values.put("Last Payment Method", Lastpaymentmethod.get(random.nextInt(Lastpaymentmethod.size())));
		values.put("Easy Pay Indicator", EasyPayIndicator.get(random.nextInt(EasyPayIndicator.size())));
		values.put("PA Status", PaStatus.get(random.nextInt(PaStatus.size())));
		values.put("Write Off", Writeoff.get(random.nextInt(Writeoff.size())));
		values.put("Result", "shiva");
		//valueslist.add(values)
	      
		writeToTrainingCsv(addDatatoCSV(headers, values), filePath);
		System.out.println("row added to csv"+values);
	     }
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error occurred in writing to csv"+e);
	}
       
	
	}
	public static String addDatatoCSV(List<String> headers, Map<String, String> data) {
	    final StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < headers.size(); i++) {
	            sb.append(data.get(headers.get(i)));
	            sb.append(i == headers.size() - 1 ? "\n" : ",");
	        }
	    return sb.toString();
	}

	public static String addHeaderstoCSV(List<String> headers) {
		final StringBuffer sb = new StringBuffer();
		for (int i = 0; i < headers.size(); i++) {
			sb.append(headers.get(i));
			sb.append(i == headers.size() - 1 ? "\n" : ",");
		}
		return sb.toString();
	}

	public static void writeToTrainingCsv(String csvBody, String filePath) throws IOException {

		try (PrintWriter writer = new PrintWriter(new FileWriter(new File(filePath), true))) {
			writer.append(csvBody);
		}
	}
}
