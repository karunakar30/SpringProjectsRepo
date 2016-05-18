package org.kk.application;

import java.util.List;
import java.util.Map;

public class Vegetable {
	
	/**Setting bean properties*/
	private String vegetableName;
	
	/**Setting bean properties with List and Map*/
	private List<String> vegetableNameList;
	private Map<String, String> vegetableNameMap;
	
	public Vegetable() { }
	
	public Vegetable( String vegName)
	{
		vegetableName = vegName;
	}
	
	public String talkAboutVegetable()
	{
		String speech = "Hi, I am Vegetable ";
		if(vegetableName != null && !vegetableName.equals(""))
			speech = speech + vegetableName;
		return speech;
	}
	
	public String talkAboutVegetableNames()
	{
		String speech = "Vegetables Names ";
		if(vegetableNameList != null && vegetableNameList.size()>0)
		{
			speech += "List :";
			for(int i=0 ; i<vegetableNameList.size();i++)
			{
				speech += "\n" + vegetableNameList.get(i);
			}
		}
		
		if(vegetableNameMap != null && vegetableNameMap.size() >0)
		{
			speech += "\n";
			for(Map.Entry<String, String> vegName : vegetableNameMap.entrySet())
			{
				speech += vegName.getKey() + "==>" + vegName.getValue() + "\n";
			}
		}
			
		return speech;
	}
	
	public String getVegetableName() {
		return vegetableName;
	}

	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}
	
	public List<String> getVegetableNameList() {
		return vegetableNameList;
	}

	public void setVegetableNameList(List<String> vegetableNameList) {
		this.vegetableNameList = vegetableNameList;
	}

	public Map<String, String> getVegetableNameMap() {
		return vegetableNameMap;
	}

	public void setVegetableNameMap(Map<String, String> vegetableNameMap) {
		this.vegetableNameMap = vegetableNameMap;
	}

}
