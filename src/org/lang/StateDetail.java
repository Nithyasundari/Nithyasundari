package org.lang;

public class StateDetail extends LanguageInfo{

private void southIndia() {
	System.out.println("southIndia");
}

private void northIndia() {
	System.out.println("NorthIndia");
}


public static void main(String[] args) {
	
	StateDetail a = new StateDetail();
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	a.southIndia();
	a.northIndia();
}

}