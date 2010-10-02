/*
 *  The MIT License
 * 
 *  Copyright (c) 2010 Radek Ježdík <redhead@email.cz>, Ondřej Brejla <ondrej@brejla.cz>
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.netbeans.modules.php.nette.editor.hints.ui;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.JCheckBox;
import javax.swing.tree.DefaultTreeCellRenderer;

//import org.netbeans.modules.maven.hints.pom.spi.POMErrorFixBase;
import org.openide.filesystems.FileObject;
import org.openide.util.NbBundle;

/**
 *
 * @author Radek Ježdík
 */
final class HintsPanel extends javax.swing.JPanel {

	HintsPanel() {
		initComponents();

		update();
		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(4, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.jCheckBox1.text")); // NOI18N
        jPanel1.add(jCheckBox1);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.jCheckBox2.text")); // NOI18N
        jPanel1.add(jCheckBox2);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox3, org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.jCheckBox3.text")); // NOI18N
        jPanel1.add(jCheckBox3);

        add(jPanel1);
        jPanel1.setBounds(8, 8, 520, 110);

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(HintsPanel.class, "HintsPanel.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

	synchronized void update() {
		
	}

	void cancel() {
	}

	boolean isChanged() {
		return false;
	}

	void applyChanges() {
		
	}

	private String getFileObjectLocalizedName(FileObject fo) {
		Object o = fo.getAttribute("SystemFileSystem.localizingBundle"); // NOI18N
		if(o instanceof String) {
			String bundleName = (String) o;
			try {
				ResourceBundle rb = NbBundle.getBundle(bundleName);
				String localizedName = rb.getString(fo.getPath());
				return localizedName;
			} catch(MissingResourceException ex) {
				// Do nothing return file path;
			}
		}
		return fo.getPath();
	}
	
	// Variables declaration - do not modify
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
