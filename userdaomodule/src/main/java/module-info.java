module com.hamma.userdaomodule {
	requires static lombok;
	requires transitive com.hamma.mod.entitymodule ;
    requires com.hamma.daomodule;
    exports com.hamma.udao;
    exports com.hamma.dtos;
    exports com.hamma.mapper;
    provides com.hamma.dao.Dao with com.hamma.udao.UserDao;
}