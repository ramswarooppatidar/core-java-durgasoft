package com.multithreading;

public class Parts13_SuspenceReumeStart {
	
  public static void main(String arg[]) {
	  
  }
}
/*
   GREEN THREAD :
   java my=ultithreading concept is imlementing on following two model 
   GREEN THREAD :
   the thread which is managed completely by jvm without taking underline os support is called green thread
   where few operative system like sunslar support green thrad model, any way green thread model is deprecated
   and not recommend to use
   
   NATIVE OS MODEL :
   the thread which is managed by the jvm with the help of underliying os, is called native os model, all
   window based opeting system support for native os model
   
   How to stop the thread ?
   t.stop()  //deprecated method
   we can stop a thread execution by using stop method of thread class ,
   public void stop(){}
   if we call stop method then emmidiatly the thread will enterd in dead state, anywhere stop method is 
   depricated and not recommended to use
   
   How to suspend and resume of a thread ?
   we can suspend a thread by using suspend method of thread class then immediatly the thread will be entred
   into suspended state
   we can resume a suspended thread by using resume method of thread class then suspended thread can contine
   its execution
   this method are depricated and not recommeded to use
   
   
 */
