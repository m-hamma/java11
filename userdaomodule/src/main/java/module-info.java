module com.hamma.userdaomodule {
    requires java.compiler;
    requires com.hamma.entitymodule;
    requires com.hamma.daomodule;
    requires lombok;
    requires org.mapstruct;
    provides com.hamma.dao.Dao with com.hamma.userdao.UserDao;
    exports com.hamma.userdao;
    exports com.hamma.mapper;
    exports com.hamma.dtos;
}