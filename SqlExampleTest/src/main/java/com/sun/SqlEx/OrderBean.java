/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sun.SqlEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Bean that generates and process orders.
 */
public class OrderBean {

   
    /**
     * Generates a new order structured as a {@link Map}
     */
    public Map<String, Object> generateOrder() {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("id",111);
        answer.put("item","book");
        answer.put("amount","500");
        answer.put("description","ActiveMQ in Action");
        return answer;
    }
    
    void selectOrderByIdResult(List<Map<String,Object>> list){
    	System.out.println("size:::::"+list.size());
    	
    }
    
    void SelectOrderAllResult(List<Map<String,Object>> list){
    	System.out.println("size:::::"+list.size());
    	
    }
    
    public Map<String, Object> selectOrderById() {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("id",11);       
        return answer;
    }
    
    public Map<String, Object> selectOrderByAll() {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("id",111);       
        return answer;
    }
    

    /**
     * Processes the order
     *
     * @param data  the order as a {@link Map}
     * @return the transformed order
     */
   /* public String processOrder(Map<String, Object> data) {
        return "Processed order id " + data.get("id") + " item " + data.get("item") + " of " + data.get("amount") + " copies of " + data.get("description");
    }
*/    public String processOrder(ArrayList<HashMap<String, Object>> result) {
    	
    	Map<String, Object> data=result.get(0);
    	
        return "Processed order id " + data.get("id") + " item " + data.get("item") + " of " + data.get("amount") + " copies of " + data.get("description");
    }
   
}