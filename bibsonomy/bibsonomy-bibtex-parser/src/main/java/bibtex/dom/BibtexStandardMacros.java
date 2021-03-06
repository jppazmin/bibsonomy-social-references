/**
 *  
 *  BibSonomy-BibTeX-Parser - BibTeX Parser from
 * 		http://www-plan.cs.colorado.edu/henkel/stuff/javabib/
 *   
 *  Copyright (C) 2006 - 2010 Knowledge & Data Engineering Group, 
 *                            University of Kassel, Germany
 *                            http://www.kde.cs.uni-kassel.de/
 *  
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

/*
 * Created on Mar 22, 2003
 *
 * @author henkel@cs.colorado.edu
 * 
 */
package bibtex.dom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * With standard macros we mean the ones defined in plain.bst
 * 
 * @author henkel
 */
public final class BibtexStandardMacros {

	private static HashSet monthAbbr = new HashSet();
	static {
		monthAbbr.addAll(
			Arrays.asList(
				new String[] {
					"jan",
					"feb",
					"mar",
					"apr",
					"may",
					"jun",
					"jul",
					"aug",
					"sep",
					"oct",
					"nov",
					"dec" }));
	}
	public static boolean isMonthAbbreviation(String string) {
	    
	    assert string!=null: "string parameter may not be null.";
		return monthAbbr.contains(string);
	}
	private static HashMap standardMacros = new HashMap();
	static {
		standardMacros.put("jan", "January");
		standardMacros.put("feb", "February");
		standardMacros.put("mar", "March");
		standardMacros.put("apr", "April");
		standardMacros.put("may", "May");
		standardMacros.put("jun", "June");
		standardMacros.put("jul", "July");
		standardMacros.put("aug", "August");
		standardMacros.put("sep", "September");
		standardMacros.put("oct", "October");
		standardMacros.put("nov", "November");
		standardMacros.put("dec", "December");
		standardMacros.put("acmcs", "ACM Computing Surveys");
		standardMacros.put("acta", "Acta Informatica");
		standardMacros.put("cacm", "Communications of the ACM");
		standardMacros.put("ibmjrd", "IBM Journal of Research and Development");
		standardMacros.put("ibmsj", "IBM Systems Journal");
		standardMacros.put("ieeese", "IEEE Transactions on Software Engineering");
		standardMacros.put("ieeetc", "IEEE Transactions on Computers");
		standardMacros.put(
			"ieeetcad",
			"IEEE Transactions on Computer-Aided Design of Integrated Circuits");
		standardMacros.put("ipl", "Information Processing Letters");
		standardMacros.put("jacm", "Journal of the ACM");
		standardMacros.put("jcss", "Journal of Computer and System Sciences");
		standardMacros.put("scp", "Science of Computer Programming");
		standardMacros.put("sicomp", "SIAM Journal on Computing");
		standardMacros.put("tocs", "ACM Transactions on Computer Systems");
		standardMacros.put("tods", "ACM Transactions on Database Systems");
		standardMacros.put("tog", "ACM Transactions on Graphics");
		standardMacros.put("toms", "ACM Transactions on Mathematical Software");
		standardMacros.put("toois", "ACM Transactions on Office Information Systems");
		standardMacros.put(
			"toplas",
			"ACM Transactions on Programming Languages and Systems");
		standardMacros.put("tcs", "Theoretical Computer Science");
	}

	public static boolean isStandardMacro(String macroName) {
	    
	    assert macroName!=null: "macroName parameter may not be null.";
	    
		return BibtexStandardMacros.standardMacros.containsKey(macroName);
	}

	public static String resolveStandardMacro(String macroName) {
	    
	    assert macroName!=null: "macroName parameter may not be null.";
	    
		return (String) standardMacros.get(macroName);
	}
}
