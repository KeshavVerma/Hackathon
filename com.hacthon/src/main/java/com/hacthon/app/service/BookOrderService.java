package com.hacthon.app.service;

import java.util.List;

import com.hacthon.app.modal.BookOrder;
import com.hacthon.app.modal.User;

public interface BookOrderService {

	BookOrder save(BookOrder order);
    List<BookOrder> findAll();
    void delete(long id);
    BookOrder findById(Long id);
}
