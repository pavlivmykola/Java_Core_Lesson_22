package ua.lviv.lgs;

import java.util.Arrays;
import java.util.List;

import javax.xml.ws.handler.MessageContext;

public class Task1 {

	public static void main(String[] args) {
		Pet cow = message -> System.out.println(message);
		Pet cat = message -> System.out.println(message);
		Pet dog = message -> System.out.println(message);		

		cat.voice("ί κ³ς- Μÿσσσ-Μÿσσσ");
		dog.voice("ί οερ- Γΰσσσ-Γΰσσσ");
		cow.voice("ί κξπξβΰ- Μσσσ-Μσσσ");
	}
	
}

interface Pet{
	void voice(String msg);
}