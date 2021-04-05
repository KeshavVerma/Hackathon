package com.hacthon.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hacthon.app.modal.BookOrder;

@Repository
public interface OrderDao extends CrudRepository<BookOrder, Long> {

}
