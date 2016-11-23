import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.naming.Context;
import javax.swing.*;
import javax.swing.text.View;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.util.Timer;
import java.util.TimerTask;

public class GUIMain implements ActionListener{
	
	private JFrame frame;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	
	private Room room1;
	private Room room2;
	private Room room3;
	private Room room4;
	private Room room5;
	private Room room6;
	private Room room7;
	private Room room8;
	private Room room9;
	private Room room10;
	private Room room11;
	private Room room12;
	private Room room13;
	private Room room14;
	private Room room15;
	private Room room16;
	private Room room17;
	private Room room18;
	private Room room19;
	
	private JButton clearStatus;
	
	private Object[] choices;
	private JButton[] buttons;
	
	private Room[] savedRoomArray;
	private JButton[] buttonArray;
	
	private JPanel center;
	private JPanel south;
	
	//private JLabel n1;
	//private JLabel n2;
	//private JLabel n3;
	//private JLabel n4;
	//private JLabel n5;
	//private JLabel n6;
	//private JLabel n7;
	//private JLabel n8;
	//private JLabel n9;
	//private JLabel n10;
	private JLabel northSpace;
	private JLabel eastSpace;
	private JLabel westSpace;
	
	private Timer t;
	
	public GUIMain() {
		frame = new JFrame("Patient Tracker");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());		
		center = new JPanel(new GridLayout(4, 5));
		south = new JPanel(new GridLayout(1, 1));
		
		//n1 = new JLabel("");
		//n2 = new JLabel("");
		//n3 = new JLabel("");
		//n4 = new JLabel("");
		//n5 = new JLabel("");
		//n6 = new JLabel("");
		//n7 = new JLabel("");
		//n8 = new JLabel("");
		//n9 = new JLabel("");
		//n10 = new JLabel("");
		northSpace = new JLabel("Patient Tracker Beta v1.0");
		northSpace.setFont(new Font("Arial", Font.BOLD, 30));
		northSpace.setHorizontalAlignment(SwingConstants.CENTER);
		eastSpace = new JLabel(" ");
		westSpace = new JLabel(" ");
		
		room1 = new Room(210, "Vacant");
		room2 = new Room(211, "Vacant");
		room3 = new Room(212, "Vacant");
		room4 = new Room(213, "Vacant");
		room5 = new Room(214, "Vacant");
		room6 = new Room(215, "Vacant");
		room7 = new Room(216, "Vacant");
		room8 = new Room(217, "Vacant");
		room9 = new Room(218, "Vacant");
		room10 = new Room(219, "Vacant");
		room11 = new Room(220, "Vacant");
		room12 = new Room(221, "Vacant");
		room13 = new Room(222, "Vacant");
		room14 = new Room(223, "Vacant");
		room15 = new Room(224, "Vacant");
		room16 = new Room(225, "Vacant");
		room17 = new Room(226, "Vacant");
		room18 = new Room(227, "Vacant");
		room19 = new Room(228, "Vacant");
		
		button1 = new JButton(room1.toString());
		button2 = new JButton(room2.toString());
		button3 = new JButton(room3.toString());
		button4 = new JButton(room4.toString());
		button5 = new JButton(room5.toString());
		button6 = new JButton(room6.toString());
		button7 = new JButton(room7.toString());
		button8 = new JButton(room8.toString());
		button9 = new JButton(room9.toString());
		button10 = new JButton(room10.toString());
		button11 = new JButton(room11.toString());
		button12 = new JButton(room12.toString());
		button13 = new JButton(room13.toString());
		button14 = new JButton(room14.toString());
		button15 = new JButton(room15.toString());
		button16 = new JButton(room16.toString());
		button17 = new JButton(room17.toString());
		button18 = new JButton(room18.toString());
		button19 = new JButton(room19.toString());
		
		clearStatus = new JButton("Clear Statuses");
		clearStatus.setFont(new Font("Arial", Font.BOLD, 30));
		clearStatus.addActionListener(this);
		
