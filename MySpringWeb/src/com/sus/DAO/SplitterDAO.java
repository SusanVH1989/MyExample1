package com.sus.DAO;

import java.util.List;

import com.sus.beans.SpitterUser;
import com.sus.beans.Spittle;

public interface SplitterDAO {
	
	public List<Spittle> searchFollowers(int id);
	public Spittle findFollowers(long id);
	public void saveSpitter(SpitterUser user);	
	public SpitterUser findByUsername(String userName);

}
