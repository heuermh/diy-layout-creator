/*

    DIY Layout Creator (DIYLC).
    Copyright (c) 2009-2018 held jointly by the individual authors.

    This file is part of DIYLC.

    DIYLC is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    DIYLC is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with DIYLC.  If not, see <http://www.gnu.org/licenses/>.

*/
package org.diylc.swing.plugins.eurorack;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.diylc.swingframework.ButtonDialog;

/**
 * Eurorack power dialog.
 *
 * @author  Michael Heuer
 */
final class EurorackPowerDialog extends ButtonDialog {
  EurorackPowerDialog(final JFrame owner) {
    super(owner, "Eurorack power", new String[] { OK, CANCEL });

    setMinimumSize(new Dimension(240, 32));
    layoutGui();
  }

  @Override
  protected JComponent getMainComponent() {
      JPanel panel = new JPanel();
      panel.add(new JLabel("Eurorack power"));
      return panel;
  }
}
