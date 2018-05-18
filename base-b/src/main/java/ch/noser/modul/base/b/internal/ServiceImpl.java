package ch.noser.modul.base.b.internal;


import ch.noser.modul.base.Service;

public class ServiceImpl implements Service {


    public ServiceImpl() {
        System.out.println("my service B is create");
    }

    @Override
    public String getName() {
        return "Service from Modul b";
    }
}
