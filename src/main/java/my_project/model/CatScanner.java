package my_project.model;

import KAGO_framework.model.abitur.datenstrukturen.List;

/**
 * Diese Klasse scannt Strings für die Sprache L_Knebi = k(ne)*bi
 */
public class CatScanner extends Scanner<String,String> {

    private String debugOutput;

    @Override
    public boolean scan(String input) {
        debugOutput = "\nScanner recognized following tokens:\n";
        if(input == null || input.length() == 0){
            debugOutput+="Sorry, can't scan empty String.";
            return false;
        }
        this.tokenList = new List();
        for(int i = 0; i<input.length(); i++){
            if(input== "köpfchen"){
                this.tokenList.append(new Token(input.substring(i),"Start"));
            } else if (input== "halsbändchen" || input == "schleifchen"){
                this.tokenList.append(new Token(input.substring(i),"Halsschmuckchen"));
            } else if (input == "körperchen") {
                this.tokenList.append(new Token(input.substring(i), "Hauptstückchen"));
            }else if (input == "beinchen"){
                this.tokenList.append(new Token(input.substring(i), "Ende"));
            } else return false;
        }
        this.tokenList.append(new Token("#","NODATA"));
        tokenList.toFirst(); // WICHTIG!
        return true;
    }

    public String getDebugOutput(){
        return debugOutput;
    }
}

