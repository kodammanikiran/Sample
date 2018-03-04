package com.noesisinformatica.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Generated;

/**
 * <br>Written by @author noesisdev
 * <br>Created on 02/03/2014
 */

@Entity
public class DataService {

	@Id
	@TableGenerator(name="id", table="idpktb", pkColumnName="idkey",
	pkColumnValue="idvalue",initialValue = 1000 , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="id")
	private int id;
    private String data;
       
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
