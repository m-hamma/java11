module com.hamma.mainappmodule {
	requires transitive java.compiler;
	requires java.sql;
	requires static org.mapstruct;
	requires transitive com.hamma.entitymodule ;
    requires transitive com.hamma.daomodule;
    requires com.hamma.userdaomodule;
    uses com.hamma.dao.Dao;
    exports com.hamma.app;
}