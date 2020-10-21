
package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class HataKontrol_2 {
    public static void main(String[] args) {
        String [] dizi2 = {"1","2","34","d","3c"};
        try{
        for (int i = 0; i < dizi2.length; i++) {
            int sayi=Integer.parseInt(dizi2[i]);
            System.out.println(sayi);
        }
        }
        catch(NumberFormatException e){
            System.out.println("format hatası");
        }
        catch (Exception e){
            System.out.println("biçim hatası");
        }
                
    }
}
