package multilevelinheritance.texteditor;

public class TextEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word w=new Word();
		
		w.write("Hello, ");
		w.formattext(true);
		w.write("World!");
		w.displaycontent();
		
		w.spellcheckenable();
		
		System.out.println("Is text in Wordpad Bold? "+w.isbold());
		System.out.println("Disable spellcheck in word.");
		w.enablespellcheck(false);
		w.spellcheckenable();
	}

}