		savedRoomArray = new Room[19];
		savedRoomArray[0] = room1;
		savedRoomArray[1] = room2;
		savedRoomArray[2] = room3;
		savedRoomArray[3] = room4;
		savedRoomArray[4] = room5;
		savedRoomArray[5] = room6;
		savedRoomArray[6] = room7;
		savedRoomArray[7] = room8;
		savedRoomArray[8] = room9;
		savedRoomArray[9] = room10;
		savedRoomArray[10] = room11;
		savedRoomArray[11] = room12;
		savedRoomArray[12] = room13;
		savedRoomArray[13] = room14;
		savedRoomArray[14] = room15;
		savedRoomArray[15] = room16;
		savedRoomArray[16] = room17;
		savedRoomArray[17] = room18;
		savedRoomArray[18] = room19;
		
		buttonArray = new JButton[19];
		buttonArray[0] = button1;
		buttonArray[1] = button2;
		buttonArray[2] = button3;
		buttonArray[3] = button4;
		buttonArray[4] = button5;
		buttonArray[5] = button6;
		buttonArray[6] = button7;
		buttonArray[7] = button8;
		buttonArray[8] = button9;
		buttonArray[9] = button10;
		buttonArray[10] = button11;
		buttonArray[11] = button12;
		buttonArray[12] = button13;
		buttonArray[13] = button14;
		buttonArray[14] = button15;
		buttonArray[15] = button16;
		buttonArray[16] = button17;
		buttonArray[17] = button18;
		buttonArray[18] = button19;
		
