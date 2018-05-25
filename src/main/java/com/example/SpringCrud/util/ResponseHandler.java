package com.example.SpringCrud.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class ResponseHandler.
 */
public class ResponseHandler {
	
	/**
	 * Generate response.
	 *
	 * @param status the status
	 * @param error the error
	 * @param message the message
	 * @param responseObj the response obj
	 * @return the map
	 */
	public static Map<String, Object> generateResponse(HttpStatus status, boolean error, String message, Object responseObj) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map.put("timestamp", new Date().getTime());
			map.put("status", status.value());
			map.put("error", error);
			map.put("message", message);
			map.put("data", responseObj);
			return map;
		} catch (Exception e) {
			map.clear();
			map.put("timestamp", new Date().getTime());
			map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
			map.put("message", e.getMessage());
			return map;
		}
	}
}
