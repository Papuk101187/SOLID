public class CesarSymbolCrypter implements SybbolCrypter{

    String string;

    @Override
    public Character crypt(char c) {
        String elem = String.valueOf(c);
        char elemconvert = (char)(elem.charAt(0)+1);
        return elemconvert;
    }

    @Override
    public Character uncrypt(char c) {
        {
            System.out.println("Н"+ c);
        }
        String elem = String.valueOf(c);
        char elemconvert = (char)(elem.charAt(0));
        return elemconvert;
}

    @Override
    public String name() {
        return "цезаря";
    }


}

