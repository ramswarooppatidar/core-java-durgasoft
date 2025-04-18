package com.interfaces;

interface Part_1 {
	void m1();
	void m2();
}
	//ITRODUCTOION
  /* Defination 1:
   *  
   * Any service requirment specifiaction (SRS) is consider as interface
   * example 1: JDBC API access requiremnt specification to develop data base driver, data base
   * vendr is responsible to implement this JDBC API
   * 
   *                      JDBC API(SUN)
   *             .				.
   *          .					.
   *       .					.
   *    ORACLE DERIVER    MYSQL DRIVER ......)
   *    
   * Example 2: Servlate API access requirement specification to develop web server, web server vendor 
   * is resonsible to implement servelet api
   * 
   *  (sun cerate interface)---> SERVLET API  -----implement by vendore-->( apache (tomcat),   oracle (weblogi)  , IBM (webSphere))
   *  
   *  DEFINATION 2:
   *  
   *  from client point of view a interface defined the set of services waht his expecting
   *  from service provider point of view a interfce define the sat of service what his offering, 
   *  hence any contract between client and service provider is consider as an interface
   *  
   *  client------[ getAttendance(), getName(),......]-----implement----servceProvider
   *  
   *  Example :  through bank atm gui screen, bank people highlating the set of service what they are offering
   *  at the same time same gui screen represents, the set of services what customer is expecting,
   *  hence this GUI screen access contract between customer and bank people
   *  
   *  BANK-----[withdraw(), checkbalnce()....]-----implement----->service provider
   *  						[bank atm]
   *  
   *  DEFINATION 3:
   *  INside interface every method always abstarct whether we are decalring or not, hence interface is
   *  consider as 100% pure abstract class
   *  
   *  Summary Defibation:
   *  Any service requirment specification or any contract between client and service provider or 100% 
   *  pure abstract class is nothing but Interface
   *  
   */

