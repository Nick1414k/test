package test;

public class Test {


//@ private invariant setting >= 0;

	private int setting = 0;
	
	//@ ensures getSetting() == (\old(getSetting()) + 1 % 4);
	public void switchSetting()
	{
		assert this.setting == (this.setting + 1) % 4;
		this.setting = (this.setting + 1) % 4;
	}
	
	//@ ensures \result >= 0;
	/*@ pure */ public int getSetting()
	{
		assert this.setting >= 0;
		return this.setting;
	}
}
