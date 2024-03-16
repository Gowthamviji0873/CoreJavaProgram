package multilevelinheritance.texteditor;

public class Notepad { 
	protected String content;
	
	public Notepad()
	{
		this.content="";
	}
	
	public void write (String text)
	{
		content+=text;
	}
	
	public void displaycontent()
	{
		System.out.println("Notepad Content:"+content);
	}
	

}
