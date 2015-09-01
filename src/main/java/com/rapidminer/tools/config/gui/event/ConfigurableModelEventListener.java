/**
 * Copyright (C) 2001-2015 by RapidMiner and the contributors
 *
 * Complete list of developers available at our web site:
 *
 *      http://rapidminer.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package com.rapidminer.tools.config.gui.event;

import com.rapidminer.tools.config.gui.model.ConfigurableModel;

import java.util.EventListener;


/**
 * An object listening for {@link ConfigurableEvent}s on the {@link ConfigurableModel} must
 * implement this interface and register itself as a listener to the model.
 * 
 * @author Marco Boeck
 * 
 */
public interface ConfigurableModelEventListener extends EventListener {

	public void modelChanged(ConfigurableEvent e);

}
