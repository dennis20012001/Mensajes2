package mensajes.vista;

import java.awt.Color;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MenuAniadir extends JPanel {

	private static final long serialVersionUID = -5871082331159322418L;
	private JTextField textField;
	private JTextField textDe;
	private JTextField textPara;
	private JTextField textAsunto;
	private JTextField textContenido;

	public MenuAniadir(List<JPanel> panels) {
		setBackground(new Color(51, 51, 51));
		setBounds(0, 0, 653, 417);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(60, 26, 86, 20);
		add(textField);
		textField.setColumns(10);

		JComboBox<String> meses = new JComboBox<String>();
		meses.setBounds(181, 25, 138, 22);
		add(meses);
		meses.addItem("Enero");
		meses.addItem("Febrero");
		meses.addItem("Marzo");
		meses.addItem("Abril");
		meses.addItem("Mayo");
		meses.addItem("Junio");
		meses.addItem("Julio");
		meses.addItem("Agosto");
		meses.addItem("Septiembre");
		meses.addItem("Octubre");
		meses.addItem("Noviembre");
		meses.addItem("Diciembre");

		JComboBox<String> comboDia = new JComboBox<String>();
		comboDia.setBounds(342, 25, 53, 22);
		add(comboDia);
		for (int i = 1; i <= 31; i++) {
			comboDia.addItem(String.valueOf(i));
		}

		JLabel lblNewLabel = new JLabel("FECHA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 29, 46, 14);
		add(lblNewLabel);

		JLabel lblHora = new JLabel("HORA");
		lblHora.setForeground(Color.WHITE);
		lblHora.setBounds(10, 94, 46, 14);
		add(lblHora);

		JComboBox<String> comboHora = new JComboBox<String>();
		comboHora.setBounds(60, 90, 53, 22);
		add(comboHora);
		for (int i = 0; i <= 24; i++) {
			comboHora.addItem(String.valueOf(i));
		}

		JComboBox<String> comboMinuto = new JComboBox<String>();
		comboMinuto.setBounds(126, 90, 53, 22);
		add(comboMinuto);
		for (int i = 0; i <= 60; i++) {
			comboMinuto.addItem(String.valueOf(i));
		}

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(116, 94, 46, 14);
		add(lblNewLabel_1);

		JLabel lblHora_1 = new JLabel("DE");
		lblHora_1.setForeground(Color.WHITE);
		lblHora_1.setBounds(10, 148, 46, 14);
		add(lblHora_1);

		JLabel lblHora_1_1 = new JLabel("PARA");
		lblHora_1_1.setForeground(Color.WHITE);
		lblHora_1_1.setBounds(10, 195, 46, 14);
		add(lblHora_1_1);

		JLabel lblHora_1_1_1 = new JLabel("ASUNTO");
		lblHora_1_1_1.setForeground(Color.WHITE);
		lblHora_1_1_1.setBounds(10, 248, 46, 14);
		add(lblHora_1_1_1);

		JLabel lblHora_1_1_1_1 = new JLabel("CONTENIDO");
		lblHora_1_1_1_1.setForeground(Color.WHITE);
		lblHora_1_1_1_1.setBounds(10, 308, 67, 14);
		add(lblHora_1_1_1_1);

		textDe = new JTextField();
		textDe.setColumns(10);
		textDe.setBounds(60, 145, 318, 20);
		add(textDe);

		textPara = new JTextField();
		textPara.setColumns(10);
		textPara.setBounds(60, 192, 318, 20);
		add(textPara);

		textAsunto = new JTextField();
		textAsunto.setColumns(10);
		textAsunto.setBounds(60, 245, 318, 20);
		add(textAsunto);

		textContenido = new JTextField();
		textContenido.setColumns(10);
		textContenido.setBounds(87, 305, 291, 87);
		add(textContenido);

	}
}
