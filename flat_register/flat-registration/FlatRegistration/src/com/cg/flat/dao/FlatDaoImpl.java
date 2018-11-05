package com.cg.flat.dao;

import java.util.ArrayList;

import com.cg.flat.bean.FlatBean;
import com.cg.flat.util.DataBase;

public class FlatDaoImpl implements IFlatDao {

	@Override
	public ArrayList<Integer> getFlatDetails() {
		// TODO Auto-generated method stub
		return DataBase.getFlatDetails();
		
	}
public ArrayList<String> getRoomDetails(){
	return DataBase.getRoomDetails();
}
@Override
public ArrayList<FlatBean> displaydetails() {
	// TODO Auto-generated method stub
	return DataBase.displayDetails();
}
@Override
public void addRoomDetails(FlatBean bean) {
	 DataBase.addRoomDetails(bean);
	// TODO Auto-generated method stub
	
}

	
}
