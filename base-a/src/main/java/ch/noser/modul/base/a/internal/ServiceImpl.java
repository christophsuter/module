package ch.noser.modul.base.a.internal;


import ch.noser.modul.base.Service;

public class ServiceImpl implements Service {

    public ServiceImpl() {
        System.out.println("my service A is create");
    }

    @Override
    public String getName() {
        return "Service from Modul a";
    }
}
