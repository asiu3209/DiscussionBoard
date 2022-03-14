import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Message Test 1 uname-message: ");
        String[] msg1 = t.nextLine().split("-");
        System.out.print("Message Test 2 uname-message: ");
        String[] msg2 = t.nextLine().split("-");
        System.out.print("Photo Test 1 uname-filename-caption: ");
        String[] msg3 = t.nextLine().split("-");
        MessagePost temp1 = new MessagePost(msg1[0],msg1[1]);
        MessagePost temp2 = new MessagePost(msg2[0],msg2[1]);
        PhotoPost temp3 = new PhotoPost(msg3[0],msg3[1],msg3[2]);
        NewsFeed temp4 = new NewsFeed();
        temp4.addMessagePost(temp1);
        temp4.addMessagePost(temp2);
        temp4.addPhotoPost(temp3);
        temp4.show();
    }
}
