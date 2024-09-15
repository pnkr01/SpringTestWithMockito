package com.pawan.mockito.mockito_demo.business;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findGreatest(){
        int [] data = dataService.retrieveData();
        int min = data[0];
        for (int eachElement : data) {
            if(eachElement>min){
                min = eachElement;
            }
        }
        return min;
    }
}

interface DataService{
    int [] retrieveData();
}