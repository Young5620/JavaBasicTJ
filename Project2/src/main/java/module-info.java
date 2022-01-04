module Project2 {
	exports egovframework.let.main.service;
	exports egovframework.let.cop.com.web;
	exports egovframework.let.cop.bbs.service.impl;
	exports egovframework.com.cmm.filter;
	exports egovframework.let.cop.smt.sim.web;
	exports egovframework.com.cmm.web;
	exports egovframework.com.cmm.service;
	exports egovframework.let.cop.bbs.web;
	exports egovframework.let.utl.sim.service;
	exports egovframework.let.main.web;
	exports egovframework.com.cmm.interceptor;
	exports egovframework.let.sym.cal.web;
	exports egovframework.let.sym.cal.service;
	exports egovframework.let.cop.com.service;
	exports egovframework.com.cmm.service.impl;
	exports egovframework.let.sym.cal.service.impl;
	exports egovframework.com.cmm.annotation;
	exports egovframework.com.cmm.util;
	exports egovframework.let.uat.uia.service.impl;
	exports egovframework.let.cop.com.service.impl;
	exports egovframework.let.cop.smt.sim.service;
	exports egovframework.let.uat.uia.service;
	exports egovframework.let.cop.bbs.service;
	exports egovframework.com.cmm;
	exports egovframework.let.cop.smt.sim.service.impl;
	exports egovframework.let.uat.uia.web;
	exports egovframework.let.utl.fcc.service;

	requires commons.collections;
	requires commons.fileupload;
	requires egovframework.rte.fdl.cmmn;
	requires egovframework.rte.fdl.idgnr;
	requires egovframework.rte.fdl.property;
	requires egovframework.rte.fdl.string;
	requires egovframework.rte.psl.dataaccess;
	requires egovframework.rte.ptl.mvc;
	requires ibatis.sqlmap;
	requires icu4j;
	requires java.annotation;
	requires java.desktop;
	requires java.sql;
	requires javaee.api;
	requires jstl;
	requires org.apache.commons.codec;
	requires org.apache.commons.lang3;
	requires org.apache.commons.logging;
	requires slf4j.api;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.jdbc;
	requires spring.modules.validation;
	requires spring.tx;
	requires spring.web;
	requires spring.webmvc;
}