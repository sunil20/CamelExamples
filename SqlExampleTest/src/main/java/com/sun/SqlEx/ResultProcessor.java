package com.sun.SqlEx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class ResultProcessor implements Processor{
	Logger log=Logger.getLogger(ResultProcessor.class);

	@Override
	public void process(Exchange ex) throws Exception {
		
		Object o=ex.getIn().getBody();
		@SuppressWarnings("unchecked")
		List<Map<String,Object>> list=(List<Map<String, Object>>) o;
		log.info("size::::::::::::::::::::"+list.size());
		Map<String,Object> m=list.get(0);
		HashMap<String,Object> hm=new HashMap<String,Object>(m);
		for(Map.Entry<String,Object> e:hm.entrySet()){
			System.out.println("Key:"+e.getKey()+"value:"+e.getValue());
		}
		
		
	}

}
