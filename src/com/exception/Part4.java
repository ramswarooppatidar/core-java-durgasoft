package com.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Part4 {

	public static void main(String[] args) throws FileNotFoundException {
		// Checked and Unchecked exception
		PrintWriter pWriter = new PrintWriter("abc.txt");
		pWriter.println("hellow");
		
		/*
		 * checked exception and unchecked excpetions
		 * 
		 * the exceptions which are checked by complier for smooth exceution of the program are called
		 * checked exceptions. ex HALTICKEMISSING EXCEPTION, PEN NOTWOTKINGEXCEPTION, FILENOTFOUNDEXCPTIO etc
		 * 
		 * in our programm if there is a chance of raising checked excption then complusry we should handle the
		 * checked excption(either by trycatch, or throws keyword)
		 * other wise we will get compile tiem error
		 * 
		 * the excpetion which are not checked by compiler whether programming handling or not such type of
		 * excption are called unchecked excptions
		 * ex ARTHEMATICEXCPTION, BUMBBLASTEXCPTION etc..
		 * 
		 * NOTE : Whtere it is checked or unched every excption are occured at run time only, there is no 
		 * chance to occuring any excdption at complie time
		 * 
		 * NOTE : Runtime exception and its child classe, errror and child classes are uncked excpt this, remaing are checked 
		 * 
		 * a checked exception is said to be fully checked if and only if all its child classes also checked
		 * example IOEXCPTION , INTERUPTED EXCEPTION
		 * 
		 * a checked exception is said to partialy checked if and only if some of its childe classes are unchekced
		 * example , excption, throwable
		 * 
		 * NOTE : the only possible partial checked exception in java are exception, throwable
		 * 
		 * describe the behaviour of following exception :
		 * 1) IOEXCEPTION , fullchecked
		 * 2) RUNTIME   , unchked
		 * 3) INTRUPT  , fullycheckd
		 * 4) ERROR  ,  unched
		 * 5) THROWABLE  , partial checked
		 * 6) ARITHEMATIC,  uncked
		 * 7) NULLPOINT  , uncheked
		 * 8) EXCEPTION  , checked partially
		 * 9) FILENOTFOUNDEXCEPTION ,  checked fullychekd
		 */

	}

}
