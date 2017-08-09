package com.stackroute.datamunger;

import java.util.Arrays;
import java.util.Scanner;

public class DataMunger {

	public static void main(String[] args) {
		// creating the object for DataMunger class
		DataMunger dataMunger = new DataMunger();
		// read the query from the user into queryString variable
		Scanner sc = new Scanner(System.in);
		// user input stored in the queryString variable
		String queryString = sc.next();
		// call the parseQuery method and pass the queryString variable as a parameter
		dataMunger.parseQuery(queryString);
		// close the resource
		sc.close();

	}

	public void parseQuery(String queryString) {
		// call the methods
		getSplitStrings(queryString);
		getFile(queryString);
		getBaseQuery(queryString);
		getConditionsPartQuery(queryString);
		getConditions(queryString);
		getLogicalOperators(queryString);
		getFields(queryString);
		getOrderByFields(queryString);
		getGroupByFields(queryString);
		getAggregateFunctions(queryString);
	}

	// parse the queryString into words and display
	public String[] getSplitStrings(String queryString) {

		// converting the query string to lower case
		queryString = queryString.toLowerCase();
		// split on the basis of space and store it in array of string
		String[] splittedString = queryString.split("\\s+");
		return splittedString;
	}

	// get and display the filename
	public String getFile(String queryString) {
		// convert it into lower case
		queryString = queryString.toLowerCase();
		String fileName = queryString.split("from")[1].split("\\s+")[1];
		return fileName;
	}

	// getting the baseQuery and display
	public String getBaseQuery(String queryString) {
		queryString = queryString.toLowerCase();
		String baseQuery = queryString.split("where |order by|group by")[0];
		return baseQuery;

	}

	// get and display the where conditions part(if where condition exists)
	public String getConditionsPartQuery(String queryString) {

		return null;

	}

	/*
	 * parse the where conditions and display the propertyName, propertyValue and
	 * conditionalOperator for each conditions
	 */
	public String[] getConditions(String queryString) {

		return null;
	}

	// get the logical operators(applicable only if multiple conditions exist)
	public String[] getLogicalOperators(String queryString) {

		return null;

	}

	/* get the fields from the select clause */
	public String[] getFields(String queryString) {
		// convert into lower case
		queryString = queryString.toLowerCase();
		String[] fields = queryString.split("select")[1].trim().split("from")[0].split("[\\s,]+");

		return fields;

	}

	// get order by fields if order by clause exists
	public String[] getOrderByFields(String queryString) {
		queryString = queryString.toLowerCase();
		String [] orderByFields=queryString.split("order by")[1].split("[\\s,]+");
		return orderByFields;
	}

	// get group by fields if group by clause exists
	public String[] getGroupByFields(String queryString) {
		queryString = queryString.toLowerCase();
		String [] groupByFields=queryString.split("group by\\s+")[1].split("[\\s,]+");	

		return groupByFields;
	}

	// parse and display aggregate functions(if applicable)
	public String[] getAggregateFunctions(String queryString) {

		return null;
	}

}