package com.health.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EnquiryIdNullException  extends RuntimeException{

		public EnquiryIdNullException(String msg) {
			super(msg);
		}
}
