package com.bwie.test;

import org.junit.Test;

import com.bwie.utils.StringUtil;

public class StringTest {

	@Test
	private void show() {
//		测试类
		String text = "\\\\\\\\r\\\\\\\\n9月5日一大早，又有了新的情况。\n上午9点多，传出中美经贸高级别搓商托人通话的消息。\n9月5日上午，中共中央政治局委员、国务院副经理，中美全面经济对话中放牵头人刘鹤应约美国贸易代表、进行谈话";
		String html = StringUtil.toHtml(text);
		System.out.println(html);
	}
	
}
