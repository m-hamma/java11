module com.hamma.userdaomodule {
	requires static lombok;
    requires com.hamma.entitymodule;
    requires com.hamma.daomodule;
    provides com.hamma.dao.Dao with com.hamma.udao.UserDao;
    exports com.hamma.udao;
}