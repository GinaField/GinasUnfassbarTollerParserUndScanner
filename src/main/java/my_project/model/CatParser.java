package my_project.model;

public class CatParser implements Parser {

    private CatScanner scanner;

    public CatParser() {
        scanner = new CatScanner();
    }

    @Override
    /**
     * Diese Methode parst eine Eingabe und stellt fest, ob sie zur Sprache L_Knebi = k(ne)*bi gehört
     */
    public boolean parse(String input) {
        /*if (scanner.scan(input)) {
            if (scanner.getType().equals("START")) {
                scanner.nextToken();
                if (scanner.getType().equals("köpfchen")) {
                    scanner.nextToken();
                    if (scanner.getType().equals("halsschmuckchen")) {
                        scanner.nextToken();
                    while (scanner.getType().equals("körperchen")) scanner.nextToken();
                    while (scanner.getType().equals("END")) scanner.nextToken();
                        if (scanner.getType().equals("NODATA")) return true;
                    }
                }
            }
        }
        return false;

         */
        if (scanner.scan(input)) {
            if (scanner.getType().equals("START")) {
                scanner.nextToken();
                if (scanner.getType().equals("köpfchen")) {
                    scanner.nextToken();
                    if (scanner.getType().equals("halsschmuckchen")) {
                        scanner.nextToken();
                        while (scanner.getType().equals("körperchen") && scanner.getType().equals("beinchen") && scanner.getType().equals("beinchen")) scanner.nextToken();
                        while (scanner.getType().equals("END")) scanner.nextToken();
                        if (scanner.getType().equals("NODATA")) return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    /**
     * Diese Methode dient dazu die Funktionalität des verwendeten Scanners zu überprüfen.
     * @return true, falls der Scanner für die Sprache des Parsers das Wort akzeptiert, sonst false
     */
    public boolean getScannerResult(String input) {
        return scanner.scan(input);
    }

    @Override
    public String getScannerOutput() {
        return null;
    }
}

