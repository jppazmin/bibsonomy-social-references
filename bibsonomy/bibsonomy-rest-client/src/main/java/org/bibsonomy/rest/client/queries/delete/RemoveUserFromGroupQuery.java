/**
 *
 *  BibSonomy-Rest-Client - The REST-client.
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

package org.bibsonomy.rest.client.queries.delete;

import static org.bibsonomy.util.ValidationUtils.present;

import org.bibsonomy.common.enums.Status;
import org.bibsonomy.rest.client.AbstractQuery;
import org.bibsonomy.rest.client.exception.ErrorPerformingRequestException;
import org.bibsonomy.rest.enums.HttpMethod;
import org.bibsonomy.rest.exceptions.BadRequestOrResponseException;

/**
 * Use this Class to remove an user from a group.
 * 
 * @author Manuel Bork <manuel.bork@uni-kassel.de>
 * @version $Id: RemoveUserFromGroupQuery.java,v 1.10 2011-05-24 09:38:20 bibsonomy Exp $
 */
public final class RemoveUserFromGroupQuery extends AbstractQuery<String> {
	private final String userName;
	private final String groupName;

	/**
	 * Remove an user from a group.
	 * 
	 * @param userName
	 *            the userName to be removed from the group
	 * @param groupName
	 *            group from which the user is to be removed
	 * @throws IllegalArgumentException
	 *             if userName or groupName are null or empty
	 */
	public RemoveUserFromGroupQuery(final String userName, final String groupName) throws IllegalArgumentException {
		if (!present(userName)) throw new IllegalArgumentException("no username given");
		if (!present(groupName)) throw new IllegalArgumentException("no groupname given");

		this.userName = userName;
		this.groupName = groupName;
	}

	@Override
	protected String doExecute() throws ErrorPerformingRequestException {
		this.downloadedDocument = performRequest(HttpMethod.DELETE, URL_GROUPS + "/" + this.groupName + "/" + URL_USERS + "/" + this.userName, null);
		return null;
	}
	
	@Override
	public String getResult() throws BadRequestOrResponseException, IllegalStateException {
		if (this.isSuccess())
			return Status.OK.getMessage();
		return this.getError();
	}	
}