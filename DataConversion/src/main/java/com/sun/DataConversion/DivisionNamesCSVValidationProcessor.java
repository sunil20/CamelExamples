package com.sun.DataConversion;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.List;

public class DivisionNamesCSVValidationProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		@SuppressWarnings("unchecked")
		List<Map<String, String>> csvRows =(List<Map<String, String>>)exchange.getIn().getBody(List.class);
		
		
		for(Map<String, String> rows:csvRows){
		    for (Map.Entry<String,String> entry : rows.entrySet()) {
		        System.out.println(entry.getKey() + ": " + entry.getValue());
		     }
		}
		exchange.getOut().setBody(csvRows);
	}
	


}
