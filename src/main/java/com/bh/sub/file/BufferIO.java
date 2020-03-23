package com.bh.sub.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BufferIO {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader(new File("src/main/resources/aa.txt")));
			BufferedWriter bWriter  = new BufferedWriter(new FileWriter(new File("src/main/resources/bb.txt")));
			String str = null;
			// 验证日期格式为YYYY-MM-DD的正则表达式为
			String regex = "(((0[1-9]|[12][0-9]|3[01])-(0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)-(0[469]|11))|((0[1-9]|[1][0-9]|2[0-8])-02))-([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})";
			int i = 1;
			while((str = bf.readLine()) != null){
		      //System.out.println(str);//此时str就保存了一行字符串
//		    	  System.out.println(str);
				// 验证日期格式为DD/MM/YYYY的正则表达式为
				Pattern r = Pattern.compile(regex);
				  Matcher m = r.matcher(str);
				  if (m.find() == true) {
					  String temp = str.substring(m.start(),m.end());
					  String date = temp.substring(6,10) + '-' + temp.substring(3,5) + '-' + temp.substring(0,2);
					  str = str.replace(temp, date);
				  }
				  bWriter.write(str + "\n");
		      }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
