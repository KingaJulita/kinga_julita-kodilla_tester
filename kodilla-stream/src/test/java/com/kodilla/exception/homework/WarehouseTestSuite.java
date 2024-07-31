package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {

        // given
        Warehouse warehouse = new Warehouse();
        //when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("15"));
    }

}