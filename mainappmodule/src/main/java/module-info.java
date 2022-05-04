module com.hamma.mainappmodule {
    requires java.compiler;
    requires com.hamma.entitymodule;
    requires com.hamma.daomodule;
    requires com.hamma.userdaomodule;
    requires java.net.http;
    requires org.mapstruct.processor;
    uses com.hamma.dao.Dao;
}