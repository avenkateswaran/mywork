package nondigital;

import java.awt.Color;
import java.awt.Component;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import reporter.Reporter;

/**
 *
 * @author OLU
 */
public class UI extends javax.swing.JFrame {

	JUnitCore junit = new JUnitCore();
	Reporter reporter = new Reporter();
	final ExecutorService executor = Executors.newFixedThreadPool(5);

	/**
	 * Creates new UI
	 */
	public UI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialise the form.
	 */

	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		headerPanel = new javax.swing.JPanel();
		header = new javax.swing.JLabel();
		bodyPanel = new javax.swing.JPanel();
		ind = new javax.swing.JLabel();
		org = new javax.swing.JLabel();
		agent = new javax.swing.JLabel();
		indSA = new javax.swing.JButton();
		indVat = new javax.swing.JButton();
		orgVAT = new javax.swing.JButton();
		orgSA = new javax.swing.JButton();
		orgSATrust = new javax.swing.JButton();
		orgCharities = new javax.swing.JButton();
		orgCoTax = new javax.swing.JButton();
		agVAT = new javax.swing.JButton();
		orgPaye = new javax.swing.JButton();
		orgSAPart = new javax.swing.JButton();
		agPaye = new javax.swing.JButton();
		agSA = new javax.swing.JButton();
		agCharities = new javax.swing.JButton();
		agCoTax = new javax.swing.JButton();
		resultPanel = new javax.swing.JPanel();
		errorResult = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		errorArea = new javax.swing.JTextArea();
		helpMenu = new javax.swing.JMenu();
		menuBar = new javax.swing.JMenuBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		headerPanel.setLayout(new java.awt.GridBagLayout());

		header.setFont(new java.awt.Font("Tahoma", 1, 18));
		header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		header.setText("Government Gateway Registration and Enrolment v1.3");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.ipadx = 34;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(12, 190, 12, 197);
		headerPanel.add(header, gridBagConstraints);

		bodyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		bodyPanel.setLayout(new java.awt.GridBagLayout());

		ind.setFont(new java.awt.Font("Tahoma", 1, 14));
		ind.setText("Individual");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(23, 105, 0, 0);
		bodyPanel.add(ind, gridBagConstraints);

		org.setFont(new java.awt.Font("Tahoma", 1, 14));
		org.setText("Organisation");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(23, 201, 0, 0);
		bodyPanel.add(org, gridBagConstraints);

		agent.setFont(new java.awt.Font("Tahoma", 1, 14));
		agent.setText("Agent");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.ipadx = 30;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(25, 228, 0, 0);
		bodyPanel.add(agent, gridBagConstraints);

