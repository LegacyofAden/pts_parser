package pts.parser;

import java.nio.file.Paths;

import javax.xml.bind.JAXB;

public class Main {

	public static void main(String...args) {
		//MultiSellParser parser = new MultiSellParser();
		//JAXB.marshal(parser.parse(), Paths.get("xml", "multisell.xml").toFile());
		RecipeParser parser = new RecipeParser();
		JAXB.marshal(parser.parse(), Paths.get("xml", "recipe.xml").toFile());
	}
}
