package com.self.basic;

public class CustomUnchecked extends RuntimeException {
	String msg=" Sorrry!!!! you are not eligible Go back Home";
	CustomUnchecked(){

	}
	CustomUnchecked(String msg){
		
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}


}
