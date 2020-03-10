import list.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        Scanner inp = new Scanner(System.in);

        try {
            File myObj = new File("sda.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] splitter = data.split("::");
              ll.add(splitter[0]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        while(true){
            System.out.print("\tProgram LinkedList Struktur Data dan Algoritma\n\n1. Cari nama editor\n2. Tampilan semua editor\n\nMasukkan Pilihan : ");
            int pilihan = Integer.parseInt(inp.nextLine());
            if(pilihan == 1){
                System.out.print("Input nama editor : ");
                String editor = inp.nextLine();
                System.out.println("\n" + ll.fetchData(editor));
            }else if(pilihan == 2){
                ll.display();
            }else{
                System.out.println("Pilihan tidak ditemukan\n");
                System.exit(1);
            }
            System.out.println("----------------------------------------------------\n\n");
        }

    }
}