		indSA.setFont(new java.awt.Font("Tahoma", 1, 11));
		indSA.setText("SA");
		indSA.setMaximumSize(new java.awt.Dimension(120, 30));
		indSA.setMinimumSize(new java.awt.Dimension(120, 30));
		indSA.setPreferredSize(new java.awt.Dimension(120, 30));
		indSA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				indSAActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 75, 0, 0);
		bodyPanel.add(indSA, gridBagConstraints);

		indVat.setFont(new java.awt.Font("Tahoma", 1, 11));
		indVat.setText("VAT");
		indVat.setMaximumSize(new java.awt.Dimension(120, 30));
		indVat.setMinimumSize(new java.awt.Dimension(120, 30));
		indVat.setPreferredSize(new java.awt.Dimension(120, 30));
		indVat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				indVatActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 75, 0, 0);
		bodyPanel.add(indVat, gridBagConstraints);

		orgVAT.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgVAT.setText("VAT");
		orgVAT.setMaximumSize(new java.awt.Dimension(120, 30));
		orgVAT.setMinimumSize(new java.awt.Dimension(120, 30));
		orgVAT.setPreferredSize(new java.awt.Dimension(120, 30));
		orgVAT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgVATActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 184, 0, 0);
		bodyPanel.add(orgVAT, gridBagConstraints);

		orgSA.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgSA.setText("SA");
		orgSA.setMaximumSize(new java.awt.Dimension(120, 30));
		orgSA.setMinimumSize(new java.awt.Dimension(120, 30));
		orgSA.setPreferredSize(new java.awt.Dimension(120, 30));
		orgSA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgSAActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 184, 0, 0);
		bodyPanel.add(orgSA, gridBagConstraints);

		orgSATrust.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgSATrust.setText("SA Trust");
		orgSATrust.setMaximumSize(new java.awt.Dimension(120, 30));
		orgSATrust.setMinimumSize(new java.awt.Dimension(120, 30));
		orgSATrust.setPreferredSize(new java.awt.Dimension(120, 30));
		orgSATrust.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgSATrustActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 9;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(11, 184, 64, 0);
		bodyPanel.add(orgSATrust, gridBagConstraints);

		orgCharities.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgCharities.setText("Charities");
		orgCharities.setMaximumSize(new java.awt.Dimension(120, 30));
		orgCharities.setMinimumSize(new java.awt.Dimension(120, 30));
		orgCharities.setPreferredSize(new java.awt.Dimension(120, 30));
		orgCharities.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgCharitiesActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 184, 0, 0);
		bodyPanel.add(orgCharities, gridBagConstraints);

		orgCoTax.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgCoTax.setText("Corp Tax");
		orgCoTax.setMaximumSize(new java.awt.Dimension(120, 30));
		orgCoTax.setMinimumSize(new java.awt.Dimension(120, 30));
		orgCoTax.setPreferredSize(new java.awt.Dimension(120, 30));
		orgCoTax.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgCoTaxActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 184, 0, 0);
		bodyPanel.add(orgCoTax, gridBagConstraints);

		agVAT.setFont(new java.awt.Font("Tahoma", 1, 11));
		agVAT.setText("VAT");
		agVAT.setMaximumSize(new java.awt.Dimension(120, 30));
		agVAT.setMinimumSize(new java.awt.Dimension(120, 30));
		agVAT.setPreferredSize(new java.awt.Dimension(120, 30));
		agVAT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agVATActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(18, 191, 0, 101);
		bodyPanel.add(agVAT, gridBagConstraints);

		orgPaye.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgPaye.setText("PAYE");
		orgPaye.setMaximumSize(new java.awt.Dimension(120, 30));
		orgPaye.setMinimumSize(new java.awt.Dimension(120, 30));
		orgPaye.setPreferredSize(new java.awt.Dimension(120, 30));
		orgPaye.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgPayeActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 184, 0, 0);
		bodyPanel.add(orgPaye, gridBagConstraints);

		orgSAPart.setFont(new java.awt.Font("Tahoma", 1, 11));
		orgSAPart.setText("SA Partnership");
		orgSAPart.setMaximumSize(new java.awt.Dimension(120, 30));
		orgSAPart.setMinimumSize(new java.awt.Dimension(120, 30));
		orgSAPart.setPreferredSize(new java.awt.Dimension(120, 30));
		orgSAPart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				orgSAPartActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 184, 0, 0);
		bodyPanel.add(orgSAPart, gridBagConstraints);

		agPaye.setFont(new java.awt.Font("Tahoma", 1, 11));
		agPaye.setText("PAYE");
		agPaye.setMaximumSize(new java.awt.Dimension(120, 30));
		agPaye.setMinimumSize(new java.awt.Dimension(120, 30));
		agPaye.setPreferredSize(new java.awt.Dimension(120, 30));
		agPaye.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agPayeActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 191, 0, 101);
		bodyPanel.add(agPaye, gridBagConstraints);

		agSA.setFont(new java.awt.Font("Tahoma", 1, 11));
		agSA.setText("SA");
		agSA.setMaximumSize(new java.awt.Dimension(120, 30));
		agSA.setMinimumSize(new java.awt.Dimension(120, 30));
		agSA.setPreferredSize(new java.awt.Dimension(120, 30));
		agSA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agSAActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(11, 191, 0, 101);
		bodyPanel.add(agSA, gridBagConstraints);

		agCharities.setFont(new java.awt.Font("Tahoma", 1, 11));
		agCharities.setText("Charities");
		agCharities.setMaximumSize(new java.awt.Dimension(120, 30));
		agCharities.setMinimumSize(new java.awt.Dimension(120, 30));
		agCharities.setPreferredSize(new java.awt.Dimension(120, 30));
		agCharities.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agCharitiesActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 191, 0, 101);
		bodyPanel.add(agCharities, gridBagConstraints);

		agCoTax.setFont(new java.awt.Font("Tahoma", 1, 11));
		agCoTax.setText("Corp Tax");
		agCoTax.setMaximumSize(new java.awt.Dimension(120, 30));
		agCoTax.setMinimumSize(new java.awt.Dimension(120, 30));
		agCoTax.setPreferredSize(new java.awt.Dimension(120, 30));
		agCoTax.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				agCoTaxActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(6, 191, 0, 101);
		bodyPanel.add(agCoTax, gridBagConstraints);

		resultPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		errorResult.setFont(new java.awt.Font("Tahoma", 1, 16));
		errorResult.setText("   Result Status");

		errorArea.setColumns(20);
		errorArea.setRows(5);
		jScrollPane1.setViewportView(errorArea);

		javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
		resultPanel.setLayout(resultPanelLayout);
		resultPanelLayout
				.setHorizontalGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(resultPanelLayout.createSequentialGroup().addGap(12, 12, 12)
								.addComponent(jScrollPane1).addGap(12, 12, 12))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						resultPanelLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(errorResult, javax.swing.GroupLayout.PREFERRED_SIZE, 467,
										javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		resultPanelLayout
				.setVerticalGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(resultPanelLayout.createSequentialGroup().addComponent(errorResult).addGap(2, 2, 2)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addGap(1, 1, 1)));
		
		helpMenu.setFont(new java.awt.Font("Tahoma", 1, 11));
		helpMenu.setText("Help");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });
        menuBar.add(helpMenu);
        
        setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(resultPanel,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}

	/* Organisation Corporate Tax*/
	private void orgCoTaxActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgCoTax.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_CorpTax_Register.class);
					final Result result2 = junit.run(Organisation_CorpTax_Enroll.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							errorMessageDisplay(result2);
							reporter.message = result2.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Individual VAT */
	private void indVatActionPerformed(java.awt.event.ActionEvent evt) {
		if (indVat.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Individual_VAT.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Individual SA */
	private void indSAActionPerformed(java.awt.event.ActionEvent evt) {
		errorResult.setText("   Result Status");
		errorArea.setText("");
		Component[] com = resultPanel.getComponents();
		for (int a = 0; a < com.length; a++) {
			com[a].setEnabled(false);
		}
		executor.execute(new Runnable() {
			public void run() {
				final Result result = junit.run(Individual_SA_Register.class);
				final Result result2 = junit.run(Individual_SA_Enroll.class);
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						errorMessageDisplay(result);
						errorMessageDisplay(result2);
						reporter.message = result2.toString();
						Component[] com2 = resultPanel.getComponents();
						for (int a = 0; a < com2.length; a++) {
							com2[a].setEnabled(true);
						}
					}
				});
			}
		});
	}

	/* Organisation VAT*/
	private void orgVATActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgVAT.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_VAT.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Organisation SA*/
	private void orgSAActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgSA.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_SA.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Organisation Charities*/
	private void orgCharitiesActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgCharities.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_Charities.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Organisation PAYE*/
	private void orgPayeActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgPaye.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_PAYE.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Organisation SA Partnership*/
	private void orgSAPartActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgSAPart.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_SA_PART.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Organisation SA Trust*/
	private void orgSATrustActionPerformed(java.awt.event.ActionEvent evt) {
		if (orgSATrust.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Organisation_SA_TRUST.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Agent VAT*/
	private void agVATActionPerformed(java.awt.event.ActionEvent evt) {
		if (agVAT.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Agent_VAT.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Agent SA*/
	private void agSAActionPerformed(java.awt.event.ActionEvent evt) {
		if (agSA.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Agent_SA.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Agent Charities*/
	private void agCharitiesActionPerformed(java.awt.event.ActionEvent evt) {
		if (agCharities.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Agent_Charities.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Agent CT*/
	private void agCoTaxActionPerformed(java.awt.event.ActionEvent evt) {
		if (agCoTax.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Agent_CorpTax.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}

	/* Agent PAYE*/
	private void agPayeActionPerformed(java.awt.event.ActionEvent evt) {
		if (agPaye.isEnabled()) {
			errorResult.setText("   Result Status");
			errorArea.setText("");
			Component[] com = resultPanel.getComponents();
			for (int a = 0; a < com.length; a++) {
				com[a].setEnabled(false);
			}
			executor.execute(new Runnable() {
				public void run() {
					final Result result = junit.run(Agent_PAYE.class);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							errorMessageDisplay(result);
							reporter.message = result.toString();
							Component[] com2 = resultPanel.getComponents();
							for (int a = 0; a < com2.length; a++) {
								com2[a].setEnabled(true);
							}
						}
					});
				}
			});
		}
	}
	
	private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {                                         

		JOptionPane.showMessageDialog(null, "Work");
    }

	public void errorMessageDisplay(Result resultPass) {
		if (resultPass.getFailureCount() > 0) {
			errorResult.setForeground(Color.red);
			errorResult.setVisible(true);
			errorResult.setText(" Failed. Check Captured Screen Shots");

			errorArea.setVisible(true);
			errorArea.setText(resultPass.getFailures().toString());
		}

		else {
			errorResult.setForeground(Color.green);
			errorResult.setText(" Completed Successfully");
			errorResult.setVisible(true);

			// errorArea.setForeground(Color.green);
			errorArea.setVisible(true);
			errorArea.setText(resultPass.getFailures().toString());
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the UI */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UI().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton agCharities;
	private javax.swing.JButton agCoTax;
	private javax.swing.JButton agPaye;
	private javax.swing.JButton agSA;
	private javax.swing.JButton agVAT;
	private javax.swing.JLabel agent;
	private javax.swing.JPanel bodyPanel;
	private javax.swing.JTextArea errorArea;
	private javax.swing.JLabel errorResult;
	private javax.swing.JLabel header;
	private javax.swing.JPanel headerPanel;
	private javax.swing.JLabel ind;
	private javax.swing.JButton indSA;
	private javax.swing.JButton indVat;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel org;
	private javax.swing.JButton orgCharities;
	private javax.swing.JButton orgCoTax;
	private javax.swing.JButton orgPaye;
	private javax.swing.JButton orgSA;
	private javax.swing.JButton orgSAPart;
	private javax.swing.JButton orgSATrust;
	private javax.swing.JButton orgVAT;
	private javax.swing.JPanel resultPanel;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JMenuBar menuBar;
	// End of variables declaration
}
