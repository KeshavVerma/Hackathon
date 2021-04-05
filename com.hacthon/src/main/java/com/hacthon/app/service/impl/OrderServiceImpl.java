package com.hacthon.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacthon.app.dao.OrderDao;
import com.hacthon.app.modal.BookOrder;
import com.hacthon.app.service.BookOrderService;


@Service(value = "orderService")
public class OrderServiceImpl implements BookOrderService {
	
	@Autowired
	private OrderDao orderDao;

	
	public List<BookOrder> findAll() {
		List<BookOrder> list = new ArrayList<>();
		orderDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(long id) {
		orderDao.deleteById(id);
	}

	@Override
	public BookOrder findById(Long id) {
		return orderDao.findById(id).get();
	}

	@Override
    public BookOrder save(BookOrder order) {
        return orderDao.save(order);
    }
}
