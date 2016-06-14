package Client;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class GroupsManagerUI {
	JFrame frame; // �����
	JLabel groupNameLabel; // ������� "����� �����"
	JLabel groupDescriptionLabel; // ������� "���� �����"
	JComboBox<Object> groupsComboBox; // ���������� ������ �����
	JTextField groupTextField; // ���� �������� ����� ������
	JTextArea groupDescriptionTextArea; // ��������� ����� �������� ������
	JButton changesConfirmationButton; // ������ �������������� ���������
	JButton deleteButton; // ������� ��������

	GroupsManagerUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame("����������� ���� ������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());

		componentsInitialization();// ��������� ����������
		componentsPlacing();// ��������� ����������

		frame.setSize(300, 100);
		//frame.pack();
		frame.setVisible(true);
	}

	private void componentsPlacing() {

		// ��� 1

		// ������� "����� �����"
		frame.add(groupNameLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ������� "���� �����"
		frame.add(groupDescriptionLabel, new GridBagConstraints(1, 0, 1, 1, 1,
				1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ��� 2

		// ���������� ������ �����
		frame.add(groupsComboBox, new GridBagConstraints(0, 1, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ��������� ����� �������� ������
		frame.add(groupDescriptionTextArea, new GridBagConstraints(1, 1, 1, 2,
				1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ������ �������������� ���������
		frame.add(changesConfirmationButton, new GridBagConstraints(2, 1, 1, 1,
				1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ��� 3

		// ���� �������� ����� ������
		frame.add(groupTextField, new GridBagConstraints(0, 2, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		// ������� ��������
		frame.add(deleteButton, new GridBagConstraints(2, 2, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

	}

	private void componentsInitialization() {

		// ������� "����� �����"
		groupNameLabel = new JLabel("����� �����");

		// ������� "���� �����"
		groupDescriptionLabel = new JLabel("���� �����");

		// ���������� ������ �����
		groupsComboBox = new JComboBox<Object>();

		// ���� �������� ����� ������
		groupTextField = new JTextField();

		// ��������� ����� �������� ������
		groupDescriptionTextArea = new JTextArea();

		// ������ �������������� ���������
		changesConfirmationButton = new JButton("ϳ���������");

		// ������� ��������
		deleteButton = new JButton("�������� �����");
		;

	}

	public static void main(String[] args) {
		GroupsManagerUI ui = new GroupsManagerUI();
	}
}
