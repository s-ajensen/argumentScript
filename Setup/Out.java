public class Out {
    public static void main(String[] args) {

    String socratesIsAMan = "unknown";
    String socratesIsACat = "unknown";
    String socratesIsMortal = "unknown";


    socratesIsAMan = "false";
    if(socratesIsAMan.equals("false")) {socratesIsACat = "true"; }

    if(socratesIsACat.equals("false")) {socratesIsAMan = "true"; }

    if(socratesIsACat.equals("true")) {socratesIsMortal = "true";}
    if(socratesIsAMan.equals("true")) {socratesIsMortal = "true";}
    System.out.println("socratesIsAMan" + " = " + socratesIsAMan);
    System.out.println("socratesIsACat" + " = " + socratesIsACat);
    System.out.println("socratesIsMortal" + " = " + socratesIsMortal);
}}
