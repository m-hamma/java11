module com.hamma.userdaomodule {
    requires com.hamma.entitymodule;
    requires com.hamma.daomodule;
    provides com.hamma.dao.Dao with com.hamma.userdao.UserDao;
    exports com.hamma.userdao;
}