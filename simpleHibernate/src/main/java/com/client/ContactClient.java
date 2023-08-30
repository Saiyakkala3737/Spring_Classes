package com.client;

import com.Dao.*;
import com.model.*;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class ContactClient {
	
	private static ContactDao cDao = new ContactDao();
	
	public static void main(String[] args) {
		Contact c =new Contact (1,"Friar ave","fremont","CA","USA",12345);
		Insert(c);
	}

	private static void Insert(Contact c) {
		cDao.makePersistent(c);
		
	}

}
