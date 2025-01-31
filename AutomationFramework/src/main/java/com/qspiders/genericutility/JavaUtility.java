package com.qspiders.genericutility;

import java.time.LocalDateTime;

/**
 * @author Chetan
 */
public class JavaUtility {
	/**
	 * this method will be capture system date and time and return
	 * 
	 * @return system date and time
	 */
	public String getSystemTime() {

		return LocalDateTime.now().toString().replace(":", "-");
	}
}
