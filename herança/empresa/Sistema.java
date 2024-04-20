package herança.empresa;

public class Sistema {
    
    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("Joao", "123", "9999", "1234", "tal", 5203.29);
        Engenheiro eng2 = new Engenheiro("Daniel", "321", "9988", "1235", "tal", 5222.39);
    
        Gerente ger1 = new Gerente("Matheus", "876", "4523", 20000.0, 4);
        Gerente ger2 = new Gerente("Thiago", "992", "9322", 40000.0, 10);

        Diretor dir1 = new Diretor("Rafael", "2222", "2223", 80000.0, 20);

        System.out.println(eng1);
        System.out.println(eng2);
        
        System.out.println(ger1);
        System.out.println(ger2);

        System.out.println(dir1);
    }

}
