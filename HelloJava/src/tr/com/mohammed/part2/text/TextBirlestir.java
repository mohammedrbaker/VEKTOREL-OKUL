package tr.com.mohammed.part2.text;

public class TextBirlestir {
	String[] text;

	public TextBirlestir(String[] text) {
		this.text = text;

	}

	public TextBirlestir(String textA, String TextB, String textC) {

		for (String textElement : this.text) {
			System.out.println(textElement);
		}

	}

	public TextBirlestir(String textA, String textB) {
		for (String textElement : this.text) {
			System.out.println(textElement + " - ");
		}


	}

	public String birlestir() {
		String sonuc = "";
		for (String textElement : this.text) {
			System.out.println(textElement + "  ");
			sonuc+= textElement;
		}


	}

}
