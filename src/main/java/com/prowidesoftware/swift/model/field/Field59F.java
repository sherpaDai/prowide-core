/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
 package com.prowidesoftware.swift.model.field;

import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.field.SwiftParseUtils;
import com.prowidesoftware.swift.model.field.CurrencyResolver;
import com.prowidesoftware.swift.model.field.AmountResolver;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 59F<br /><br />
 *
 * validation pattern: CUSTOM<br />
 * parser pattern: [/S$]N/S[$N/S$]0-3<br />
 * components pattern: SNSNSNSNS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>Number</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>Number</code></li> 
 * 		<li>component7: <code>String</code></li> 
 * 		<li>component8: <code>Number</code></li> 
 * 		<li>component9: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * <em>This class complies with standard release SRU2016</em>
 *
 */
@SuppressWarnings("unused") 
@Generated
public class Field59F extends Field implements Serializable, com.prowidesoftware.swift.model.field.MultiLineField {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2016;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 59F
	 */
    public static final String NAME = "59F";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_59F = "59F";
	public static final String PARSER_PATTERN ="[/S$]N/S[$N/S$]0-3";
	public static final String COMPONENTS_PATTERN = "SNSNSNSNS";

	/**
	 * Component number for the Account subfield
	 */
	public static final Integer ACCOUNT = 1;

	/**
	 * Component number for the Number 1 subfield
	 */
	public static final Integer NUMBER_1 = 2;

	/**
	 * Component number for the Name And Address 1 subfield
	 */
	public static final Integer NAME_AND_ADDRESS_1 = 3;

	/**
	 * Component number for the Number 2 subfield
	 */
	public static final Integer NUMBER_2 = 4;

	/**
	 * Component number for the Name And Address 2 subfield
	 */
	public static final Integer NAME_AND_ADDRESS_2 = 5;

	/**
	 * Component number for the Number 3 subfield
	 */
	public static final Integer NUMBER_3 = 6;

	/**
	 * Component number for the Name And Address 3 subfield
	 */
	public static final Integer NAME_AND_ADDRESS_3 = 7;

	/**
	 * Component number for the Number 4 subfield
	 */
	public static final Integer NUMBER_4 = 8;

	/**
	 * Component number for the Name And Address 4 subfield
	 */
	public static final Integer NAME_AND_ADDRESS_4 = 9;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field59F() {
		super(9);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field59F(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field59F(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "59F")) {
			throw new IllegalArgumentException("cannot create field 59F from tag "+tag.getName()+", tagname must match the name of the field.");
		}
		parse(tag.getValue());
	}
	
