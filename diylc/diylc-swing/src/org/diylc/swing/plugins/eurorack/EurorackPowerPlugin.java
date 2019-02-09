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

import java.awt.event.ActionEvent;

import java.util.EnumSet;

import javax.swing.AbstractAction;

import org.diylc.common.EventType;
import org.diylc.common.IPlugIn;
import org.diylc.common.IPlugInPort;

import org.diylc.swing.ISwingUI;

/**
 * Eurorack power plugin.
 *
 * @author  Michael Heuer
 */
public final class EurorackPowerPlugin implements IPlugIn {
  private final ISwingUI swingUI;

  public EurorackPowerPlugin(final ISwingUI swingUI) {
      this.swingUI = swingUI;
      swingUI.injectMenuAction(new EurorackPowerAction(), "Plugins");
  }

  @Override
  public void connect(final IPlugInPort plugInPort) {
    // empty
  }

  @Override
  public EnumSet<EventType> getSubscribedEventTypes() {
    return null;
  }

  @Override
  public void processMessage(final EventType eventType, final Object... params) {
    // empty
  }

  private class EurorackPowerAction extends AbstractAction {
      EurorackPowerAction() {
          super();
          putValue(AbstractAction.NAME, "Eurorack power...");
      }

      @Override
      public void actionPerformed(final ActionEvent e) {
          EurorackPowerDialog dialog = new EurorackPowerDialog(swingUI.getOwnerFrame());
          dialog.setVisible(true);
          dialog.requestFocus();
      }
  }
}
