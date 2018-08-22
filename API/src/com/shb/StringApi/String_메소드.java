package com.shb.StringApi;

public class String_메소드 {
	
	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		
		System.out.println(str1.concat(str2));//문자열 연결
		System.out.println(str1.substring(3));//문자열 자르기
		System.out.println(str1.length());// 문자열 길이
		System.out.println(str1.toUpperCase());//대문자로 변경
		System.out.println(str2.toLowerCase());//소문자로 변경
		System.out.println(str1.charAt(3));//특정위치의 글자 찾기
		System.out.println(str1.indexOf('c'));//특정문자열의 위치
		
		String str4 = "adcdefg";
		System.out.println(str1.equals(str4));//문자열 비교
		
		String str5 = " abc def ghi ";
		System.out.println(str5.trim());//문자열 시작,끝 공백제거 
		
		System.out.println(str1.replace('a', 'Z'));//특정문자 변경
		System.out.println(str1.replaceAll("abcd", "ZZZZZ"));//특정 문자열 변경
		
	}

}
