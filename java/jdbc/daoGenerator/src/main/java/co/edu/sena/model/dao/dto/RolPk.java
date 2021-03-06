/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the rol table.
 */
public class RolPk implements Serializable
{
	protected String idRol;

	/** 
	 * Sets the value of idRol
	 */
	public void setIdRol(String idRol)
	{
		this.idRol = idRol;
	}

	/** 
	 * Gets the value of idRol
	 */
	public String getIdRol()
	{
		return idRol;
	}

	/**
	 * Method 'RolPk'
	 * 
	 */
	public RolPk()
	{
	}

	/**
	 * Method 'RolPk'
	 * 
	 * @param idRol
	 */
	public RolPk(final String idRol)
	{
		this.idRol = idRol;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof RolPk)) {
			return false;
		}
		
		final RolPk _cast = (RolPk) _other;
		if (idRol == null ? _cast.idRol != idRol : !idRol.equals( _cast.idRol )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idRol != null) {
			_hashCode = 29 * _hashCode + idRol.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.RolPk: " );
		ret.append( "idRol=" + idRol );
		return ret.toString();
	}

}
