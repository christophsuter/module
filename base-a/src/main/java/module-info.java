module base.a {
    requires transitive base;
    exports ch.noser.modul.base.a;
    provides ch.noser.modul.base.Service with ch.noser.modul.base.a.internal.ServiceImpl;
}


