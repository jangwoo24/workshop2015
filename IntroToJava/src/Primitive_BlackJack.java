//import java.util.Random;
//
//import javax.swing.JOptionPane;
//
//
//public class Primitive_BlackJack
//{
//public static void main(String[] args)
//{
//		int card1 = new Random().nextInt(9);
//		card1 = card1 + 1;
//		int card2 = new Random().nextInt(9);
//		card2 = card2 + 1;
//		int card3 = new Random().nextInt(9);
//		card3 = card3 + 1;
//		int sum1 = card1 + card2;
//		int Hit = JOptionPane.showConfirmDialog(null, "You got " + sum1 + ", do you want to hit?", "", JOptionPane.YES_NO_OPTION);
//		int sum = 0;
//		int newsum = 0;
//
//		if(Hit == JOptionPane.YES_OPTION)
//		{
//			sum = sum1 + card3;
//		}
//		else
//		{
//			sum = sum1;
//		}
//		newsum = 21-sum;
//		JOptionPane.showMessageDialog(null, "You got " + sum + ", and your score was " + newsum);
//
//}
//}
