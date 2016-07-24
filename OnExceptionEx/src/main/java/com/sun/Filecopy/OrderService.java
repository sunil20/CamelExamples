package com.sun.Filecopy;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.camel.Processor;

public class OrderService {
	
    public Object handleOrder(@Headers Map<?, ?> in, @Body String payload, @OutHeaders Map<String, Object> out)
        throws OrderFailedException {
    	
    	
        out.put("customerid", in.get("customerid"));
        if ("Order: kaboom".equals(payload)) {
            throw new OrderFailedException("Cannot order: kaboom");
        } else {
            out.put("orderid", "123");
            return "Order OK";
        }
    }
 
    
    public Object orderFailed(@Headers Map<?, ?> in, @Body String payload, @OutHeaders Map<String, Object> out) {
        out.put("customerid", in.get("customerid"));
        out.put("orderid", "failed");
        return "Order ERROR";
    }

}
