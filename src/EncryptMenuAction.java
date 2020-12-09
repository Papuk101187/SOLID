public class EncryptMenuAction implements MenuBase {

    public StringCrypter stringCrypter;
    public String string;
    public String namess;




    public EncryptMenuAction(StringCrypter cesar,String s) {
        this.stringCrypter = cesar;
        this.namess = stringCrypter.getname();
        this.string=s;
    }


    @Override
    public String name() {
        return "Шифрование методом " + namess;
    }

    @Override
    public void active() {

        System.out.println(stringCrypter.crypt(string));

    }


}
