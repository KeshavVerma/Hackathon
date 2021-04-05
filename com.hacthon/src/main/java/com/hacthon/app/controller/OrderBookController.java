package com.hacthon.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hacthon.app.modal.BookOrder;
import com.hacthon.app.service.BookOrderService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class OrderBookController {

	@Autowired
	private BookOrderService bookOrderService;

	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public ResponseEntity<?> saveOrders(@RequestBody BookOrder bookOrder) {
		BookOrder order =  bookOrderService.save(bookOrder);
		return new ResponseEntity(order,HttpStatus.CREATED);
	}
    
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public BookOrder getOneOrder(@PathVariable(value = "id") Long id){
        return bookOrderService.findById(id);
    }
	
	
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<BookOrder> getAllOrder(){
        return bookOrderService.findAll();
    }

}
