// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		//Parseable을 구현한 어떤 클래스던지 가르키는 참조변수가 되기 위해서 Parseable형 참조변수 사용
		Parseable p = ParserManager.getParser("XML");
		p.parse("docoment.xml");

		p = ParserManager.getParser("HTML");
		p.parse("document2.html");
	}
}

interface Parseable{
	public abstract void parse(String fileName);
}
class ParserManager{
	public static Parseable getParser(String type){
		if(type.equals("XML")){
			return new XMLParser();
		}
		else if(type.equals("HTML")){
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName){
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName){
		System.out.println(fileName + "- HTML parsing completed");
	}
}