	/**
	 * Parses the parameter value into the internal components structure.
	 * Used to update all components from a full new value, as an alternative
	 * to setting individual components. Previous components value is overwritten.
	 * @param value complete field value including separators and CRLF
	 * @since 7.8
	 */
	@Override
	public void parse(final String value) {
		init(9);
		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		int component = 2;
		for (int i=0; i<lines.size(); i++) {
			if (i == 0 && lines.get(0).startsWith("/")) {
				setComponent1(org.apache.commons.lang.StringUtils.trimToNull(org.apache.commons.lang.StringUtils.substring(lines.get(0), 1)));
			} else {
				setComponent(component++, SwiftParseUtils.getTokenFirst(lines.get(i), "/"));
				setComponent(component++, SwiftParseUtils.getTokenSecondLast(lines.get(i), "/"));
			}
		}
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field59F newInstance(Field59F source) {
		Field59F cp = new Field59F();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		if (StringUtils.isNotEmpty(getComponent1())) {
			result.append("/");
			result.append(StringUtils.trimToEmpty(getComponent1()));
		}
		for (int comp = 2; comp<=8; comp++) {
			if (StringUtils.isNotEmpty(getComponent(comp)) || StringUtils.isNotEmpty(getComponent(comp+1))) {
				if (result.length() > 0) {
					result.append(com.prowidesoftware.swift.io.writer.FINWriterVisitor.SWIFT_EOL);				
				}
				result.append(StringUtils.trimToEmpty(getComponent(comp)));
				result.append('/');
				result.append(StringUtils.trimToEmpty(getComponent(comp+1)));
				comp++;
			}
		}
		return result.toString();
	}

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}
	
	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Account (component1) removing its starting slashes if any.
	 * @return the Account from component1
	 */
	public String getAccount() {
		String c = getComponent(1);
		if (c != null) {
			for (int i=0; i<c.length(); i++) {
				if (c.charAt(i) != '/') {
					return c.substring(i);
				}
			}
			return "";
		}
		return null;
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field59F setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Account (component1).
	 * @param component1 the Account to set
	 */
	public Field59F setAccount(String component1) {
		setComponent(1, component1);
		return this;
	}
	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Get the Number 1 (component2).
	 * @return the Number 1 from component2
	 */
	public String getNumber1() {
		return getComponent(2);
	}
	
	/**
	 * Get the Number 1 (component2) as Number
	 * @return the Number 1 from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getNumber1AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field59F setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent2(String) 
	 * method.
	 * 
	 * @see #setComponent2(String)
	 *
	 * @param component2 the Number with the component2 content to set
	 */
	public Field59F setComponent2(java.lang.Number component2) {
		if (component2 != null) {
			setComponent(2, ""+component2.intValue());
		}
		return this;
	}
	
	/**
	 * Set the Number 1 (component2).
	 * @param component2 the Number 1 to set
	 */
	public Field59F setNumber1(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Number 1 (component2) from a Number object.
	 * @see #setComponent2(java.lang.Number)
	 * @param component2 Number with the Number 1 content to set
	 */
	public Field59F setNumber1(java.lang.Number component2) {
		setComponent2(component2);
		return this;
	}
	/**
	 * Get the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Same as getComponent(3)
	 */
	@Deprecated
	public java.lang.String getComponent3AsString() {
		return getComponent(3);
	}

	/**
	 * Get the Name And Address 1 (component3).
	 * @return the Name And Address 1 from component3
	 */
	public String getNameAndAddress1() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field59F setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Name And Address 1 (component3).
	 * @param component3 the Name And Address 1 to set
	 */
	public Field59F setNameAndAddress1(String component3) {
		setComponent(3, component3);
		return this;
	}
	/**
	 * Get the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Get the component4 as Number
	 * @return the component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Get the Number 2 (component4).
	 * @return the Number 2 from component4
	 */
	public String getNumber2() {
		return getComponent(4);
	}
	
	/**
	 * Get the Number 2 (component4) as Number
	 * @return the Number 2 from component4 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getNumber2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field59F setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent4(String) 
	 * method.
	 * 
	 * @see #setComponent4(String)
	 *
	 * @param component4 the Number with the component4 content to set
	 */
	public Field59F setComponent4(java.lang.Number component4) {
		if (component4 != null) {
			setComponent(4, ""+component4.intValue());
		}
		return this;
	}
	
	/**
	 * Set the Number 2 (component4).
	 * @param component4 the Number 2 to set
	 */
	public Field59F setNumber2(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Number 2 (component4) from a Number object.
	 * @see #setComponent4(java.lang.Number)
	 * @param component4 Number with the Number 2 content to set
	 */
	public Field59F setNumber2(java.lang.Number component4) {
		setComponent4(component4);
		return this;
	}
	/**
	 * Get the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Same as getComponent(5)
	 */
	@Deprecated
	public java.lang.String getComponent5AsString() {
		return getComponent(5);
	}

	/**
	 * Get the Name And Address 2 (component5).
	 * @return the Name And Address 2 from component5
	 */
	public String getNameAndAddress2() {
		return getComponent(5);
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field59F setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Name And Address 2 (component5).
	 * @param component5 the Name And Address 2 to set
	 */
	public Field59F setNameAndAddress2(String component5) {
		setComponent(5, component5);
		return this;
	}
	/**
	 * Get the component6
	 * @return the component6
	 */
	public String getComponent6() {
		return getComponent(6);
	}

	/**
	 * Get the component6 as Number
	 * @return the component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent6AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Get the Number 3 (component6).
	 * @return the Number 3 from component6
	 */
	public String getNumber3() {
		return getComponent(6);
	}
	
	/**
	 * Get the Number 3 (component6) as Number
	 * @return the Number 3 from component6 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getNumber3AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field59F setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent6(String) 
	 * method.
	 * 
	 * @see #setComponent6(String)
	 *
	 * @param component6 the Number with the component6 content to set
	 */
	public Field59F setComponent6(java.lang.Number component6) {
		if (component6 != null) {
			setComponent(6, ""+component6.intValue());
		}
		return this;
	}
	
	/**
	 * Set the Number 3 (component6).
	 * @param component6 the Number 3 to set
	 */
	public Field59F setNumber3(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the Number 3 (component6) from a Number object.
	 * @see #setComponent6(java.lang.Number)
	 * @param component6 Number with the Number 3 content to set
	 */
	public Field59F setNumber3(java.lang.Number component6) {
		setComponent6(component6);
		return this;
	}
	/**
	 * Get the component7
	 * @return the component7
	 */
	public String getComponent7() {
		return getComponent(7);
	}

	/**
	 * Same as getComponent(7)
	 */
	@Deprecated
	public java.lang.String getComponent7AsString() {
		return getComponent(7);
	}

	/**
	 * Get the Name And Address 3 (component7).
	 * @return the Name And Address 3 from component7
	 */
	public String getNameAndAddress3() {
		return getComponent(7);
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field59F setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}
	
	/**
	 * Set the Name And Address 3 (component7).
	 * @param component7 the Name And Address 3 to set
	 */
	public Field59F setNameAndAddress3(String component7) {
		setComponent(7, component7);
		return this;
	}
	/**
	 * Get the component8
	 * @return the component8
	 */
	public String getComponent8() {
		return getComponent(8);
	}

	/**
	 * Get the component8 as Number
	 * @return the component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent8AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Get the Number 4 (component8).
	 * @return the Number 4 from component8
	 */
	public String getNumber4() {
		return getComponent(8);
	}
	
	/**
	 * Get the Number 4 (component8) as Number
	 * @return the Number 4 from component8 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getNumber4AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(8));
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field59F setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the component8 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent8(String) 
	 * method.
	 * 
	 * @see #setComponent8(String)
	 *
	 * @param component8 the Number with the component8 content to set
	 */
	public Field59F setComponent8(java.lang.Number component8) {
		if (component8 != null) {
			setComponent(8, ""+component8.intValue());
		}
		return this;
	}
	
	/**
	 * Set the Number 4 (component8).
	 * @param component8 the Number 4 to set
	 */
	public Field59F setNumber4(String component8) {
		setComponent(8, component8);
		return this;
	}
	
	/**
	 * Set the Number 4 (component8) from a Number object.
	 * @see #setComponent8(java.lang.Number)
	 * @param component8 Number with the Number 4 content to set
	 */
	public Field59F setNumber4(java.lang.Number component8) {
		setComponent8(component8);
		return this;
	}
	/**
	 * Get the component9
	 * @return the component9
	 */
	public String getComponent9() {
		return getComponent(9);
	}

	/**
	 * Same as getComponent(9)
	 */
	@Deprecated
	public java.lang.String getComponent9AsString() {
		return getComponent(9);
	}

	/**
	 * Get the Name And Address 4 (component9).
	 * @return the Name And Address 4 from component9
	 */
	public String getNameAndAddress4() {
		return getComponent(9);
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field59F setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}
	
	/**
	 * Set the Name And Address 4 (component9).
	 * @param component9 the Name And Address 4 to set
	 */
	public Field59F setNameAndAddress4(String component9) {
		setComponent(9, component9);
		return this;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       if (component == 1) {
           return true;
       }
       if (component == 4) {
           return true;
       }
       if (component == 5) {
           return true;
       }
       if (component == 6) {
           return true;
       }
       if (component == 7) {
           return true;
       }
       if (component == 8) {
           return true;
       }
       if (component == 9) {
           return true;
       }
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	 * Returns the field's name composed by the field number and the letter option (if any)
	 * @return the static value of Field59F.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field59F.COMPONENTS_PATTERN
	 */
	@Override
	public final String componentsPattern() {
		return COMPONENTS_PATTERN;
	}

	/**
	 * Returns the field's validators pattern
	 */
	@Override
	public final String validatorPattern() {
		return "CUSTOM";
	}

	/**
	 * Get the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field59F get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field59F(t) ;
	}
	
	/**
	 * Get the first instance of Field59F in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field59F get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field59F in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field59F> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field59F from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field59F> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field59F> result = new java.util.ArrayList<Field59F>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field59F(f));
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	/**
	 * Returns the defined amount of components.<br>
	 * This is not the amount of components present in the field instance, but the total amount of components 
	 * that this field accepts as defined. 
	 * @since 7.7
	 */
	@Override
	public int componentsSize() {
		return 9;
	}
	
	/**
	 * Returns a specific line from the field's value.<br>
	 *
	 * @see MultiLineField#getLine(int)
	 * @param line a reference to a specific line in the field, first line being 1
	 * @return line content or null if not present or if line number is above the expected
	 * @since 7.7
	 */
	public String getLine(int line) {
		return getLine(line, 0);
	}
	
	/**
	 * Returns a specific line from the field's value.<br>
	 * 
	 * @see MultiLineField#getLine(int, int)
	 * @param line a reference to a specific line in the field, first line being 1
	 * @param offset an optional component number used as offset when counting lines
	 * @return line content or null if not present or if line number is above the expected
	 * @since 7.7
	 */
	public String getLine(int line, int offset) {
		Field59F cp = newInstance(this);
		return getLine(cp, line, null, offset);
	}
	
	/**
	 * Returns the field value split into lines.<br>
	 *
	 * @see MultiLineField#getLines()
	 * @return lines content or empty list if field's value is empty
	 * @since 7.7
	 */
	public List<String> getLines() {
		return SwiftParseUtils.getLines(getValue());
	}

	/**
	 * Returns the field value starting at the offset component, split into lines.<br>
	 *
	 * @see MultiLineField#getLines(int)
	 * @param offset an optional component number used as offset when counting lines
	 * @return found lines or empty list if lines are not present or the offset is invalid
	 * @since 7.7
	 */
	public List<String> getLines(int offset) {
		Field59F cp = newInstance(this);
		return SwiftParseUtils.getLines(getLine(cp, null, null, offset));
	}
	
	/**
	 * Returns a specific subset of lines from the field's value, given a range.<br>
	 *
	 * @see MultiLineField#getLinesBetween(int, int )
	 * @param start a reference to a specific line in the field, first line being 1
	 * @param end a reference to a specific line in the field, must be greater than start
	 * @return found lines or empty list if value is empty
	 * @since 7.7
	 */
	public List<String> getLinesBetween(int start, int end) {
		return getLinesBetween(start, end, 0);
	}

	/**
	 * Returns a specific subset of lines from the field's value, starting at the offset component.<br>
	 *
	 * @see MultiLineField#getLinesBetween(int start, int end, int offset)
	 * @param start a reference to a specific line in the field, first line being 1
	 * @param end a reference to a specific line in the field, must be greater than start
	 * @param offset an optional component number used as offset when counting lines
	 * @return found lines or empty list if lines are not present or the offset is invalid
	 * @since 7.7
	 */
	public List<String> getLinesBetween(int start, int end, int offset) {
		Field59F cp = newInstance(this);
		return SwiftParseUtils.getLines(getLine(cp, start, end, offset));
	}
	

	/**
	 * Returns a localized suitable for showing to humans string of a field component.<br>
	 *
	 * @param component number of the component to display
	 * @param locale optional locale to format date and amounts, if null, the default locale is used
	 * @return formatted component value or null if component number is invalid or not present
	 * @throws IllegalArgumentException if component number is invalid for the field
	 * @since 7.8
	 */
	@Override
	public String getValueDisplay(int component, Locale locale) {
		if (component < 1 || component > 9) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 59F");
		}
		if (locale == null) {
			locale = Locale.getDefault();
		}
		if (component == 1) {
			//default format (as is)
			return getComponent(1);
		}
		if (component == 2) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(locale);
    		Number n = getComponent2AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 3) {
			//default format (as is)
			return getComponent(3);
		}
		if (component == 4) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(locale);
    		Number n = getComponent4AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 5) {
			//default format (as is)
			return getComponent(5);
		}
		if (component == 6) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(locale);
    		Number n = getComponent6AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 7) {
			//default format (as is)
			return getComponent(7);
		}
		if (component == 8) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(locale);
    		Number n = getComponent8AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 9) {
			//default format (as is)
			return getComponent(9);
		}
		return null;	
	}
	
	/**
	 * Returns english label for components.
	 * <br />
	 * The index in the list is in sync with specific field component structure.
	 * @see #getComponentLabel(int)
	 * @since 7.8.4
	 */
	@Override
	protected List<String> getComponentLabels() {
		List<String> result = new ArrayList<String>();
		result.add("Account");
		result.add("Number 1");
		result.add("Name And Address 1");
		result.add("Number 2");
		result.add("Name And Address 2");
		result.add("Number 3");
		result.add("Name And Address 3");
		result.add("Number 4");
		result.add("Name And Address 4");
		return result;
	}
	

}
