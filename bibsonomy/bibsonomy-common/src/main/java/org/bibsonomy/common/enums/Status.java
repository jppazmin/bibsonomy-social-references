/**
 *
 *  BibSonomy-Common - Common things (e.g., exceptions, enums, utils, etc.)
 *
 *  Copyright (C) 2006 - 2011 Knowledge & Data Engineering Group,
 *                            University of Kassel, Germany
 *                            http://www.kde.cs.uni-kassel.de/
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.bibsonomy.common.enums;

/**
 * Some statuses that may indicate success or failure of a certain job.
 * 
 * @author Dominik Benz
 * @version $Id: Status.java,v 1.8 2011-04-29 06:36:53 bibsonomy Exp $
 */
public enum Status {
	/** everything is ok */
	OK("OK"),
	/** something went wrong */
	FAIL("Failure");

	private final String message;

	private Status(final String message) {
		this.message = message;
	}

	/**
	 * @return a string message describing the state
	 */
	public String getMessage() {
		return this.message;
	}
}