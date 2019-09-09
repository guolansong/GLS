package com.bwie.utils;

public class StringUtil {
	
	private StringUtil() {}
	/*
	* 方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
	* 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
	* 使用场景：网页文本框传到后台的字符串就可能就会回车换行。*/
	public static String toHtml(String text) {
//		方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
		String gls = "\\\\r\\\\n";
		String all = text.replaceAll(text, "<p></p>");
//		包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
		String gls2 = "\\\\n\\\\r";
		String all2 = gls.replaceAll(all, "\n");
//		使用场景：网页文本框传到后台的字符串就可能就会回车换行。
		String gls3 = "\\\\r";
		String all3 = gls3.replaceAll(all2, "<br/>");
		
		return all3;
		
	}
}
