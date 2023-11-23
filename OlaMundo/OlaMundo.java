public class OlaMundo {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.println("executando em DEV");
        } else if (ambiente.equalsIgnoreCase("TEST")) {
            System.out.print("Executando em Test");
        } else {
            System.out.print(ambiente);
        }
        
    }
    
}