		buttons = new JButton[]{button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 30));
			buttons[i].setBackground(Color.GREEN);
			center.add(buttons[i]);
		}
		
		//south.add(n1);
		//south.add(n2);
		//south.add(n3);
		//south.add(n4);
		//south.add(n5);
		//south.add(n6);
		//south.add(n7);
		//south.add(n8);
		//south.add(n9);
		//south.add(n10);
		south.add(clearStatus);
		frame.add(northSpace, BorderLayout.NORTH);
		frame.add(eastSpace, BorderLayout.EAST);
		frame.add(westSpace, BorderLayout.WEST);
		frame.add(center, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
	
		choices = new String[]{"Vacant", "Occupied", "Isolation", "Isolation VRE", "Isolation MRSA", "Isolation CDIF", "Isolation Airborne", "Isolation DROPLET", "Discharged N/Cleaned", "Pre Admit"};
		
		loadData();
		
		t = new Timer( );
		t.scheduleAtFixedRate(new TimerTask() {
		    public void run() {
		      loadData();
		    }
		}, 1000,10);
		
		frame.setVisible(true);
	}
	
	public void newStatus(JButton button, Room room) {
		t.cancel();
		String input = (String) JOptionPane.showInputDialog(null, "Choose the status:", "Status Update", JOptionPane.DEFAULT_OPTION, null, choices, choices[0]);
		if (input == null) {
			t = new Timer( );
			t.scheduleAtFixedRate(new TimerTask() {
			    public void run() {
			      System.out.println("Hey");
			      loadData();
			    }
			}, 1000,10);
		} else {
			room.setStatus(input);
			saveData();
			display(button, room);
			t = new Timer( );
			t.scheduleAtFixedRate(new TimerTask() {
			    public void run() {
			      System.out.println("Hey");
			      loadData();
			    }
			}, 1000,10);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == button1) {
			newStatus(button1, savedRoomArray[0]);
		} else if (source == button2) {
			newStatus(button2, savedRoomArray[1]);
		} else if (source == button3) {
			newStatus(button3, savedRoomArray[2]);
		} else if (source == button4) {
			newStatus(button4, savedRoomArray[3]);
		} else if (source == button5) {
			newStatus(button5, savedRoomArray[4]);
		} else if (source == button6) {
			newStatus(button6, savedRoomArray[5]);
		} else if (source == button7) {
			newStatus(button7, savedRoomArray[6]);
		} else if (source == button8) {
			newStatus(button8, savedRoomArray[7]);
		} else if (source == button9) {
			newStatus(button9, savedRoomArray[8]);
		} else if (source == button10) {
			newStatus(button10, savedRoomArray[9]);
		} else if (source == button11) {
			newStatus(button11, savedRoomArray[10]);
		} else if (source == button12) {
			newStatus(button12, savedRoomArray[11]);
		} else if (source == button13) {
			newStatus(button13, savedRoomArray[12]);
		} else if (source == button14) {
			newStatus(button14, savedRoomArray[13]);
		} else if (source == button15) {
			newStatus(button15, savedRoomArray[14]);
		} else if (source == button16) {
			newStatus(button16, savedRoomArray[15]);
		} else if (source == button17) {
			newStatus(button17, savedRoomArray[16]);
		} else if (source == button18) {
			newStatus(button18, savedRoomArray[17]);
		} else if (source == button19) {
			newStatus(button19, savedRoomArray[18]);
		} else if (source == clearStatus) {
			t.cancel();
			int input = JOptionPane.showConfirmDialog(frame, "Clear all statuses?");
			if (input == JOptionPane.YES_OPTION) {
				clear();
				saveData();
			} else {
				t = new Timer( );
				t.scheduleAtFixedRate(new TimerTask() {
				    public void run() {
				      System.out.println("Hey");
				      loadData();
				    }
				}, 1000,10);
			}
		}
	}
	
	public void display(JButton button, Room room) {
		button.setText(room.toString());
		String status = room.getStatus();
		if (status.equals("Vacant")) {
			button.setBackground(Color.GREEN);
		} else if (status.equals("Occupied")) {
			button.setBackground(Color.ORANGE);
		} else if (status.equals("Isolation")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Isolation VRE")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Isolation MRSA")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Isolation CDIF")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Isolation Airborne")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Isolation DROPLET")) {
			button.setBackground(Color.RED);
		} else if (status.equals("Discharged N/Cleaned")) {
			button.setBackground(Color.cyan);
		} else if (status.equals("Pre Admit")) {
			button.setBackground(Color.GRAY);
		} 
	}
	
	public void clear() {
		for (int i = 0; i < savedRoomArray.length; i++) {
			savedRoomArray[i].setStatus("Vacant");
			display(buttonArray[i], savedRoomArray[i]);
		}
	}
	
	public void saveData() {
		CSVWriter writer;
		try {
			writer = new CSVWriter(new FileWriter("data/myData.csv"));
			for (int i = 0; i < savedRoomArray.length ; i++) {
				String roomNum = Integer.toString(savedRoomArray[i].getRoomNum());
				String status = savedRoomArray[i].getStatus();
				String patients = Integer.toString(savedRoomArray[i].getPatients());
				String[] entries = (roomNum + "," + status + "," + patients).split(",");
				writer.writeNext(entries);
			}
			writer.close();
		} catch (IOException e) {
			System.err.println("Error saving");
		}
    }
	
	 public void loadData() {
		CSVReader reader;
		try {
			reader = new CSVReader(new FileReader("data/myData.csv"));
			List<String[]> myEntries = new ArrayList<>();
			myEntries = reader.readAll();
			for (int i = 0; i < myEntries.size(); i++) {
				int roomNum = Integer.parseInt(myEntries.get(i)[0]);
				String status = myEntries.get(i)[1];
				int patients = Integer.parseInt(myEntries.get(i)[2]);
				savedRoomArray[i] = new Room(roomNum, status, patients);
			}
		    for (int i = 0; i < savedRoomArray.length; i++) {
				display(buttonArray[i], savedRoomArray[i]);
			}	
		} catch (FileNotFoundException e) {
			System.err.println("Error loading");
		} catch (IOException e) {
			System.err.println("Error saving");
		}
	 }

	public static void main(String[] args) {
		GUIMain test = new GUIMain();
	}
}
