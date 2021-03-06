/* **************************************************************************
*
* Copyright (C) 2002-2005 Octet String, Inc. All Rights Reserved.
*
* THIS WORK IS SUBJECT TO U.S. AND INTERNATIONAL COPYRIGHT LAWS AND
* TREATIES. USE, MODIFICATION, AND REDISTRIBUTION OF THIS WORK IS SUBJECT
* TO VERSION 2.0.1 OF THE OPENLDAP PUBLIC LICENSE, A COPY OF WHICH IS
* AVAILABLE AT HTTP://WWW.OPENLDAP.ORG/LICENSE.HTML OR IN THE FILE "LICENSE"
* IN THE TOP-LEVEL DIRECTORY OF THE DISTRIBUTION. ANY USE OR EXPLOITATION
* OF THIS WORK OTHER THAN AS AUTHORIZED IN VERSION 2.0.1 OF THE OPENLDAP
* PUBLIC LICENSE, OR OTHER PRIOR WRITTEN CONSENT FROM OCTET STRING, INC., 
* COULD SUBJECT THE PERPETRATOR TO CRIMINAL AND CIVIL LIABILITY.
******************************************************************************/
package com.octetstring.jdbcLdap.browser;

import com.octetstring.jdbcLdap.jndi.*;
/**
 * @author Marc Boorshtein
 *
 */
class ConnectionStore {
	JndiLdapConnection con;
	String server;
	String port;
	String base;
	String user;
	String pass;
	boolean followReferrals;
	boolean isDsml;
	boolean isSSL;
	public boolean isSpml;
	public boolean isJDBC;
	public String extraUrl;
}
