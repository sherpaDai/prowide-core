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
import java.util.Currency;
import com.prowidesoftware.swift.model.field.CurrencyContainer;
import java.math.BigDecimal;
import com.prowidesoftware.swift.model.field.AmountContainer;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.field.SwiftParseUtils;
import com.prowidesoftware.swift.model.field.CurrencyResolver;
import com.prowidesoftware.swift.model.field.AmountResolver;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 32B<br /><br />
 *
 * validation pattern: &lt;CUR&gt;&lt;AMOUNT&gt;15<br />
 * parser pattern: SN<br />
 * components pattern: CN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Currency</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * <em>This class complies with standard release SRU2016</em>
 *
 */
@SuppressWarnings("unused") 
@Generated
public class Field32B extends Field implements Serializable, CurrencyContainer, AmountContainer {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2016;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 32B
	 */
    public static final String NAME = "32B";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_32B = "32B";
	public static final String PARSER_PATTERN ="SN";
	public static final String COMPONENTS_PATTERN = "CN";

	/**
	 * Component number for the Currency subfield
	 */
	public static final Integer CURRENCY = 1;

	/**
	 * Component number for the Amount subfield
	 */
	public static final Integer AMOUNT = 2;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field32B() {
		super(2);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field32B(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field32B(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "32B")) {
			throw new IllegalArgumentException("cannot create field 32B from tag "+tag.getName()+", tagname must match the name of the field.");
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
		init(2);
		setComponent1(SwiftParseUtils.getAlphaPrefix(value));
		setComponent2(SwiftParseUtils.getNumericSuffix(value));
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field32B newInstance(Field32B source) {
		Field32B cp = new Field32B();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(joinComponents());
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
	 * Get the component1 as Currency
	 * @return the component1 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getComponent1AsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(1));
	}

	/**
	 * Get the Currency (component1).
	 * @return the Currency from component1
	 */
	public String getCurrency() {
		return getComponent(1);
	}
	
	/**
	 * Get the Currency (component1) as Currency
	 * @return the Currency from component1 converted to Currency or <code>null</code> if cannot be converted
	 */
	public java.util.Currency getCurrencyAsCurrency() {
		return SwiftFormatUtils.getCurrency(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field32B setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1 from a Currency object.
	 * <br />
	 * Parses the Number into a SWIFT amount with truncated zero decimals and mandatory decimal separator.
	 * <ul>
	 * 	<li>Example: 1234.00 -> 1234,</li>
	 * 	<li>Example: 1234 -> 1234,</li>
	 * 	<li>Example: 1234.56 -> 1234,56</li>
	 * </ul>
	 * @param component1 the Currency with the component1 content to set
	 */
	public Field32B setComponent1(java.util.Currency component1) {
		setComponent(1, SwiftFormatUtils.getCurrency(component1));
		return this;
	}
	
	/**
	 * Set the Currency (component1).
	 * @param component1 the Currency to set
	 */
	public Field32B setCurrency(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Currency (component1) from a Currency object.
	 * @see #setComponent1(java.util.Currency)
	 * @param component1 Currency with the Currency content to set
	 */
	public Field32B setCurrency(java.util.Currency component1) {
		setComponent1(component1);
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
	 * Get the Amount (component2).
	 * @return the Amount from component2
	 */
	public String getAmount() {
		return getComponent(2);
	}
	
	/**
	 * Get the Amount (component2) as Number
	 * @return the Amount from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getAmountAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field32B setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2 from a Number object.
	 * <br />
	 * Parses the Number into a SWIFT amount with truncated zero decimals and mandatory decimal separator.
	 * <ul>
	 * 	<li>Example: 1234.00 -> 1234,</li>
	 * 	<li>Example: 1234 -> 1234,</li>
	 * 	<li>Example: 1234.56 -> 1234,56</li>
	 * </ul>
	 * @param component2 the Number with the component2 content to set
	 */
	public Field32B setComponent2(java.lang.Number component2) {
		setComponent(2, SwiftFormatUtils.getNumber(component2));
		return this;
	}
	
	/**
	 * Set the Amount (component2).
	 * @param component2 the Amount to set
	 */
	public Field32B setAmount(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Amount (component2) from a Number object.
	 * @see #setComponent2(java.lang.Number)
	 * @param component2 Number with the Amount content to set
	 */
	public Field32B setAmount(java.lang.Number component2) {
		setComponent2(component2);
		return this;
	}
    
	public List<String> currencyStrings() {
		List<String> result = new ArrayList<String>();
		result = CurrencyResolver.resolveComponentsPattern(COMPONENTS_PATTERN, components);
		return result;
	}

	public List<Currency> currencies() {
		final List<String> l = currencyStrings();
		if (l.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final ArrayList<Currency> result = new ArrayList<Currency>();
		for (String s: l) {
			result.add(Currency.getInstance(s));
		}
		return result;
	}
    
	public Currency currency() {
		return CurrencyResolver.resolveCurrency(this);
	}

	public String currencyString() {
		return CurrencyResolver.resolveCurrencyString(this);
	}

	public void initializeCurrencies(String cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}

	public void initializeCurrencies(Currency cur) {
		CurrencyResolver.resolveSetCurrency(this, cur);
	}
    
	public List<BigDecimal> amounts() {
		return AmountResolver.amounts(this);
	}
	public BigDecimal amount() {
		return AmountResolver.amount(this);
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
	 * @return the static value of Field32B.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field32B.COMPONENTS_PATTERN
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
		return "<CUR><AMOUNT>15";
	}

	/**
	 * Get the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field32B get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field32B(t) ;
	}
	
	/**
	 * Get the first instance of Field32B in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field32B get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32B in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field32B> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field32B from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field32B> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field32B> result = new java.util.ArrayList<Field32B>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field32B(f));
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
		return 2;
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
		if (component < 1 || component > 2) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 32B");
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
		result.add("Currency");
		result.add("Amount");
		return result;
	}
	

}
