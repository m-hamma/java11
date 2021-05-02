module com.hamma.mainappmodule {
	requires transitive java.compiler;
	requires java.sql;
	requires static org.mapstruct;
	requires java.base;
	//requires jdk.incubator.httpclient;
	requires java.net.http;
	requires java.logging;
	requires transitive com.hamma.entitymodule;
	requires transitive com.hamma.daomodule;
	requires com.hamma.userdaomodule;
	//requires org.junit.jupiter.api;
	opens com.hamma.app.rest;

	uses com.hamma.dao.Dao;

	exports com.hamma.app;
}