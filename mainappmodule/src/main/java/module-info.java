module com.hamma.mainappmodule {
	requires transitive com.hamma.entitymodule;
    requires com.hamma.daomodule;
    requires com.hamma.userdaomodule;
    uses com.hamma.dao.Dao;
    exports com.hamma.app;
}