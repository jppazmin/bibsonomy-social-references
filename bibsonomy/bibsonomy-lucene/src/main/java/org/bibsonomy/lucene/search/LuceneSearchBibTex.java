/**
 *
 *  BibSonomy-Lucene - A blue social bookmark and publication sharing system.
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

package org.bibsonomy.lucene.search;

import org.bibsonomy.model.BibTex;

/**
 * TODO: rename to LuceneSearchPublications
 * 
 * class for publication search
 * 
 * @author fei
 * @version $Id: LuceneSearchBibTex.java,v 1.24 2010-09-30 10:12:35 nosebrain Exp $
 */
public class LuceneSearchBibTex extends LuceneAbstractPublicationSearch<BibTex> {
	private final static LuceneSearchBibTex singleton = new LuceneSearchBibTex();
	
	/**
	 * @return LuceneSearchBookmarks
	 */
	public static LuceneSearchBibTex getInstance() {
		return singleton;
	}
	
	/**
	 * constructor
	 */
	private LuceneSearchBibTex() {
		this.reloadIndex(0);
	}
	
	@Override
	protected String getResourceName() {
		return BibTex.class.getSimpleName();
	}
}