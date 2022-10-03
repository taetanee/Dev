package work;

public class ProdName {

    static public void main(String[] args) {

        ProdName p = new ProdName();
        p.changeProductName("삼성증권Re","김태환");
        p.changeProductName("삼성증권Re-김태환","김태환");
        p.changeProductName("김태환-삼성증권Re","김태환");
        p.changeProductName("삼성증권Re-김지수","김지수");

        p.changeProductName("1234-zab56-23");
    }

    public String changeProductName(String pn,String un){
        String result = "";
        result = pn.replace(un, "*암호화*");
        //System.out.println(result);
        return result;
    }

    public String changeProductName(String pn){
        String result = "";
        result = pn.replaceAll("","");
        result = pn.replace("","");
        System.out.println(result);
        return result;
    }


}