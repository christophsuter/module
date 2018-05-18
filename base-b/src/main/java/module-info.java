module base.b {
    requires transitive base;
    exports ch.noser.modul.base.b;
    provides ch.noser.modul.base.Service with ch.noser.modul.base.b.internal.ServiceImpl;
}


