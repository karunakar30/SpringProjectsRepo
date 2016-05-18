package org.kk.application;

public class Grain {
	
	/**Configuring Spring Bean Property with External Properties file */
	private String grain_def = "Not Initializing";
	
	public String talkingGrain()
	{
		return grain_def;
	}
	
	public String getGrain_def() {
		return grain_def;
	}

	public void setGrain_def(String grain_def) {
		this.grain_def = grain_def;
	}

}
