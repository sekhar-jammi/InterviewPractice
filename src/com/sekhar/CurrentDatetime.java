package com.sekhar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDatetime {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date=new Date();
		System.out.println(format.format(date));

	}

}
