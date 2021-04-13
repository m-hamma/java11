 module com.hamma.userdaomodule {
	requires transitive java.compiler;
	requires java.sql;
	requires transitive org.mapstruct.processor;
	requires static org.mapstruct;
	requires transitive com.hamma.entitymodule ;
    requires com.hamma.daomodule;
    provides com.hamma.dao.Dao with com.hamma.udao.UserDao;
    exports com.hamma.udao;
    exports com.hamma.mapper;
}