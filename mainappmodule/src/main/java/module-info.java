module com.hamma.mainappmodule {
	requires transitive com.hamma.mod.entitymodule ;
    requires com.hamma.daomodule;
    requires com.hamma.userdaomodule;
    uses com.hamma.dao.Dao com.hamma.mod.entitymodule 
    exports com.hamma.app;
}