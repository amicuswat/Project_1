public class CheckWin {
    public static void main(String[] args){  // Метод надо поменять но я пока не знаю как
        // В метод надо передать массив 3*3 и значение крестика или нолика(пусть крестик = 1 нолик = 2)
        int [][] igra = {{1, 0, 1},{0, 1, 0},{1, 2, 0}}; //Тестовый массив должен попадать в класс при вызове
        int krest = 1; // или 2 если нолик эта переменная должна передаваться классу здесь вставил для тестирования
      
        int[] vertical = new int[3];
        int[] horizontal = new int[3];
        int[] diagonal = new int[3];
        for (int v = 0; v < 3; v++){
            for (int g = 0; g < 3; g++){
            if (igra[v][g] == krest){
                horizontal[v] = horizontal[v] + 1;
                vertical[g] = vertical[g] + 1;
                if(v == g) {
                    diagonal[0] = diagonal[0] + 1;
                }
                if(v == 0 & g==2||v == 1 & g == 1||v == 2 & g ==0){
                    diagonal[1] = diagonal[1] + 1;
                }
            }
        //    System.out.print(igra[v][g]); // проверяю что не перепутал горизонталь с вертикалью

            }
          //  System.out.println("");
        }

        for (int d=0; d<3; d++){
            if (horizontal[d]==3||vertical[d]==3||diagonal[d]==3 ){
                System.out.print("True"); // Здесь на самом деле должен быть возврадт True
            }           
		}
    }

    
}
