package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * This class is a panel that displays the death scene
 */
public class EndScenePanel 
{
	private JLabel gameInstructions = new JLabel();
	
	public JPanel createPanel()
	{
		JPanel endScenePanel   = new JPanel();
		endScenePanel .setLayout(null);
		endScenePanel .setBackground(Color.BLACK);
		endScenePanel .setBounds(0, 0, 700, 700);

		gameInstructions.setBounds(0,0,700,700);
		gameInstructions.setFont(new Font("info", Font.PLAIN, 46));
		gameInstructions.setForeground(Color.RED);
	
		String gameInfo = "YOU DIED, GAME OVER";
	
		gameInstructions.setText(gameInfo);

		endScenePanel .add(gameInstructions);
		
		return endScenePanel;
	}
}