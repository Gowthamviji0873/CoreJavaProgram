package multilevelinheritance.texteditor;

public class Wordpad extends Notepad {
	private boolean isbold;
	
	public Wordpad()
	{
		super();
		this.isbold=false;
	}
	public void formattext(boolean bold)
	{
		if(bold)
		{
			content="<b>"+content+"</b>";
		}
		isbold=bold;
	}
	
	public boolean isbold()
	{
		return isbold;
	}
}
