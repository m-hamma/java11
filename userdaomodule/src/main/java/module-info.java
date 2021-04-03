module com.hamma.userdaomodule {
	requires static lombok;
	requires transitive com.hamma.entitymodule;
    requires com.hamma.daomodule;
    provides com.hamma.dao.Dao with com.hamma.udao.UserDao;
    exports com.hamma.udao;
    exports com.hamma.dtos;
    exports com.hamma.mapper;
}