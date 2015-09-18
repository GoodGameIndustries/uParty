package com.GGI.uParty.Objects;

import java.util.ArrayList;

import com.GGI.uParty.uParty;
import com.GGI.uParty.Network.Party;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

public class PartyList extends ArrayList<PartyModule>{

	public float w = Gdx.graphics.getWidth(),h = Gdx.graphics.getHeight();
	public float height = 0;
	
	public uParty u;
	
	public PartyList(uParty u){
		this.u=u;
	}
	
	

	public void render(int scrolled){
		height = 0;
		for(int i = 0;i<size();i++){
			get(i).bounds=new Rectangle(0,.945f*h-((i+1)*.1f*h)+scrolled,w,.1f*h);
			height+=.1f*h;
			get(i).render();
		}
		
	}
	
	public boolean down(){
		return false;
		
	}
	
	public boolean up(){
		return false;
		
	}

	public void refresh(ArrayList<Party> parties) {
		this.clear();
		for(int i = 0; i < parties.size();i++){
			this.add(new PartyModule(u,parties.get(i)));
		}
		
	}
}
