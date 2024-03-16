package multilevelinheritance.texteditor;

public class Word extends Wordpad{
	private boolean spellcheckenable;
	
	public Word()
	{
		super();
		this.spellcheckenable=true;
	}
	
	public void spellcheckenable()
	{
		if(spellcheckenable)
		{
			System.out.println("Running spell check....");
		}
		else
		{
			System.out.println("Spell check is disable....");
		}
	}
	
	public void enablespellcheck(boolean enable)
	{
		spellcheckenable=enable;
	}

}

