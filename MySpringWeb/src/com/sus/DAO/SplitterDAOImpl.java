package com.sus.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sus.beans.SpitterUser;
import com.sus.beans.Spittle;

/**
 * 
 * @author hailssus
 *
 */
public class SplitterDAOImpl implements SplitterDAO {
	List<Spittle> spittleList=new ArrayList<>();
	Map<String,SpitterUser> spitterUserKMap=new HashMap<String,SpitterUser>();
	/**
	 * 
	 */
	public List<Spittle> searchFollowers(int id){
	
		Spittle sp1=new Spittle("hi", new Date(),1);
		Spittle sp2=new Spittle("how are u", new Date(),2);
		Spittle sp3=new Spittle("find", new Date(),3);
		spittleList.add(sp1);
		spittleList.add(sp2);
		spittleList.add(sp3);
		return spittleList;
		
	}
	/**
	 * 
	 */
	public Spittle findFollowers(long id){
		int length=spittleList.size()-1;
		for(Spittle spitter:	spittleList){
			if(spitter.getId()==1){
				return spitter;
			}
		}
		return new Spittle("hello",new Date(),spittleList.get(length).getId()+1);
	}
	/**
	 * 
	 * @param user
	 */
	public void saveSpitter(SpitterUser user){
		spitterUserKMap.put(user.getUserName(),user);
	}
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	public SpitterUser findByUsername(String userName){
		return spitterUserKMap.get(userName);
	}
	
	
}
