public class RandomCombination {
    public static void main(String[] args) {
        int[][] array = new int[5][10]; // 5 tabelas com 10 linhas

        /*
         tabela1(10(randomNumber))
         tabela2(10(randomNumber))
         tabela3(10(randomNumber))
         tabela4(10(randomNumber))
         tabela5(10(randomNumber))
         */
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = randomNumber();
            }
            
        }
        print2DArray(array);
        
    }

    public static int randomNumber(){
        double randomNumber = Math.random() *100;
        return (int) randomNumber;
    }

    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.println(array[i][j]);
            }

            System.out.println("\n");
        }
        
    }
    
}
