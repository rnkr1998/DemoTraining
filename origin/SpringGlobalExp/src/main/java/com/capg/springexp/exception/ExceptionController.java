package com.capg.springexp.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //@ControllerAdvice
public class ExceptionController {
	
	//@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Product details are invalid")
	/*
	 * @ExceptionHandler({ InvalidProductException.class }) public
	 * ResponseEntity<String> handler() { // controller level exp-handling
	 * 
	 * System.err.println("invalid");
	 * 
	 * return new
	 * ResponseEntity<String>("Invalid Product Inputs from GlobalExp Handler"
	 * ,HttpStatus.NOT_ACCEPTABLE); }
	 */
		
		@ExceptionHandler({ InvalidProductException.class })
		public ResponseEntity<ErrorInfo> handler(HttpServletRequest request) { // controller level exp-handling

				System.err.println("invalid");
				
				ErrorInfo error = new ErrorInfo();
					error.setMessage("Invalid Inputs");
					error.setUrl(request.getRequestURL().toString());
				
			return new ResponseEntity<ErrorInfo>(error,HttpStatus.NOT_ACCEPTABLE);
		}
	
	

}
