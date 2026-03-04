package com.exm;

import java.util.ArrayList;
import java.util.List;

class IrrigationBot
{
	private String id;
	
	private String cropType;
	
	private double volume;
	
	private double area;
	
	public IrrigationBot()
	{
		
	}

	public IrrigationBot(String id, String cropType, double volume, double area) {
		
		this.id = id;
		this.cropType = cropType;
		this.volume = volume;
		this.area = area;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}

class IrgBUtility
{
	private ArrayList<IrrigationBot> botData = new ArrayList<>();

	public ArrayList<IrrigationBot> getBotData() {
		return botData;
	}

	public void setBotData(ArrayList<IrrigationBot> botData) {
		this.botData = botData;
	}
	
	public void add(IrrigationBot obj)
	{
		botData.add(obj);
	}
	
	public IrrigationBot getById(String id)
	{
		IrrigationBot bobj = new IrrigationBot();
		
		bobj.setId(id);
		
		if(botData.contains(id))
		{
			for(int i = 0; i < botData.size(); i++)
			{
				IrrigationBot obj = botData.get(i);
				
				if(obj.getId().equals(id))
				{
					return obj;
				}
				
			}
		}
		
		return bobj;
	}
	
	public List<IrrigationBot> getEfficientBot()
	{
		
		List<IrrigationBot> efBot = new ArrayList<>();
		
		double max = Integer.MAX_VALUE;
		
		for(IrrigationBot dt : botData)
		{
			double rto = dt.getVolume()/dt.getArea();
			
			if(max == rto)
			{
				efBot.add(dt);
			}
			else if(rto < max)
			{
				efBot.add(0,dt);
				
				max = rto;
			}
		}
		
		return efBot;
	}
}

public class Exp1 {
	
}
