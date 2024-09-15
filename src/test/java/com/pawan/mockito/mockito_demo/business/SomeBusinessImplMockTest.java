package com.pawan.mockito.mockito_demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
   // @Test
//    public void test(){
//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveData()).thenReturn(new int[]{25,47,78,36,12});
//        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
//        assertEquals(78,someBusinessImpl.findGreatest());
//    }

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void test(){
        when(dataService.retrieveData()).thenReturn(new int[]{12,23,25});
        assertEquals(25,someBusiness.findGreatest());
    }
}


