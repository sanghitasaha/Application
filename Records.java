package com;
import java.util.*;
public class Records {
private String name;
private int patientId;
private List<String> diseases;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public List<String> getDiseases() {
	return diseases;
}
public void setDiseases(List<String> diseases) {
	this.diseases = diseases;
}
@Override
public String toString() {
	return "Records [name=" + name + ", patientId=" + patientId + ", diseases=" + diseases + "]";
}
public Records(String name, int patientId, List<String> diseases) {
	super();
	this.name = name;
	this.patientId = patientId;
	this.diseases = diseases;
}
}
