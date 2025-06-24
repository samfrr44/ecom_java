package com.sam.business.ecom.controllers;

import com.sam.business.ecom.dtos.order.OrderRequestDto;
import com.sam.business.ecom.dtos.order.OrderResponseDto;
import com.sam.business.ecom.dtos.order.Order_IdResponseDto;
import com.sam.business.ecom.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public Order_IdResponseDto create(@RequestBody OrderRequestDto orderRequestDTO){
        return orderService.createNewOrder(orderRequestDTO);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public OrderResponseDto read(@PathVariable("id") String id) {
        return orderService.findOrderById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public OrderResponseDto update(@PathVariable String id, @RequestBody OrderRequestDto request) {
        return orderService.updateOrder(id, request);
    }

    @RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>("order deleted", HttpStatus.OK);
    }
}
