package Client;

import java.awt.*;

import javax.swing.*;

public class UI {

	// ���������� ����������
	JFrame frame; // �����
	JButton groupsManagementButton; // ������ ��������� ���� ����������/��������
									// � �������������� �����
	JButton goodsManagementButton; // ������ ��������� ���� �����������/��������
									// � �������������� �������
	JButton statisticsWindowButton; // ������ ��������� ���� ����������
	JTextField searchFormTextField; // ����� ������ �������
	JButton changesConfirmationButton; // ������ �������������� ��������� �
										// �������
	JList<?> groupsList; // ������ ����� �������
	JLabel currentGroupLabel; // ������� ���������� ������� �������� ������
	JLabel totalLabel; // ������� "�������:" ����� �����
	JTable goodsOfGroupTable; // ����������� ������� �� ������� ������� ������
	JTextField totalPriceTextField; // ����� ����������� ��������� ���� �������
									// ������
	JTextField totalQuantityTextField; // ����� ����������� ����������
										// ���������� ������� ������

	UI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame("������� ��������� �������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());

		componentsInitialization();// ��������� ����������
		componentsPlacing();// ��������� ����������
		
		
		frame.setSize(1000, 600);
		//frame.pack();
		frame.setVisible(true);
	}

	private void componentsPlacing() {

		// ��� 1

		// ������ ��������� ���� ����������/�������� � �������������� �����
		frame.add(groupsManagementButton, new GridBagConstraints(0, 0, 1, 1, 1,
				1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ������ ��������� ���� �����������/�������� � �������������� �������
		frame.add(goodsManagementButton, new GridBagConstraints(1, 0, 1, 1, 1,
				1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ������ ��������� ���� ����������
		frame.add(statisticsWindowButton, new GridBagConstraints(2, 0, 1, 1, 1,
				1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ����� ������ �������
		frame.add(searchFormTextField, new GridBagConstraints(3, 0, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(5, 2, 2, 2), 0, 0));

		// ��� 2

		// ������� ���������� ������� �������� ������
		frame.add(currentGroupLabel, new GridBagConstraints(0, 1, 1, 4, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.CENTER,
				new Insets(2, 2, 2, 2), 0, 0));

		// ��� 3

		// ???????

		// ��� 4

		// ������ ����� �������
		frame.add(groupsList, new GridBagConstraints(0, 4, 1, 11, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ����������� ������� �� ������� ������� ������
		frame.add(goodsOfGroupTable, new GridBagConstraints(1, 4, 10, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ��� 5

		// ������� "�������:" ����� �����
		frame.add(totalLabel, new GridBagConstraints(1, 5, 1, 1, 1, 1,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 8, 2), 0, 0));

		// ����� ����������� ���������� ���������� ������� ������
		frame.add(totalQuantityTextField, new GridBagConstraints(2, 5, 1, 1, 1,
				1, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 8, 2), 0, 0));

		// ����� ����������� ��������� ���� ������� ������
		frame.add(totalPriceTextField, new GridBagConstraints(3, 5, 1, 1, 1, 1,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 8, 2), 0, 0));
		// ������ �������������� ��������� � �������
		frame.add(changesConfirmationButton, new GridBagConstraints(4, 5, 1, 1,
				1, 1, GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 5, 2), 0, 0));

	}

	private void componentsInitialization() {

		// ������ ��������� ���� ����������/�������� � �������������� �����
		groupsManagementButton = new JButton("����������� �����");

		// ������ ��������� ���� �����������/�������� � �������������� �������
		goodsManagementButton = new JButton("������/������� �����");

		// ������ ��������� ���� ����������
		statisticsWindowButton = new JButton("����������");

		// ����� ������ �������
		searchFormTextField = new JTextField();
		searchFormTextField.setText("����� ������");

		// ������� ���������� ������� �������� ������
		currentGroupLabel = new JLabel("�������� �������� ������� ������ �������");
		
		// ������ ����� �������
		groupsList = new JList();

		// ����������� ������� �� ������� ������� ������
		goodsOfGroupTable = new JTable();

		// ������� "�������:" ����� �����
		totalLabel = new JLabel("�������: ");

		// ����� ����������� ���������� ���������� ������� ������
		totalQuantityTextField = new JTextField();
		totalQuantityTextField.setText("���������� �������");

		// ����� ����������� ��������� ���� ������� ������
		totalPriceTextField = new JTextField();
		totalPriceTextField.setText("���� �������");

		// ������ �������������� ��������� � �������
		changesConfirmationButton = new JButton("ϳ���������");

	}

	public static void main(String[] args) {
		UI ui = new UI();
	}
}
