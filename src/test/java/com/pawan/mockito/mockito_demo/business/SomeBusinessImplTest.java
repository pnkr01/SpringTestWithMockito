package com.pawan.mockito.mockito_demo.business;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {
    @Test
    public void testSomeBusiness() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceStub);
        int greatest = someBusiness.findGreatest();
        assertEquals(54,greatest);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[]{10,50,13,18,30,54,23};
    }
}